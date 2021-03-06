/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl2.trustworthy.Room
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.example.mydsl2.trustworthy.Model
import org.xtext.example.mydsl2.trustworthy.Action
import org.xtext.example.mydsl2.trustworthy.Input
import org.xtext.example.mydsl2.trustworthy.InputBool
import org.xtext.example.mydsl2.trustworthy.InputInt
import org.xtext.example.mydsl2.trustworthy.InputType

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TrustworthyGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val room = resource.allContents.filter(Room).next
		val model = resource.allContents.filter(Model).next
		val action = resource.allContents.filter(Action).next
		val input = resource.allContents.filter(Input).next
		System::out.println("Anything")
		room.generateOutputFile(fsa)
		model.generateOutputFile(fsa)
		input.generateOutputFile(fsa)
		action.generateOutputFile(fsa)

	// model.display
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}

	def void display(EObject obj) {
		val res = new XMLResourceImpl
		res.contents.add(EcoreUtil::copy(obj))
		System::out.println("Dump of model:")
		res.save(System.out, null)
	}

	def dispatch void generateOutputFile(Action action, IFileSystemAccess2 fsa) {
		fsa.generateFile("Action.java", generateClass(action))
	}

	def dispatch generateClass(Action action) {
		'''«generatePackageName»
		import java.util.ArrayList;
		import java.util.List;
		public class Action{
			«IF action.text!==null»«generateActionAttribute(action.text.get(0))» «ENDIF»
			«IF action.next!==null»«generateNextAction(action.next)» «ENDIF»
			
		}'''
	}

	def CharSequence generateNextAction(Action action) {
		'''«IF action.text!==null»«generateActionAttribute(action.text.get(0))»«ENDIF»
		   «IF action.next!==null»«generateNextAction(action.next)» «ENDIF»'''
	}

	def generateActionAttribute(String string) {
		''' private String _«string» = "«string»";
			    
			    public String get«string.toFirstUpper»() {
			        return this._«string»;
			    }'''
	}

	def dispatch void generateOutputFile(Input input, IFileSystemAccess2 fsa) {
		fsa.generateFile("Input.java", generateClass(input))
	}

	def dispatch generateClass(Input input) {
		'''«generatePackageName»
		import java.util.ArrayList;
		import java.util.List;
		public class Input{
			«generateClassVariables(input)»
			public Input(«generateConstructor(input)») {
					«generateAssignment(input)»
				}	
		}'''
	}

	def CharSequence generateConstructor(Input input) {
		'''«generateInputType(input.value)» «input.value.name»«IF input.next !== null», «generateConstructor(input.next)»«ENDIF»'''
	}

	def dispatch generateInputType(InputInt obj) {
		'''int'''
	}

	def dispatch generateInputType(InputBool obj) {
		'''boolean'''
	}

	def CharSequence generateClassVariables(Input input) {
		'''
		«generateClassTypeVariables(input.value)»
		«IF input.next!==null»«generateClassVariables(input.next)»«ENDIF»'''
	}

	def dispatch CharSequence generateClassTypeVariables(InputBool input) {
		'''boolean «input.name»;
public boolean get«input.name.toFirstUpper»() {
	return this.«input.name»;
}'''
	}

	def CharSequence generateAssignment(Input input) {
		'''this.«input.value.name» = «input.value.name»;
«IF input.next !== null»«generateAssignment(input.next)»«ENDIF»'''
	}

	def dispatch CharSequence generateClassTypeVariables(InputInt input) {
		'''int «input.name»;
public int get«input.name.toFirstUpper»() {
	return this.«input.name»;
}'''
	}

	def dispatch void generateOutputFile(Model model, IFileSystemAccess2 fsa) {
		fsa.generateFile("Main.java", generateMain(model))
	}

	def generateMain(Model model) {
		'''«generatePackageName()»
		
		import java.util.ArrayList;
«		   »import java.util.List;
		   
«		   »public class Main {
		   «generateBoolHandler»
		   «generateMainCore(model)»
«		  »}
		'''
	}

	def generateMainCore(Model model) {
		'''public static void main(String[] args){
	assert(args.length == «getInputNumbers(model.input,1)»);			
	«mainInput(model.input,0)»
	Input input = new Input(«handleInputParameter(model.input)»);
        Result result = new Result();
        List<String> results = result.begin(input);

        for (String s : results) {
            System.out.println(s);
        }}'''
	}

	def CharSequence handleInputParameter(Input input) {
		'''«input.value.name»«IF input.next !== null», «handleInputParameter(input.next)»«ENDIF»'''
	}

	def CharSequence mainInput(Input input, int index) {
		'''«handleInput(input.value, index)»
«       »«IF input.next !== null»«mainInput(input.next, index+1)»«ENDIF»'''
	}

	def generateBoolHandler() {
		'''private static boolean handleBool(String s) {
		     if (s.equals("true") || s.equals("1") || s.equals("True") || s.equals("TRUE")) {
		         return true;
		     } else {
		         return false;
		     }
		}'''
	}

	def int getInputNumbers(Input input, int number) {
		if (input.getNext !== null) {
			getInputNumbers(input.getNext, number + 1);
		} else {
			return number;
		}
	}

	def generatePackageName() {
		'''package org.xtext.example.mydsl2;'''
	}

	def dispatch void generateOutputFile(Room room, IFileSystemAccess2 fsa) {
		fsa.generateFile("setup.xml", room.generateRoomContent)
	}

	def CharSequence generateRoomContent(Room room) {
		'''<?xml version="1.0"?>
		<Room>
		    <Number>«room.name»</Number>
		    «FOR a : room.sensors»
		    		    «System::out.println(a)»
		    	«FOR i : 1..a.amount»
		    	<Sensor>
		    			        <UID>«i»</UID>
		    			        <Microphone>
		    			            <OnTimer>300</OnTimer>
		    			            <ListeningTimer>10000</ListeningTimer>
		    			            <SendingTimer>500</SendingTimer>
		    			        </Microphone>
		    			        <Data>
		    			            <SaveTimer>200</SaveTimer>
		    			            <ProcessTimer>5000</ProcessTimer>
		    			        </Data>
		    			        <Wifi>
		    			        	<SSID>«a.ssID»</SSID>
		    			        	<Psw>«a.passwd»</Psw>
		    			        </Wifi>
		    			    </Sensor>	
		    	«ENDFOR»
		    	
		    «ENDFOR»
		    
		</Room>
		'''
	}

	def dispatch CharSequence handleInput(InputBool input, int index) {
		'''boolean «input.getName» = handleBool(args[«index+''»]);'''
	}

	def dispatch CharSequence handleInput(InputInt input, int index) {
		'''int «input.getName» = Integer.parseInt(args[«index+''»]);'''
	}

}
