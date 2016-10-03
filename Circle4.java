
public class Circle4 {
	public double x,y,r; //instance variables
	public Circle4 (double x, double y, double r) { //constructor
		this.x=x;
		this.y=y;
		this.r=r;
	}
	 public String distance (double x, double y, double r){ // instance method with three instance arguments
		double d;
		
		String result;
	
		d = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		
		if (d == this.r + r) {
			result = "Tangent";
		}
		else if (d < this.r + r) {
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
		
		Circle4 c1 = new Circle4(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		Circle4 c2 = new Circle4(Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]));
		Circle4 c3 = new Circle4(Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8]));
		
		System.out.println("The two circles c1 and c2: " + c1.distance(c2.x, c2.y, c2.r));
		
		System.out.println("The two circles c2 and c3: " + c2.distance(c3.x, c3.y, c3.r));
		
		System.out.println("The two circles c3 and c1: " + c3.distance(c1.x, c1.y, c1.r));
		
	}

}
