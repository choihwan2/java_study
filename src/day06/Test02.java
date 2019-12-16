package day06;

public class Test02 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.hour = 13;
		t1.min = 32;
		t1.print();

	}
}

class Time {
	int hour, min, second;

	public void print() {
		System.out.printf("(%d시:%d분:%d초) %n", hour, min, second);
	}

}
