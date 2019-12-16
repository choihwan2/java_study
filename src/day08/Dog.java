package day08;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super("강아지");	//부모의 생성자 부분에 "강아지"를 변수로 넘겨줌
	}
	public void print() {
		System.out.printf("[%s,%s,%s]%n", super.kind, this.kind, name);
	}
	
	public String getSuperkind() {	//static method에서 부모의 kind 를 알고 싶을때 사용
		return super.kind;
	}

	public Dog(String kind, String name) {
		super("강아지");
		this.kind = kind;
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬깅!");
	}
	@Override
	public void heart() {
		System.out.println("심장을 갖고있음");
	}

}
