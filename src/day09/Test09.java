package day09;

public class Test09 {
	public static void main(String[] args) {
		Account account = new Account("hwan", "001", 500);
		try { // Clinet 에게 에러 메시지를 보여주거나 할때 여기서 보여줌. 메소드 안에서 try catch를 해결한다면 서버에서 해결하는것과 비슷.
			account.output(1000);
		} catch (MoneyException e) {
			e.printStackTrace();
		}
	}
}

class MoneyException extends Exception {
	public MoneyException() {
		super("계좌잔고 예외 발생");
	}

	public MoneyException(String msg) {
		super(msg);
	}
}

class Account {
	String name;
	String number;
	int money;

	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	public void input(int money) {
		this.money += money;
	}

	public void output(int money) throws MoneyException {
		if (this.money < money) {
			throw new MoneyException();
		}
		this.money -= money;
		System.out.println("잔고는 " + this.money);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}

}
