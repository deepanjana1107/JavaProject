
public class Circle {

	/**
	 * @param args
	 */
	public double x,y,r; // instance variables x, y, and r of datatype 'double'
	
	public Circle (double x, double y, double r){  //constructor method with same class name and 3 parameters x, y and r
	this.x=x; this.y=y; this.r=r ; // assigning each of the parameters to instance variables
	}
	public Circle (double a, double b) { //constructor with 2 parameters
		this.x=a; this.y=b; r=2 ; //assigning two parameters to two instance variables, the third instance variable is default
	}
	public Circle (){ //constructor with NO parameters
		x=3;y=3;r=3; //all instance variables given default values
	}
	
	public double area (){ //instance method with NO parameters
			return 3.14*r*r ; //the area() method returns a value of datatype double
	}
	public double circumference (){ //instance method with NO parameters
			return 2*3.14*r ; //the circumference () method returns a value of datatype double
	}
	
	public double circumference2 (double pi) {
		return 2*pi*r;
	}
	
	public static void main (String [] args){
			Circle C1= new Circle(2,3,4); //instantiating an object C1 of type class Circle with constructor values 2, 3, 4
			Circle C2= new Circle(4,4);
			Circle C3= new Circle();
			
		System.out.println("area of C1="+ C1.area());
		System.out.println("circumference of C1="+ C1.circumference());
		System.out.println("area of C2="+ C2.area());
		System.out.println("circumference of C2="+ C2.circumference());
		System.out.println("area of C3="+ C3.area());
		System.out.println("circumference of C3="+ C3.circumference());
		
		double pi = 3.14;
		System.out.println("Circumference of C3 with pi as 3.14 is: " + C3.circumference2(pi));
		}
	}



