package day09;

import javax.swing.JOptionPane;

public class Test03 {
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
		Controller update = () -> System.out.println("update 수행");

//		update.exec();
		Controller delete = new Controller() {
			@Override
			public void exec() {
				System.out.println("delete 수행");
			}
		};
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

interface Controller {
	void exec();
}

class DeleteController implements Controller {
	@Override
	public void exec() {
		System.out.println("DeleteController 수행");
	}
}