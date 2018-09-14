package examStudent;

import java.util.Scanner;

public class UIMain {
	Scanner scanner = new Scanner(System.in);
	
	void displayMenu() {
		System.out.println("1.추가 2.검색 3.리스트 4.수정 5.삭제 6.반평균, 총점 7.종료");
		System.out.println(">> ");
	}
	
	ExStudent displayAddMenu() {
		String name=null;
		ExStudent stNew = null;
		try {
			System.out.println("추가하기(학생이름, 국어, 영어, 수학 점수를 입력하세요.)");
			System.out.print("이름: ");
			name = scanner.next();
			System.out.print("국어: ");
			int kor = scanner.nextInt();
			System.out.print("영어: ");
			int eng = scanner.nextInt();
			System.out.print("수학: ");
			int math = scanner.nextInt();
			scanner.nextLine();
	//		scanner.skip("[\\r\\n]+");
			System.out.println(" "+name+" "+kor+" "+eng+" "+math);	
			stNew = new ExStudent(name, 3, kor, eng, math);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	
		return stNew;
	}
	
	String displaySearchMenu() {
		String name=null;
		System.out.println("검색하기(이름 입력)");
		System.out.print("이름: ");
		name = scanner.next();		
		System.out.println("검색할 이름: "+name);
		return name;
	}
	
	void displayClassList(ExClassStudent cs) {
		System.out.println("전체 학생 보여주기(list)");
		for(ExStudent tmp: cs.stClass) {
			if(tmp!=null)
				System.out.println(tmp);
		}
	}
	
	String displayEdit() {
		String name=null;
		System.out.println("수정하기 (이름 입력)");
		System.out.print("이름: ");
		name = scanner.next();
		System.out.println("수정할 이름: "+name);
		return name;
	}
	
	String displayDelete() {
		String name=null;
		System.out.println("삭제하기 (이름 입력)");
		System.out.print("이름: ");
		name = scanner.next();
		System.out.println("삭제할 이름: "+name);
		return name;
	}
	
	void displayClassTotalAvg(ExClassStudent cs) {
		System.out.println("반평균, 총점 보기");
		System.out.println(cs.total()+", "+cs.average());
	}
	
	void displayClassTotalAvg(ScoreInterface si) {
		if(si instanceof ExClassStudent) {
			System.out.println("반평균, 총점 보기");
			System.out.println(si.total()+", "+si.average());
		}
	}
	
	void displayExit() {
		System.out.println("프로그램 종료");
	}
}
