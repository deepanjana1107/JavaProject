import java.io.IOException;

public class Utils {


    public static String inputString(String message) {
	
	byte buffer[] = new byte[80];
	int num_char=0;
	String input = "";
	System.out.print(message);
	char c;
	int crlf = System.getProperty("line.separator").length();
	try {
	    num_char = System.in.read(buffer,0,80);
	}
	catch (IOException e) {
	    System.err.println("IO Fehler");
	}
	input = new String(buffer,0, num_char-crlf);
	return input;
    }

    public static int inputInteger(String msg) { //class method
	int i = 0;
	boolean ok = false;
	String int_str="NaN";
	while (! ok) {
	    ok = true;
	    try {
		int_str = inputString(msg);
		i =  Integer.parseInt(int_str);
	    } 
	    catch (NumberFormatException e) {
		System.err.println("'"+int_str+"' ist keine korrekte Ganzzahl");
		ok = false;
	    }
	}
	return i;
    }

    public static float inputFloat(String msg) {
	float f = 0;
	boolean ok = false;
	String int_str="NaN";
	while (! ok) {
	    ok = true;
	    try {
		int_str = inputString(msg);
		f =  Float.parseFloat(int_str);
	    } 
	    catch (NumberFormatException e) {
		System.err.println("'" + int_str+ "' ist keine korrekte Gleitkommazahl");
		ok = false;
	    }
	}
	return f;
    }

    


    public static void main(String argv[]) throws IOException { 
	int count=0;
	int ch;
	String str = inputString("Text:");
	int z = inputInteger("Zahl:");
	float f = inputFloat("Gleitkommazahl:");

	System.out.println(" Text: " + str + "; Zahl: " + z + " Gleitkommazahl: " + f);

    }

}