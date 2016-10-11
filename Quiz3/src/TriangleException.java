
public class TriangleException extends Exception {
	private double Area;
	private double Perimeter;
	
	public double getArea() {
		return Area;
	}
	public void setArea(double area) throws TriangleException {
		if (area <= 0)
		throw new TriangleException();
		else 
			Area = area;
	}
	public double getPerimeter() {
		return Perimeter;
	}
	public void setPerimeter(double perimeter) throws TriangleException {
		if (perimeter <= 0)
			throw new TriangleException();
		else
		Perimeter = perimeter;
	}
	
}
