package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test07 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("choihwan", "1234");
		map.put("choihwan123", "1235");
		map.put("choihwan3", "1234");
		map.put("choihwan4", "1234");
		// 맵 구조 순회

		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
//		while (it.hasNext()) {
//			String id = (String) it.next();
//			System.out.println(id + "=" + map.get(id));
//		}

		// 로그인
		it = keySet.iterator();
		Scanner scanner = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요");
//		String searchId = scanner.nextLine();
//		while (it.hasNext()) {
//			String id = (String) it.next();
//			if (searchId.equals(id)) {
//				System.out.println("패스워드를 입력하세요:");
//				String password = scanner.nextLine();
//				if (map.get(id).equals(password)) {
//					System.out.println("로그인 성공!!!!");
//					break;
//				} else {
//					System.out.println("로그인 실패..");
//				}
//			}
//		}
		
		while (true) {
			System.out.print("ID: ");
			String idString = scanner.nextLine();
			System.out.print("Password: ");
			String pwString = scanner.nextLine();
			
			if(!map.containsKey(idString)) {
				System.out.println("ID X");
				continue;
			}else {
				if(map.get(idString).equals(pwString)) {
					System.out.println("로그인성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}
		}
		scanner.close();
		scanner = null;
//		System.out.println(map);
//		System.out.println(map.get("choihwan"));
	}

}
