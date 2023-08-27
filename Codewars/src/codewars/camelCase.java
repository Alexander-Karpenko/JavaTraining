package codewars;

public class camelCase {

	public static String camelCase(String s) {
		char letters[] = s.toCharArray();
		String res = "";
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == '_' || letters[i] == '-') {
				continue;
			}
			if (i == 0) {
				res += letters[i];
			} else if (letters[i - 1] == '_' || letters[i - 1] == '-') {
				res += Character.toUpperCase(letters[i]);
			} else {
				res += letters[i];
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		String str = "You_have";
		System.out.println(camelCase(str));
	}

}
