public class identityMatrix {
	
	//define the instance variable which is just the array called 'matrix'
	public int[][] matrix;
	
	//define the constructor
	public identityMatrix (int z1, int z2) {
		this.matrix = new int [z1][z2];	// now allocate a two dimensional array of size z1 by z2	
	
		// fill this matrix[][] with arbitrary values	
		for (int i=0; i<z1; i++) {
			for (int j=0; j< z2; j++) {
				if (i==j) {
					matrix[i][j] = 1;
				}
				else {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int sum () { //instance method sum() with NO parameters
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
		
		identityMatrix M = new identityMatrix (i,j); //instantiating a new object called "M" with two arguments i and j
        System.out.println("The sum of all cells of the matrix is: " + M.sum()); // not M.sum(M)
	}

}
