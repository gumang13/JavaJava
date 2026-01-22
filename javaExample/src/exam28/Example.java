package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner kbd = new Scanner(System.in);

		while (true) {
			System.out.println("==========목록==========");
			System.out.println("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제");
			String input = kbd.nextLine();
			if (input.equals("0")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (input.equals("1")) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println("목록 : " + list.get(i));
				}
			} else if (input.equals("2")) {
				System.out.println("새로 등록할 문자를 입력하세요");
				String user = kbd.nextLine();
				list.add(user);
				System.out.println("[" + user + "] 이 등록 되었습니다");
			} else if (input.equals("3")) {
				System.out.println("수정하고 싶은 데이터를 입력하세요");
				String user = kbd.nextLine();
				boolean isis = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(user)) {
						isis = true;
					}

				}
				if (isis) {
					list.remove(user);
					System.out.println("수정할 데이터를 입력하세요");
					user = kbd.nextLine();
					list.add(user);
					System.out.println("수정이 완료 되었습니다");
				} else {
					System.out.println("일치하는 데이터가 없습니다");
				}
			}

			else if (input.equals("4")) {
				System.out.println("삭제하고 싶은 데이터를 입력하세요");
				String user = kbd.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(user)) {
						System.out.println("[" + user + "]이 삭제 되었습니다");
						list.remove(user);
					}

				}
			} else {
				System.out.println("올바르지 않은 입력입니다");
			}

		}

	}

}
