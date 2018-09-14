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
	
	//��ü �޴� ���̱�
	static void menuDisplay() {
//		System.out.println(stdIndex);
		System.out.println("---------------------------------------------");
		System.out.println("1.�߰� 2:�˻� 3.list 4.���� 5.���� 6.�����, ���� 7.����");
		System.out.println("---------------------------------------------");
		System.out.print("����> ");		
	}
	
	
	//return ���� �ǹ̸� �� �𸣰��� -> stdAdd() �� �Ϻκп� �迭 �ø��� ����� ���� 
	static int add(Student student){
		return 0;
		
	}
	
	//�߰�
	static void stdAdd() {
		System.out.println("-------");
		System.out.println("�л��߰�");
		System.out.println("-------");
		System.out.print("�л��̸�: ");
		String sName = sc.next();	//�л��̸�
		System.out.print("��������: ");
		int kor = sc.nextInt();		//��������
		System.out.print("��������: ");
		int eng = sc.nextInt();		//��������
		System.out.print("��������: ");
		int math = sc.nextInt();	//��������		
		int[] score = {kor, eng, math};
		
		//�л� ������ ���� �Էµ� ��� ū �迭�� ����� �ش�.(�Լ� add ����ε� )
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
				System.out.println("���: �л��� ������ ��ϵǾ����ϴ�.");
//				System.out.println(std.getId()+" "+std.getEng());
				break;
			}
		}		
	}//�߰�
	
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
	
	//����
	static Student remove(int index) {
		Student ret = stClass[index];
		for(int i=index; i<stdIndex; i++) {
			stClass[i] = stClass[i+1];
		}
		stClass[index] = null;
		--stdIndex;
		
		return ret;
	}
	
	//����
	static void modify() {
		System.out.println("-------");
		System.out.println("�� ��");
		System.out.println("-------");
		System.out.print("������ �л��̸�: ");
		String stdName = sc.next();			
		Student student = search(stdName);
		
		if(student == null) {
			System.out.println("�л� ������ �����ϴ�.");
			return;
		}
		
		System.out.print("��������: ");
		int kor = sc.nextInt();		//��������
		System.out.print("��������: ");
		int eng = sc.nextInt();		//��������
		System.out.print("��������: ");
		int math = sc.nextInt();	//��������	
		
		student.setSubject(kor, eng, math);
		System.out.println("���: �л� ������ �����Ǿ����ϴ�.");
	}
	
	
	
	
	//������
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
	
	//�����
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
		System.out.println("�л� ����Ʈ");
		System.out.println("-------");
		
		
		for(int i=0; i<stClass.length; i++) {
			if(stClass[i] != null) {
				Student student = stClass[i];
				if(student != null )
					System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getKor()+"\t"
								   +student.getEng()+"\t"+student.getMath()+'\t'
								   +student.total()+"\t"+student.average());
				else {
					System.out.println("�л������� �����ϴ�. ");
					return;
					
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		boolean run = true;
		
		System.out.println("�л����� �Է��ϼ���.");
		System.out.println("�л���: ");
		int stdCount = sc.nextInt();
		ClassStudent classSt = new ClassStudent(stdCount);
		
				
		while(run) {
			menuDisplay();
			
			int menuSelect = sc.nextInt();
			switch(menuSelect) {
				case 1:		//�߰�(�л� ���� �Է�)
					stdAdd();	
					break;
					
				case 2:		//�˻�
					System.out.println("-------");
					System.out.println("�� ��");
					System.out.println("-------");
					System.out.print("�˻��� �л��̸�: ");
					String stdName = sc.next();	
					
					Student student = search(stdName);
					System.out.println(student.getName()+"\t"+student.getKor()+"\t"+student.getEng()+"\t"
							+student.getMath()+"\t"+student.total()+"\t"+student.average());					
					break;
					
				case 3:		//list: �� �л��� �̸�, ���� ����, ���, ����				
					studentList();
					break;
					
				case 4:		//����
					modify();
					break;
					
				case 5:		//����
					System.out.println("-------");
					System.out.println("�� ��");
					System.out.println("-------");
					System.out.print("������ �л��̸�: ");
					String delName = sc.next();	
					
					int delIndex = searchIndex(delName);
					if(delIndex == -1) {
						System.out.println("�л��� �����ϴ�.");
						return;
					}
					Student reStudent = remove(delIndex);
					System.out.println("���: ���� �Ϸ� "+reStudent);
					
					break;
					
				case 6:		//�����, ����
					int classTotal = total();
					double avg = average();
					System.out.println("�����: "+avg+", ����: "+classTotal);
					
					break;
				case 7:
					run = false;
					break;
			}			
		}
		System.out.println("����");
		
		

	}

}
