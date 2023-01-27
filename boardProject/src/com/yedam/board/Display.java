package com.yedam.board;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
	
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("════ ⋆★⋆ ════");
		System.out.println("╔═══════╗\r\n"
				+ "\r\n"
				+ "╚═══════╝");
		
		
		// 회원가입
		System.out.println("*** 회원가입 ***");
		System.out.print("가입할 아이디를 입력해주세요>> ");
		System.out.print("비밀번호를 입력하세요>> ");
		System.out.print("이메일을 입력하세요>> ");
		System.out.println("회원가입 성공!!");
		
		
		// 로그인
		System.out.println("*** 로그인 ***");
		System.out.print("아이디를 입력하세요>> ");
		System.out.println("비밀번호를 입력하세요>> ");
		System.out.println("로그인 성공!!");
		
		
		// 로그인 성공시
		System.out.println("작성된 게시글들이 보임");
		// 작성된 게시글 출력
		// 글번호 / 제목 / 작성자 / 작성일자 / 조회수
		System.out.println("*** 메뉴 ***");
		System.out.println("1. 게시글작성 | 2. 조회할 게시글");
		
		// 로그인 실패시
		System.out.println("로그인 실패!!");
		System.out.println("아이디 혹은 비밀번호가 생각안난다면 메일로 받아보시겠습니까?(Y/N)");
		// Y시
		System.out.println("가입한 메일로 아이디와 비밀번호가 전송되었습니다");
		// N시
		// 다시 로그인화면 나타내기
		
		// 1. 게시글 작성
		System.out.println("*** 게시글 작성 ***");
		System.out.print("제목>> ");
		System.out.print("개발언어>> ");
		System.out.println("내용>> ");
		System.out.println("게시글을 등록하시겠습니까?(Y/N)");
		// Y시
		System.out.println("게시글이 등록되었습니다");
		// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
		// N시
		System.out.println("게시글 등록을 취소하셨습니다.");
		// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
		
		// 2. 조회할 게시글
		System.out.println("*** 조회할 게시글 ****");
		System.out.print("조회할 게시글의 글번호를 입력하세요>> ");
		// 글번호 입력후
		System.out.println("제목 : ");
		System.out.println("개발언어 : ");
		System.out.println("작성일자 : ");
		System.out.println("작성자(ID) : ");
		System.out.println("조회수 : ");
		System.out.println("내용 : ");
		System.out.println("*** 메뉴 ***");
		System.out.println("1. 다른 게시글 조회 | 2. 돌아가기");
		
		// 수정
		System.out.println("*** 게시글 수정 ***");
		System.out.print("수정할 글번호를 입력하세요>> ");
		// 이전에 작성한글 화면에 나타내기(단건조회)
		System.out.println("수정할 항목 : 1. 제목 | 2. 개발언어 | 3. 내용");
		// 1번 제목 선택시
		System.out.print("변경할 제목을 입력하세요>> ");
		System.out.print("해당 항목을 변경하시겠습니까?(Y/N)");
		// Y시
		System.out.println("변경완료!!"); // => 홈메뉴출력
		// N시
		System.out.println("변경취소!! 뒤로 되돌아갑니다.");
		// 나머지 번호 반복
		// 홈메뉴출력
		
		// 삭제
		System.out.println("*** 게시글 삭제 ***");
		System.out.print("삭제할 글번호를 입력하세요>> ");
		// 이전에 작성한글 화면에 나타내기(단건조회)
		System.out.println("해당 게시글을 삭제하시겠습니까?");
		// Y시
		System.out.println("삭제완료!!"); // => // 홈메뉴 출력
		// N시
		System.out.println("삭제취소!! 뒤로 되돌아갑니다");
	
	
		
	}

}
