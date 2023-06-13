package Stringques;

public class Punctuationchar {

	public static void main(String[] args) {
		String sen = "“Have you a pen I can borrow?” she asked.";
		int count = 0;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)=='!'|| sen.charAt(i)==';'||sen.charAt(i)==','|| sen.charAt(i)=='?'|| sen.charAt(i) == '.'|| sen.charAt(i) == '\'' || sen.charAt(i) == '\"' || sen.charAt(i) == ':') {
				count++;
			}
		}
System.out.println("The Number of Punctuation Character is in the Sentence are"+" "+count);
	}

}
