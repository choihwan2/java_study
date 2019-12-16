package day08;

public class Cricle1 extends Shape_a {
	public static final double PI = 3.141592;
	private int x;
	private int y;
	private int r;

	public Cricle1() {
		super();
		this.x = 0;
		this.y = 0;
		this.r = 10;
	}

	public Cricle1(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getArea(int r) {
		return PI * r * r;
	}

	@Override
	public double cArea(double r) {
		return PI * r * r;
	}
}

abstract class Shape_a {
	public abstract double cArea(double r);
}

interface Shape_i {
	static final String COLOR = "red";

	double cArea(double r); // 앞에 public abstract 생략.

}

class Circle3 implements Shape_i {
	String myColor = COLOR;

	@Override
	public double cArea(double r) {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
}
