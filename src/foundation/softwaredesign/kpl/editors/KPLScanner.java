package foundation.softwaredesign.kpl.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class KPLScanner extends RuleBasedScanner {

	public KPLScanner() {
		
		List<IRule> rules= new ArrayList<IRule>(); 
		
		Token keyword = new Token(new TextAttribute(KPLEditorElements.KEYWORD, null, SWT.BOLD));
		Token comment = new Token(new TextAttribute(KPLEditorElements.COMMENT));
		Token string = new Token(new TextAttribute(KPLEditorElements.STRING));
		
		WordRule rule = new WordRule(new IWordDetector() {
			@Override
			public boolean isWordStart(char c) {
				return Character.isJavaIdentifierStart(c);
			}

			@Override
			public boolean isWordPart(char c) {
				return Character.isJavaIdentifierPart(c);
			}
		});

		// add tokens for each reserved word
		
		for (int n = 0; n < KPLParser.KEYWORDS.length; n++) {
			rule.addWord(KPLParser.KEYWORDS[n], keyword);
		}
		
		rules.add(rule);
		
		rules.add(new SingleLineRule("--", null, comment));
		rules.add(new MultiLineRule("/*", "*/", comment));
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		rules.add(new SingleLineRule("'", "'", string, '\\'));
		rules.add(new WhitespaceRule(new IWhitespaceDetector() {
			@Override
			public boolean isWhitespace(char c) {
				return Character.isWhitespace(c);
			}
		}));
		setRules(rules.toArray(new IRule[0]));
	}

}
