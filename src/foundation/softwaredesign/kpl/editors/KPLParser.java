package foundation.softwaredesign.kpl.editors;

public class KPLParser {
	public final static String[] KEYWORDS = new String[]{
		"code", "endCode", 
		"function", "endFunction", 
		"class", "endClass", 
		"behavior", "endBehavior",
		"if", "endIf",
		"for", "endFor",
		"while", "endWhile",
		"record", "endRecord",
		"header", "endHeader",
		"method", "endMethod",
		"package", "endPackage", "renaming", "uses", "to",
		"try", "endTry", "catch", "throw",
		"interface", "endInterface",
		"begin", "end",
		"continue", "break", "return", "errors",
		"int", "byte", "word", "String", "char", "double", "bool",
		"type", "array", "ptr", "to", "allow", "new", "of", "var",
		"arraySize", "asInteger", "asPtrTo", "external", "returns",
		"superclass", "fields", "implements", "methods", "self", "functions",
		"infix", "prefix", "isKindOf", "asInteger", "true", "false", "null",
		"sizeOf", "const", "enum", "anyType", "debug", "print"
	};

}
