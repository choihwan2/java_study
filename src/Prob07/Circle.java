package Prob07;

public class Circle extends Shape {
	double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void calculationArea() {
		super.setArea(Math.PI * radius * radius);
	}
	

}
