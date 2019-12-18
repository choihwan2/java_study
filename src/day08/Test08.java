package day08;

public class Test08 {
	public static void main(String[] args) {
		T[] t = {new Circle_8(), new Rectangle_8()};
	}
}
interface T extends Drawable,Moveable{
	
}

interface Drawable {
	void draw();
}

interface Moveable {
	void move();
}

class Circle_8 implements T{
	String name = "Circle";
	
	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		
	}
	
}

class Rectangle_8 implements T{
	String name = "Rectangle";

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}