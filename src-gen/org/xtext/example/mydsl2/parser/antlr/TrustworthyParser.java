/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl2.parser.antlr.internal.InternalTrustworthyParser;
import org.xtext.example.mydsl2.services.TrustworthyGrammarAccess;

public class TrustworthyParser extends AbstractAntlrParser {

	@Inject
	private TrustworthyGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTrustworthyParser createParser(XtextTokenStream stream) {
		return new InternalTrustworthyParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public TrustworthyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TrustworthyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
