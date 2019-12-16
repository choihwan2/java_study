package day06;

public class Account {
	private String name;
	private String number;
	private int money;

	public Account() {
		System.out.println("계좌가 생성되었습니다.");
	}

	public Account(String name, String number, int money) {
		this.name = name;
		this.number = number;
		this.money = money;
	}

	public void input(int money) {
		this.money += money;
	}

	public int output(int money) {

		this.money -= money;
		return money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void print() {
		System.out.printf("%s님의 계좌번호는 %s이고 %d의 금액이 남아있습니다.%n", name, number, money);
	}

}
