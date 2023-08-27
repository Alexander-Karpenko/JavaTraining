package FirstSolution;

public class FizzBuzzCuckooClock {
	
	public static String OutCuckooClock (String time) {
		String timeNumbers[] = time.split("[:]");
		String out = "";
		int minutes = Integer.parseInt(timeNumbers[1]);
		int hours = Integer.parseInt(timeNumbers[0]);
		if(minutes == 0) {
			if (hours > 12) {
				hours -= 12;
			}
			if (hours == 0) {
				hours = 12;
			}
				for (int i = 0; i < hours; i++) {
				if (i == 0) {
					out += "Cuckoo";
				}else {
				out += " Cuckoo";
				}
			}
			return out;
		} else if (minutes == 30) {
			return out = "Cuckoo";
		}
		if (minutes % 3 == 0 && minutes % 5 == 0) {
			return out = "Fizz Buzz";
		}else
		if (minutes % 3 == 0) {
			return out = "Fizz";
		}else
		if (minutes % 5 == 0) {
			return out = "Buzz";
		}else {
			return out = "tick";
		}
	}
	
	
	public static void main(String[] args) {
		String time = "21:00";
		String out = OutCuckooClock(time);
		System.out.println(out);
	}
	
}
