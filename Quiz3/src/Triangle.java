
public class Triangle extends GeometricObject {
	
	private static final double S = 0;
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {
		super();
	}
	

	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}


	public double getSide1() {
		return side1;
	}


	public double getSide2() {
		return side2;
	}


	public double getSide3() {
		return side3;
	}
	
	public double getS() {
		return ((side1 + side2 + side3) / 2);
		
	}
	
	public double getArea() {
		return (getS() * ((getS() - side1)*(getS() - side2)*(getS() - side3)));
		
	}
	
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		return "This Triangle has Three Sides of lengths:" 
	+ side1 + side2 + side3 + "," + "and its Area is" + getArea() 
	+ "," + "and its Perimeter is" + getPerimeter();
	}
}
