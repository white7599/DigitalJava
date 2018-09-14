package krJavaExam0913;

import java.util.Scanner;

public class ClassStudent {
	/*static int stdNum;
	static Student[] stClass = new Student[stdNum];*/
	int stdNum;
	static Student[] stClass = new Student[5];
	static Scanner sc = new Scanner(System.in);
	static int stdIndex = 0;	
	
	ClassStudent(int cnt) {
		stdNum = cnt;
	}		
	
	//전체 메뉴 보이기
	static void menuDisplay() {
//		System.out.println(stdIndex);
		System.out.println("---------------------------------------------");
		System.out.println("1.추가 2:검색 3.list 4.수정 5.삭제 6.반평균, 총점 7.종료");
		System.out.println("---------------------------------------------");
		System.out.print("선택> ");		
	}
	
	
	//return 값의 의미를 잘 모르겠음 -> stdAdd() 의 일부분에 배열 늘리는 기능은 있음 
	static int add(Student student){
		return 0;
		
	}
	
	//추가
	static void stdAdd() {
		System.out.println("-------");
		System.out.println("학생추가");
		System.out.println("-------");
		System.out.print("학생이름: ");
		String sName = sc.next();	//학생이름
		System.out.print("국어점수: ");
		int kor = sc.nextInt();		//국어점수
		System.out.print("영어점수: ");
		int eng = sc.nextInt();		//영어점수
		System.out.print("수학점수: ");
		int math = sc.nextInt();	//수학점수		
		int[] score = {kor, eng, math};
		
		//학생 수보다 많이 입력된 경우 큰 배열을 만들어 준다.(함수 add 기능인데 )
		if(stdIndex>=stClass.length) {
			Student[] newstClass = new Student[stClass.length*2];
			System.arraycopy(stClass, 0, newstClass, 0, stClass.length);
			stClass = newstClass;
		}
		
		Student std = new Student(sName, score); 
		
		for(int i=0; i<stClass.length; i++) {
			if(stClass[i] == null) {
				stClass[i] = std;
				stdIndex++;
				System.out.println("결과: 학생과 점수가 등록되었습니다.");
//				System.out.println(std.getId()+" "+std.getEng());
				break;
			}
		}		
	}//추가
	
	static Student search(String name) {
		Student searchstd = null;
		for(int i=0; i<stClass.length;i++) {
			if(stClass[i] != null) {
				if(name.equals(stClass[i].getName())) {
					searchstd = stClass[i];	
					break;
				}
			}
		}		
		return searchstd;
	}
	
	static int searchIndex(String name) {
		int ret = -1;
		for(int i=0; i<stClass.length; i++) {
			if(stClass[i] != null ) {
				if(name.equals(stClass[i].getName())) {
					ret = i;
					break;
				}
			} 
		}
		return ret;
	}
	
	//삭제
	static Student remove(int index) {
		Student ret = stClass[index];
		for(int i=index; i<stdIndex; i++) {
			stClass[i] = stClass[i+1];
		}
		stClass[index] = null;
		--stdIndex;
		
		return ret;
	}
	
	//수정
	static void modify() {
		System.out.println("-------");
		System.out.println("수 정");
		System.out.println("-------");
		System.out.print("수정할 학생이름: ");
		String stdName = sc.next();			
		Student student = search(stdName);
		
		if(student == null) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		
		System.out.print("국어점수: ");
		int kor = sc.nextInt();		//국어점수
		System.out.print("영어점수: ");
		int eng = sc.nextInt();		//영어점수
		System.out.print("수학점수: ");
		int math = sc.nextInt();	//수학점수	
		
		student.setSubject(kor, eng, math);
		System.out.println("결과: 학생 점수가 수정되었습니다.");
	}
	
	
	
	
	//반총점
	static int total() {
		int totalS = 0;
		for(int i=0; i<stClass.length;i++) {
			if(stClass[i] != null) {
				Student st = stClass[i];
				totalS += st.total();
			}
		}
		return totalS;
	}
	
	//반평균
	static double average() {
		return ((double)total()/(stdIndex*Subject.values().length));
	}
	
	static Student get(int index) {
		Student getstudent = null;
		if(stClass[index] != null)
			getstudent = stClass[index];
		return getstudent;
	}
	
	void clear() {
		for(int i=0; i<stClass.length;i++) {
			stClass[i] = null;
		}
		stdIndex = 0;
	}
	
	
	static void studentList() {
		System.out.println("-------");
		System.out.println("학생 리스트");
		System.out.println("-------");
		
		
		for(int i=0; i<stClass.length; i++) {
			if(stClass[i] != null) {
				Student student = stClass[i];
				if(student != null )
					System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getKor()+"\t"
								   +student.getEng()+"\t"+student.getMath()+'\t'
								   +student.total()+"\t"+student.average());
				else {
					System.out.println("학생정보가 없습니다. ");
					return;
					
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		boolean run = true;
		
		System.out.println("학생수를 입력하세요.");
		System.out.println("학생수: ");
		int stdCount = sc.nextInt();
		ClassStudent classSt = new ClassStudent(stdCount);
		
				
		while(run) {
			menuDisplay();
			
			int menuSelect = sc.nextInt();
			switch(menuSelect) {
				case 1:		//추가(학생 점수 입력)
					stdAdd();	
					break;
					
				case 2:		//검색
					System.out.println("-------");
					System.out.println("검 색");
					System.out.println("-------");
					System.out.print("검색할 학생이름: ");
					String stdName = sc.next();	
					
					Student student = search(stdName);
					System.out.println(student.getName()+"\t"+student.getKor()+"\t"+student.getEng()+"\t"
							+student.getMath()+"\t"+student.total()+"\t"+student.average());					
					break;
					
				case 3:		//list: 각 학생별 이름, 과목별 점수, 평균, 총점				
					studentList();
					break;
					
				case 4:		//수정
					modify();
					break;
					
				case 5:		//삭제
					System.out.println("-------");
					System.out.println("삭 제");
					System.out.println("-------");
					System.out.print("삭제할 학생이름: ");
					String delName = sc.next();	
					
					int delIndex = searchIndex(delName);
					if(delIndex == -1) {
						System.out.println("학생이 없습니다.");
						return;
					}
					Student reStudent = remove(delIndex);
					System.out.println("결과: 삭제 완료 "+reStudent);
					
					break;
					
				case 6:		//반평균, 총점
					int classTotal = total();
					double avg = average();
					System.out.println("반평균: "+avg+", 총점: "+classTotal);
					
					break;
				case 7:
					run = false;
					break;
			}			
		}
		System.out.println("종료");
		
		

	}

}
