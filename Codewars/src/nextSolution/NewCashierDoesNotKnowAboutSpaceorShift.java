package nextSolution;

public class NewCashierDoesNotKnowAboutSpaceorShift {

	public static String StructuredMessage( String message) {
		String [] menu ={"Burger","Fries","Chicken","Pizza","Sandwich","Onionrings",
				"Milkshake","Coke"};
		String [] menuLow ={"burger","fries","chicken","pizza","sandwich","onionrings",
				"milkshake","coke"};
		String result = "";
		for (int i = 0; i < menu.length; i++) {
			if((message.length() - message.replace(menuLow[i], "").length())/ menuLow[i].length() > 0) {
				for (int j = 0; j < (message.length() - message.replace(menuLow[i], "").length())/ menuLow[i].length(); j++) {
					result += menu[i] + " ";
				}
			}
		}
		result = result.substring(0, result.length() - 1);
		return result;
	}
	
	
	public static void main(String[] args) {
		String str = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
		String res = StructuredMessage(str);
		System.out.print(res);
	}
}
