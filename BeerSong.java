
public class BeerSong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beerNum = 99;
		String word = "bottles";
		System.out.println(beerNum + " " + word + " of beer on the wall");
		
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
						
						}
			
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("pass it around.");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				
			} else {
				System.out.println(" No more bottles of beer on the wall");
				
			}
				
			}
					
			
		}
	

}
