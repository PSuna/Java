package com.yedam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpMain {
	Scanner sc = new Scanner(System.in);
	EmpDAO dao = new EmpDAO();

	public void exe() {

		while (true) {

			System.out.println("1) 목록조회 2) 단건조회 3) 입력 4) 급여변경 5) 삭제 9) 종료");
			int menu = sc.nextInt();

			if (menu == 5) {
				// 삭제 => 사번을 입력받고 삭제 deleteEmp(int id)
				remove();

			} else if (menu == 4) {
				// 급여변경 => 사원번호, 급여를 입력받고, updateEmp(int id, int sal) 메소드 만들어서 만들기
				modify();
				
			} else if (menu == 3) {
				// 입력처리 => 사번, last_name, 이메일, 입사일자, 직무
				add();

			} else if (menu == 2) {
				// 단건조회
				search();

			} else if (menu == 1) {
				// 목록조회
				list();

			} else if (menu == 9) {
				// 종료
				break;
			}
		} // end of while()
		System.out.println("end of program.");
	}// end of main()

	// 목록조회
	public void list() { // static 메소드 or 인스턴스 메소드

		// 사용자 입력값을 받아서 처리 EmpDAO dao = new EmpDAO();
		/*
		 * List<Map<String, Object>> result = dao.empList(); // 반환유형
		 * 
		 * for (Map<String, Object> map : result) { System.out.println("사원번호: " +
		 * map.get("emp_id") + ", 이름: " + map.get("first_name") + "-" +
		 * map.get("last_name")); }
		 */

		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());

		}
	}

	// 단건조회 search()
	public void search() {
		System.out.print("조회사원번호 입력>>");

		// 사용자 입력값을 받아서 처리
		int id = sc.nextInt();
		EmpVO emp = dao.getEmp(id);

		if (emp == null) {
			System.out.println("조회된 정보 없음!!");
			
		}else{
			System.out.println("결과: " + emp);
		}
	}

	// 입력 add()
	public void add() {
		System.out.print("사번입력>> ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.print("이름>> ");
		String name = sc.nextLine();
		System.out.print("이메일>> ");
		String mail = sc.nextLine();
		System.out.print("입사일자>> ");
		String hDate = sc.nextLine();
		System.out.print("직무>> ");
		String job = sc.nextLine();

		EmpVO emp = new EmpVO();

		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력성공!!");
		} else {
			System.out.println("처리중에러!!");
		}
	}

	// 수정 modify()
	public void modify() {
		System.out.print("사번 입력>> ");
		int id = sc.nextInt();
		System.out.print("변경할 금여 입력>> ");
		int sal = sc.nextInt();

		if (dao.updateEmp(id, sal) > 0) {
			System.out.println("급여 변경 완료!!!");
		} else {
			System.out.println("처리중 에러!!!");
		}
	}

	// 삭제 remove()
	public void remove() {
		System.out.print("사번 입력>> ");
		int eid = sc.nextInt();
		if (dao.deleteEmp(eid) > 0) {
			System.out.println("삭제 완료!!!!");
		} else {
			System.out.println("처리중 에러!!!!");
		}
	}

} // end class
