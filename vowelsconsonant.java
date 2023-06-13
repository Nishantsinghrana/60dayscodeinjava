package Stringques;

public class Vowelconsonant {

	public static void main(String[] args) {
		String sen="The quick brown fox jumps over the lazy dog" ;
		String str= sen.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
				vcount++;
			}
			
		     else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	              
	                ccount++;    
	            }    
	}
		 System.out.println("Number of vowels: " + vcount);    
	        System.out.println("Number of consonants: " + ccount);   

}
	}
