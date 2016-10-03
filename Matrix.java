
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method
		int matrix[][]= new int [6][8];
		
		System.out.println("Length of the matrix is: " + matrix.length);
		System.out.println("Length of each cell of matrix is: " + matrix[0].length);
		
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if (i==0||j==0||i==5||j==7)
					matrix[i][j]=10;
				else
					matrix[i][j]=2;
						
				if (matrix[i][j]==2)
					System.out.print(matrix[i][j]+"  ");
				else 
					System.out.print(matrix[i][j]+" ");
				
				}
			
			System.out.println();
			}

		
		}

	}


