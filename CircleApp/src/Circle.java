// write a java program to accept the radius of a circle and display the area and the perimeter

public class Circle {
	
	// private - access modifiers
	// private - scope is inside the class
	private int radius;

	// public - scope is inside as well as outside.
	// protected - scope is inside the class and accessible sub classes (inheritanc)
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	// constructor - method which gets when an object is created.
	// doesnt have a return type.
	public Circle() {
		
	}
	
	// a method does a well defined task
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

}
