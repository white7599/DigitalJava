package examUI;

import java.util.Scanner;

public class UIMain {
	Scanner scanner = new Scanner(System.in);
	
	void displayMenu() {
		System.out.println("1.�߰� 2.�˻� 3.����Ʈ 4.���� 5.���� 6.�����, ���� 7.����");
		System.out.println(">> ");
	}
	
	void displayAddMenu() {
		String name=null;
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
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}			
	}
	
	void displaySearchMenu() {
		String name=null;
		System.out.println("�˻��ϱ�(�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();		
		System.out.println("�˻��� �̸�: "+name);
	}
	
	void displayClassList() {
		System.out.println("��ü �л� �����ֱ�(list)");
		System.out.print("�̸�: ");
	}
	
	void displayEdit() {
		String name=null;
		System.out.println("�����ϱ� (�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.println("������ �̸�: "+name);
	}
	
	void displayDelete() {
		String name=null;
		System.out.println("�����ϱ� (�̸� �Է�)");
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.println("������ �̸�: "+name);
	}
	
	void displayClassTotalAvg() {
		System.out.println("�����, ���� ����");
	}
	
	void displayExit() {
		System.out.println("���α׷� ����");
	}
}
