
public class Circle3 {
	public double x,y,r; //instance variables
	public Circle3 (double x, double y, double r) { //constructor
		this.x=x;
		this.y=y;
		this.r=r;
	}
	 public static String distance (Circle3 C1, Circle3 C2){
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
		
		Circle3 c1 = new Circle3(0,2,1);
		Circle3 c2 = new Circle3(0,4,1);
		Circle3 c3 = new Circle3(2,2,1);
		
		System.out.println("The two circles c1 and c2: " + Circle3.distance(c1, c2));
		
		System.out.println("The two circles c2 and c3: " + Circle3.distance(c2, c3));
		
		System.out.println("The two circles c1 and c3: " + Circle3.distance(c1, c3));
		
	}

}
