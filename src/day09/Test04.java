package day09;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {

		Controller cmd = null;
//		cmd.exec();
		Controller insert = new Controller() {
			// 익명 클래스
			// 이름 없는 클래스를 객체 생성하고 사용함.
			// 재활용이 불가능한 코드입니다. 단순하게 하나의 행동을 하고 끝날때
			// 안드로이드에서 버튼을 만들고 거기에서 이벤트 처리할때 이렇게 사용했었네
			@Override
			public void exec() {
				System.out.println("insert 수행");
			}
		};
//		insert.exec();
		// 람다식 표현 interface 안의 추상 메소드가 하나뿐일때 이렇게 표현도 가능. 즉 exec가 이렇게 오버라이딩 되는거시다.
		Controller update = () -> System.out.println("update 수행");

//		update.exec();
		Controller delete = () -> System.out.println("delete 수행");

//		delete.exec();

		String msgString = JOptionPane.showInputDialog("명령을 입력하세요 1.insert 2. delete 3.update");

		switch (msgString) {
		case "1":
		case "insert":
			cmd = insert;
			break;
		case "2":
		case "delete":
			cmd = delete;
			break;
		case "3":
		case "update":
			cmd = update;
			break;
		default:
			System.out.println("명령 선택을 다시하세요.");
			break;
		}

		if (cmd != null) {
			cmd.exec();
		}

	}

}