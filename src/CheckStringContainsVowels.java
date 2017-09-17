
public class CheckStringContainsVowels {

	public static void main(String args[]){
		String name = "Krutika" ;
		int vowel = 0, consonant = 0;
		for(int i = 0; i < name.length(); i++){
			char c = name.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("Number of vowels and consonants are " + vowel + " and " + consonant + " in " + name + " respectively");
	}
}
