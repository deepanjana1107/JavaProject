import java.io.IOException;

/**
 * This portion is not part of the program
 * This is used for documentation
 * to help the programmer understand what he or she is doing
 */

/**
 * @author rakanirban
 *
 */
public class rakaFirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is a comment line
		// The following line prints out my name --- to keep myself informed. This is not for the 
		// customer to see
		System.out.println("\nMy name is Raka");
		System.out.println("My husband's name is Anirban");
		
		
		int age;
		age=27;
		System.out.println("my age is " + age);
		
		age= age+7;
		System.out.println("my husband's age is " + age + " and my age is " + (age-7));
		
		try {
			int inputage =  System.in.read();
			age = inputage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Someone's gonna get a hurt real bad");
		}
		
		System.out.println("the number you have entered is " + age);
		
		
		System.out.println("Hello World");
		
		
		
		
		
		
	}

}
