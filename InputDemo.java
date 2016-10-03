public class InputDemo {

	public static void main (String argv[]){

	String str = Utils.inputString("Prompt a text:");
	int z = Utils.inputInteger("now a number:");
	float f = Utils.inputFloat("and a floating point:");

	System.out.println("String: "+str);
	System.out.println("Integer: "+z);
	System.out.println("Float: "+f);
	
	}
}

