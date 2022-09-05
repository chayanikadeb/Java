
public class Vowal {

	
	
	public static void main(String[] args) {
		
		String a = "Hello";
		
		boolean iVowel = false;
		a= a.toLowerCase();
		for (int i=0; i<a.length() ; i++)
		{
			
			if (a.charAt(i) =='a' || a.charAt(i) =='e' || a.charAt(i) =='i' || a.charAt(i) =='o' || a.charAt(i) =='u' )
				iVowel = true;
				break;
				
			
		}
      if (iVowel) System.out.println("Vowel");
      else System.out.println("No vowel found");
	}
}
