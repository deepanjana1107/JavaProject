
public class Baum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=10; i>0; i--){
			for (int j=0;j<i;j++)
				System.out.print(" ");
			for (int k=0;k<2*(10-i)-1;k++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
