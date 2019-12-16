package day08;

public class Test02 {
	public static void main(String[] args) {
		SingleTone s = SingleTone.getInstance();	//처음은 객체 생성 그다음 하나만 만들어지고 계속 사용가능.
		System.out.println(s);
	}

}

class SingleTone {

	private static SingleTone s;

	private SingleTone() { // 여기 클래스 안에서만 생성함.

	}

	public static SingleTone getInstance() {
		if (s == null)
			s = new SingleTone();
		return s;
	}
}
