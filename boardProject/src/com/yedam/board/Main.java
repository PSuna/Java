package com.yedam.board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("██████╗  ██████╗  █████╗ ██████╗ ██████╗ \r\n"
				+ "██╔══██╗██╔═══██╗██╔══██╗██╔══██╗██╔══██╗\r\n"
				+ "██████╔╝██║   ██║███████║██████╔╝██║  ██║\r\n"
				+ "██╔══██╗██║   ██║██╔══██║██╔══██╗██║  ██║\r\n"
				+ "██████╔╝╚██████╔╝██║  ██║██║  ██║██████╔╝\r\n"
				+ "╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝\r\n"
				+ "");*/
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("\t██████╗ ███████╗██╗   ██╗\r\n"
				+ "\t██╔══██╗██╔════╝██║   ██║\r\n"
				+ "\t██║  ██║█████╗  ██║   ██║\r\n"
				+ "\t██║  ██║██╔══╝  ╚██╗ ██╔╝\r\n"
				+ "\t██████╔╝███████╗ ╚████╔╝ \r\n"
				+ "\t╚═════╝ ╚══════╝  ╚═══╝  \r\n"
				+ "\t                        ");
		System.out.println("+------ 개발자 커뮤니티에 오신걸 환영합니다 ------+");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t\t 메뉴 ▼ \t\t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t      1. 회원가입 \t\t\t|");
		System.out.println("|\t      2. 로그인 \t\t\t|");
		System.out.println("|\t      3. 프로그램 종료 \t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("+---------------------------------------+");
		
		System.out.print("메뉴를 선택해 주세요>> ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		boolean flag = true;
		
		
		while(flag) {
			switch(menu) {
				case 1:
					System.out.println("회원가입");
					flag = false;
					break;
				case 2:
					System.out.println("로그인");
					flag = false;
					break;
				case 3:
					System.out.println("프로그램 종료");
					flag = false;
					break;
				}
		}
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}

}
