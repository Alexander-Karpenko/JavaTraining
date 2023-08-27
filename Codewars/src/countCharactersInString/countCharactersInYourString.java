package countCharactersInString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class countCharactersInYourString {

	public static String countCharactersInString (String str) {
		String res = "{";
		
		char letters [] = str.toCharArray();
		int count = 0;
		List<Character> letterList = new LinkedList<>();
		List<Integer> countList = new LinkedList<>();
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
			if (letters[i] == letters[j]) {
				count ++;
			}
		}
			if(!letterList.contains(letters[i])) {
		letterList.add(letters[i]);
		countList.add(count);
		}
		count = 0;
	}
		
		for (int i = 0; i < countList.size(); i++) {
			res += "'" + letterList.get(i) + "'" + " : " + countList.get(i) + ", ";
		}
		res += "}";
		return res;
	}
	
	
	public static Map<Character, Integer> count(String str){
		Map<Character, Integer> d = new HashMap<>();
		
		char letters [] = str.toCharArray();
		int count = 0;
		List<Character> letterList = new LinkedList<>();
		List<Integer> countList = new LinkedList<>();
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
			if (letters[i] == letters[j]) {
				count ++;
			}
		}
			if(!letterList.contains(letters[i])) {
		d.put(letters[i], count);
		}
		count = 0;
	}
		return null;
		
	}

	public static void main(String[] args) {
		String str = "";
		System.out.println(countCharactersInString(str));
		
	}

}
