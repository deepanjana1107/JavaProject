
public class inputDot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Demonstration of the Utils library for inputting a number or any arbitrary value
		
		String str="";
		String result="";
		String terminationCriteria = ".";
		
		do {
			str = Utils.inputString("Enter a character:");
			result = result+str;
		}
		while (!str.equals(terminationCriteria));
		
		System.out.println("And the string you have entered is:  "+result);

	}

}
