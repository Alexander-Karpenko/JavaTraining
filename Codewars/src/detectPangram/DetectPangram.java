package detectPangram;

public class DetectPangram {
	public static boolean check(String sentence){
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
 }
	/*public static boolean detectPangram (String str) {
		char alphabet [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char strArray [] = str.toLowerCase().toCharArray(); 
		int[] compareLetters = new int [26];
		for (int i = 0; i < compareLetters.length; i++) {
			compareLetters[i] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (strArray[i] == alphabet[j]) {
					compareLetters[j] = 1;
				}
			}
		}
		for (int i = 0; i < compareLetters.length; i++) {
			if (compareLetters[i] == 0) {
				return false;
			}
		}
		return true;
		
		/*String LettersWithSpace = "";
		for (int i = 0; i < onlyLettersArray.length; i++) {
			LettersWithSpace += onlyLettersArray[i];
		}
		String onlyLetters= LettersWithSpace.replace(" ", ""); 
		
		char lettersArray [] = onlyLetters.toCharArray(); 
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (strArray[i] == alphabet[j]) {
					onlyLettersArray[i] =  alphabet[j];
					break;
				}else 
				if (strArray[i] == alphabetCaps[j]) {
					onlyLettersArray[i] =  alphabet[j];
					break;
				}else {
					onlyLettersArray[i] = ' ';
				}
			}
		}
		
		
		return onlyLetters;*/
	//}
	public static void main(String[] args) {
			String str = "The 0quick8 brown @fox jumps!bover a lazy dog.";
			//char onlyLetters [] = new char[str.length()];
			//String onlyLetters = detectPangram(str);
			System.out.print(check(str));
	}
}
