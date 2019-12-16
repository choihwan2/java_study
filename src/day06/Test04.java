package day06;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
//		Account hwnAccount = new Account();
//		hwnAccount.setName("최 환");
//		hwnAccount.setNumber("524902-01-404804");
//		hwnAccount.setMoney(15000000);
//		hwnAccount.print();
//		
//		Account hongAccount = new Account();
//		hongAccount.setName("홍길동");
//		hongAccount.setNumber("524902-01-404804");
//		hongAccount.setMoney(1500000);
//		hongAccount.print();
//		
		Account[] arrAccounts = {
				new Account("홍길동","33",23122),
				new Account("후길동","33",242),
				new Account("참길동","33",222),
				new Account("상환","33",252),
				new Account("홍길동","32132",212),
				new Account("박박박","33",232),
		};
		System.out.println("Account 검색");
		String nameString = JOptionPane.showInputDialog("검색이름을 입력하세요");
		for (int i = 0; i < arrAccounts.length; i++) {
			for (int j = 0; j < arrAccounts[i].getName().length(); j++) {
				if(arrAccounts[i].getName().equalsIgnoreCase(nameString.trim())) {
					arrAccounts[i].print();
					break;
				}
			}

		}
		
	}
}
