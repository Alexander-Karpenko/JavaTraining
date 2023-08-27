package codewars;

import java.util.Iterator;
import java.util.regex.*;

public class StringIncrementer {

	public static boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	
	public static String incrementString(String str) {
	    String findNum = "";
	    String zeroStr = "";
	    String incrementNum = "";
	    String incrementNum2 = "";
	    String parseSubstring = "";
	    String res = "";
	    String n5 = "";
		Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(new StringBuilder(str).reverse());
        if(matcher.find()) {
            findNum = new StringBuilder(matcher.group()).reverse().toString();
        }
        if (isStringInt(str.substring(str.length()-1)) == false) {
        	str = str + "1";
        	return str;
        	}else {
        if(findNum.length() < 20) {
        long num = Long.parseLong(findNum);
        num++;
        incrementNum = Long.toString(num);
        int countZero = findNum.length() - incrementNum.length();
        for (int i = 0; i < countZero; i++) {
			zeroStr += "0";
		}
        res = zeroStr + incrementNum;
        }else {
			parseSubstring = findNum.substring(19);
			long num = Long.parseLong(parseSubstring);
			num++;
			incrementNum2 = Long.toString(num);
			int countZero = parseSubstring.length() - incrementNum2.length();
			for (int i = 0; i < countZero; i++) {
				zeroStr += "0";
			}
			n5 = zeroStr + Long.toString(num);
			
			incrementNum = findNum.replace(parseSubstring, n5);
			res =  incrementNum;
		}
        StringBuilder builder = new StringBuilder(str);		
        int indexOfUmlauts = str.length() - findNum.length() ;
        str = builder.replace(indexOfUmlauts, str.length(), res).toString();
		return str;
        }
	  }
	
	
	public static String incrementString2(String str) {
		String incrementNum = "";
		String numStr = "";
		int count = 1;
		boolean flag = false;
		boolean dFlag = false;
		if (str == "" ) {
			return "1";
		}
		if (isStringInt(str.substring(str.length()-1)) == false) {
        	str = str + "1";
        	return str;
		}
		if (isStringInt(str) == true )
		{
			str = "d" + str;
			dFlag = true;
			//return str;
		}
		numStr = str.substring(str.length() - count);
		long num = Long.parseLong(numStr);
		if(num == 9) {
			if (isStringInt(str.substring(str.length() - count - 1, str.length() - count )) == false) {
				System.out.println("ed");
				flag = true;
			}
		while(num == 9) {
			if (flag == true) {
				num++;
				incrementNum = Long.toString(num);
				StringBuilder builder = new StringBuilder(str);
				str = builder.replace(str.length() - count, str.length() - count + 1, incrementNum).toString();
				break;
			}
			StringBuilder builder = new StringBuilder(str);
			str = builder.replace(str.length() - count, str.length() - count + 1, "0").toString();
			count ++;
			if (isStringInt(str.substring(str.length() - count - 1, str.length() - count )) == false) {
				numStr = str.substring(str.length() - count, str.length() - count + 1);
				num = Long.parseLong(numStr);
				num++;
				incrementNum = Long.toString(num);
				str = builder.replace(str.length() - count, str.length() - count + 1, incrementNum).toString();
				break;
			}
			num = Long.parseLong(str.substring(str.length() - count, str.length() - count + 1));
			if (Long.parseLong(str.substring(str.length() - count , str.length() - count + 1 )) != 9) {
			numStr = str.substring(str.length() - count , str.length() - count + 1);	
			num++;
			incrementNum = Long.toString(num);
			str = builder.replace(str.length() - count, str.length() - count + 1, incrementNum).toString();
			break;
		}	
		}
		}else {
		num++;
		incrementNum = Long.toString(num);
		StringBuilder builder = new StringBuilder(str);
		str = builder.replace(str.length() - count, str.length() - count + 1, incrementNum).toString();
		}
		if (dFlag == true) {
			StringBuilder builder = new StringBuilder(str);
			str = builder.replace(0, 1, "").toString();
		}
		return str;
	}
	public static void main(String[] args) {
		String str ="-000000000000000000000000000000040";
		System.out.println(incrementString2(str));
		
}
}
