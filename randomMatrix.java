public class randomMatrix {
	
	//define the instance variable which is just the array called 'matrix'
	public int[][] matrix;
	
	//define the constructor
	public randomMatrix (int z1, int z2) {
		this.matrix = new int [z1][z2];	// now allocate a two dimensional array of size z1 by z2	
	
		// fill this matrix[][] with arbitrary values	
		for (int i=0; i<z1; i++) {
			for (int j=0; j< z2; j++) {
				matrix[i][j] = (int) (Math.random()*10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
/*	public int sum (randomMatrix N) {
		int result = 0;
		for (int i=0; i<N.matrix.length; i++)
			for (int j=0; j<N.matrix[i].length;j++)
				result = result + N.matrix[i][j];
		
		return result;
		
	}*/
	
	public int sum () {
		int result = 0;
		for (int i=0; i<this.matrix.length; i++) {
			for (int j=0; j<this.matrix[i].length; j++) {
				result = result + this.matrix[i][j];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int i = Utils.inputInteger("Enter the number of rows: ");
		int j = Utils.inputInteger("Enter the number of columns: ");
		
		randomMatrix M = new randomMatrix (i,j);
        System.out.println("The sum of all cells of the matrix is: " + M.sum()); // not M.sum(M)
	}

}
