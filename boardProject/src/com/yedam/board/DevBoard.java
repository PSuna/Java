package com.yedam.board;

import java.util.Scanner;

public class DevBoard {

	public static Scanner sc = new Scanner(System.in);
	public static Member member = null;
	public static MemberDAO memberDao = new MemberDAO();
	public static boolean flag = true; // 무한루프를 탈출할수있게하는 변수
	public static int menuNo = 0;
	private static String loginId = null;
	
	public static void main(String[] args) {
		
		while(flag) {
			mainMenu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:
					// 회원가입
					signUp();
					continue; // 완료후 처음으로
					
				case 2:
					// 로그인
					boolean loginSuccess = login();
					if(loginSuccess) {
						// 로그인완료후 => 로그인 성공시 들어가는 메뉴로
						loginSuccessPage();
						
					}else {
						// 로그인 실패시
						continue;
					}
					
				case 99:
					System.out.println("프로그램 종료");
					flag = false;
			}
		}
	}
	
	public static void loginSuccessMenu() {
		System.out.println("*********************** " + loginId + "님 반갑습니다. ****************************");
		System.out.println("1. 게시글 작성 | 2. 게시글 자세히보기 | 3. 수정 및 삭제 | 99. 프로그램종료");
		System.out.println("********************************************************************");
		System.out.print("메뉴를 선택해주세요>> ");
	}
	
	public static void loginSuccessPage() {
		//flag = true;
		loginSuccessMenu();
		menuNo = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			switch(menuNo) {
				case 1:
					// 게시글 작성
					// 1. 게시글 작성
					System.out.println("*** 게시글 작성 ***");
					System.out.print("제목>> ");
					String title = sc.nextLine();
					
					System.out.print("개발언어>> ");
					String language = sc.nextLine();
					
					System.out.println("내용>> ");
					String content = sc.nextLine();
					
					System.out.println("게시글을 등록하시겠습니까?(Y/N)");
					String postStr = sc.nextLine();
					
					boolean post;
					
					
					switch(postStr) {
					case "Y" :
					case "y" :
						post = true;
						break;
					case "N" :
					case "n" :
						post = false;
						break;
					}
					
				
					// Y시
					System.out.println("게시글이 등록되었습니다");
					// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
					// N시
					System.out.println("게시글 등록을 취소하셨습니다.");
					// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
					break;
				case 2:
					// 게시글 자세히 보기(단건조회)
					break;
				case 3:
					// 수정 및 삭제
					break;
				case 99:
					// 프로그램 종료
					return;
			}
		}
	}
	
	public static void mainMenu() {
		System.out.println("**************************************");
		System.out.println("1. 회원가입 | 2. 로그인 | 99. 프로그램종료");
		System.out.println("**************************************");
		System.out.print("메뉴를 선택해주세요>> ");
	}

	public static void signUp() {
		System.out.println("*** 회원가입 ***");
		System.out.print("가입할 아이디를 입력해주세요>> ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요>> ");
		String password = sc.nextLine();
		System.out.print("이메일을 입력하세요>> ");
		String mail = sc.nextLine();
		member = new Member(id, password, mail);
		// 회원가입 오라클 DB에 저장
		
		if(memberDao.memberInsert(member) >
		0) {
			System.out.println("회원가입 성공!! 메인페이지로 이동합니다.");
		}else {
			System.out.println("회원가입 실패!! 다시 작성해주세요.");
			signUp();
		}
	}
	
	public static boolean login() {
		System.out.println("*** 로그인 ***");
		System.out.print("아이디를 입력하세요>> ");
		loginId = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요>> ");
		String password = sc.nextLine();
		
		if(memberDao.memberLogin(loginId, password)) {
			System.out.println("로그인 성공!!");
			return true;
		}
		return false; // 로그인 실패시
	}
}
