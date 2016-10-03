
public class MultipleTable {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("MultipleTable");
		System.out.println("     1  2  3  4  5  6  7  8  9  10");
		System.out.println("==================================");
		for (int i=1;i<=10;i++) { //row
             if (i<10)	{
            	 System.out.print(" " + i + " I ");
             }
             else{
            	 System.out.print(i+" I ");
             }
			for(int j=1;j<=10;j++){  //column
				if(i*j<10){
					System.out.print(i*j+"  ");	
				}
				else if(i*j>9 && i*j<100){
					System.out.print(i*j+" ");
					
				}
				else{
					System.out.println(i*j);
				}
				
				
			}  //internal loop finishes
			System.out.println();
		
		}  //external loop finishes

	}//main

}//class
