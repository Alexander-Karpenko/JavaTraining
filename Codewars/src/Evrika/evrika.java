package Evrika;

import java.util.LinkedList;
import java.util.List;

public class evrika {
	//public static void  List (int a, int b) {
		public static List<Long> Evrika  (int a, int b) {
		int res = 0;
		List<Long> List = new LinkedList<>();
		for (int i = a; i <= b; i++) {
			char int1 [] = String.valueOf(i).toCharArray();
			for (int j = 0; j < int1.length; j++) {
				int a1 = int1[j] - 48;
				res += (int) Math.pow(a1, j + 1); 
			}
			if (i == res) {
				List.add((long) i);
			}
			res = 0;
		}
		return List;
		
	}
	
	public static void main(String[] args) {
		System.out.print(Evrika(1,136));
		//List(1,86);
	}

}
