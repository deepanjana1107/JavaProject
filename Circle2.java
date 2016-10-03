
public class Circle2 {
	public double x,y,r; //instance variables
	public Circle2 (double x, double y, double r) { //constructor
		this.x=x;
		this.y=y;
		this.r=r;
	}
	 public static String distance (Circle2 C1, Circle2 C2){
		double d;
		
		String result;
		
		d = Math.sqrt(Math.pow((C2.x - C1.x), 2) + Math.pow((C2.y - C1.y), 2));
		
		if (d == C1.r + C2.r) {
			result = "Tangent";
		}
		else if (d < C1.r + C2.r) {
			result = "Intersect";
		}
		else {
			result = "Do not intersect";
		}
		
		return result;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double x1 = Utils.inputFloat("Input x of Circle number 1 = ");
		double y1 = Utils.inputFloat("Input y of Circle number 1 = ");
		double r1 = Utils.inputFloat("Input r of Circle number 1 = ");
		
		//Instantiate Object of class Circle2 with values of x1, y1, and r1
		Circle2 c1 = new Circle2(x1,y1,r1);
		
		double x2 = Utils.inputFloat("Input x of Circle number 2 = ");
		double y2 = Utils.inputFloat("Input y of Circle number 2 = ");
		double r2 = Utils.inputFloat("Input r of Circle number 2 = ");
		
		//Instantiate Object of class Circle2 with values of x2, y2, and r2
		Circle2 c2 = new Circle2(x2,y2,r2);
		
		System.out.println("The two circles c1 and c2: " + Circle2.distance(c1, c2));	
		
		
	}

}
