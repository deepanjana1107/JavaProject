
public class Matrix_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method
		int matrix[][]= new int [6][8];
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if (i==0||j==0||i==5||j==7) {
					matrix[i][j]=10;
					System.out.print(matrix[i][j]+" ");
				}
				else {
					matrix[i][j]=2;
					System.out.print(matrix[i][j]+"  ");
				}
			}
			System.out.println();
		}

		
	}

}


