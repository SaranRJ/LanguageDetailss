package org.all;

public class LanguageClass {

	public void allLanguage() {
		System.out.println("All 3Language");
	}

	public void english() {
		System.out.println("Language:English");
	}
	
	public void tamil() {
		System.out.println("Language: Tamil");
	}
	
	public void telugu() {
		System.out.println("Language: Telugu");
	}
	
	public static void main(String[] args) {

		LanguageClass lang = new LanguageClass();
		
		lang.allLanguage();
		lang.english();
		lang.tamil();
		lang.telugu();
		
	}

}
