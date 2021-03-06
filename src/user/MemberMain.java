package user;

import java.util.Scanner;

import admin.AdminBoard;
import admin.AdminBook;
import admin.AdminUser;

public class MemberMain {

	public void mainmenu(MemberUser memberUser) {
		
		MemberUser user = memberUser;
		
		Scanner scan = new Scanner(System.in);
		String num = "";
		
		//회원 메인메뉴
		while (true) {
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("\t\t\t1. 도서 검색 및 대여");
			System.out.println("\t\t\t2. 문의게시판");
			System.out.println("\t\t\t3. 마이페이지");
			System.out.println("\t\t\t0. 로그아웃");
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.print("\t\t\t▷ 입력: ");
			num = scan.nextLine();
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println();
			
			// 사용자에게 번호 입력받음

			// 도서 검색 및 대여
			if (num.equals("1")) {
				MemberBook book = new MemberBook();
				book.bookMenu(memberUser);
			}
			// 문의게시판
			else if (num.equals("2")) {
				MemberBoard board = new MemberBoard();
				board.exe(memberUser.getNum());
			}
			// 마이페이지
			else if (num.equals("3")) {
				MemberPage page = new MemberPage();
				int result = page.pageMenu(memberUser);
				// 탈퇴된 회원인 경우 이전 메뉴
				if (result == 1) {
					break;
				}
			}
			// 뒤로 가기
			else if (num.equals("0")) {
				break;
			}
			// 예외
			else {
				System.out.println("\t\t\t번호를 다시 입력해주세요");
			}
		}

	}
	
}
