package examStudent;

import java.util.Scanner;

public class UIMain {
	Scanner scanner = new Scanner(System.in);
	
	void displayMenu() {
		System.out.println("1.�߰� 2.�˻� 3.����Ʈ 4.���� 5.���� 6.�����, ���� 7.����");
		System.out.println(">> ");
	}
	
	ExStudent displayAddMenu() {
		String name=null;
		ExStudent stNew = null;
		try {
			System.out.println("�߰��ϱ�(�л��̸�, ����, ����, ���� ������ �Է��ϼ���.)");
			System.out.print("�̸�: ");
			name = scanner.next();
			System.out.print("����: ");
			int kor = scanner.nextInt();
			System.out.print("����: ");
			int eng = scanner.nextInt();
			System.out.print("����: ");
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
		System.out.println("�˻��ϱ�(�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();		
		System.out.println("�˻��� �̸�: "+name);
		return name;
	}
	
	void displayClassList(ExClassStudent cs) {
		System.out.println("��ü �л� �����ֱ�(list)");
		for(ExStudent tmp: cs.stClass) {
			if(tmp!=null)
				System.out.println(tmp);
		}
	}
	
	String displayEdit() {
		String name=null;
		System.out.println("�����ϱ� (�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.println("������ �̸�: "+name);
		return name;
	}
	
	String displayDelete() {
		String name=null;
		System.out.println("�����ϱ� (�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.println("������ �̸�: "+name);
		return name;
	}
	
	void displayClassTotalAvg(ExClassStudent cs) {
		System.out.println("�����, ���� ����");
		System.out.println(cs.total()+", "+cs.average());
	}
	
	void displayClassTotalAvg(ScoreInterface si) {
		if(si instanceof ExClassStudent) {
			System.out.println("�����, ���� ����");
			System.out.println(si.total()+", "+si.average());
		}
	}
	
	void displayExit() {
		System.out.println("���α׷� ����");
	}
}
