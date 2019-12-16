package ex7;

public class Main {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		Computer computer = new Computer();
		buyer.buy(new Tv());
		buyer.buy(computer);
		buyer.buy(new Audio());
		buyer.summary();
		
		System.out.println();
		buyer.refund(computer);
		buyer.summary();
	}

}
