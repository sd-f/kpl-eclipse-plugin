package foundation.softwaredesign.kpl.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class KPLEditor extends TextEditor {


	public KPLEditor() {
		super();
		setSourceViewerConfiguration(new KPLConfiguration());
		//setDocumentProvider(new KPLDocumentProvider());
	}
	
}
