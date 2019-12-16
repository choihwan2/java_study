package ex7;

import java.util.Vector;

public class Product {
	int price;
	int bounsPoint;

	public Product() {
		price = 0;
		bounsPoint = 0;
	}

	public Product(int price) {
		this.price = price;
		bounsPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	public Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio() {
		super(300);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product> itemVector = new Vector<Product>();
	Product[] itemProducts = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bounsPoint;
		itemProducts[i++] = p;
		itemVector.add(p);
		System.out.println(p + "을 구입하셨습니다.");
	}

	void refund(Product p) {
		if (itemVector.remove(p)) {
			money += p.price;
			bonusPoint -= p.bounsPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

//		for (int i = 0; i < itemProducts.length; i++) {
//			if (itemProducts[i] == null)
//				break;
//			sum += itemProducts[i].price;
//			itemList += itemProducts[i] + ", ";
//		}

		for (int i = 0; i < itemVector.size(); i++) {
			Product product = (Product) itemVector.get(i);
			sum += product.price;
			itemList += (i == 0) ? "" + product : ", " + product;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}

}
