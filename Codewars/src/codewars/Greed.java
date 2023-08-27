package codewars;

public class Greed {
	public static int greedy(int[] dice){
		int res = 0;
		int num[][] = new int[6][1];
		int exempleNum[] = { 1, 2, 3, 4, 5, 6 };
		int resExemple[] = { 1000, 200, 300, 400, 500, 600 };
		int count = 0;
		for (int j = 0; j < exempleNum.length; j++) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == exempleNum[j]) {
					count ++;
				}
			}
			num [j][0] = count;
			count = 0;
		}
		
		for (int i = 0; i < exempleNum.length; i++) {
			if(i == 0) { // exception for 1 
				if(num[i][0] < 3){
					res += num[i][0] * 100;
				}else if(num[i][0] == 3) {
					res += resExemple[i];
				}else if(num[i][0] > 3) {
					res += resExemple[i];
					res += (num[i][0] - 3) * 100;
				}
				continue;
			}
			if(i == 4) { // exception for 5
				if(num[i][0] < 3){
					res += num[i][0] * 50;
				}else if(num[i][0] == 3) {
					res += resExemple[i];
				}else if(num[i][0] > 3) {
					res += resExemple[i];
					res += (num[i][0] - 3) * 50;
				}
				continue;
			}
			if(num[i][0] >= 3 ) {
				res += resExemple[i];
			}
		}
	    return res;
	  }
	public static void main(String[] args) {
		int num[] = {5,5,5,5,3,4};
		System.out.println(greedy(num));
	}

}
