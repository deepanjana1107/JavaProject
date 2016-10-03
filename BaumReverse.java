public class BaumReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines=10;
		
		for (int i=0; i<lines; i++){
			for (int j=0;j<i;j++)
				System.out.print(" ");
			for (int k=0; k<2*(lines-i)-1; k++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
