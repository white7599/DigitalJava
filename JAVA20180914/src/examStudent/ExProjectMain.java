package examStudent;

import java.util.Scanner;

public class ExProjectMain {
	static Scanner scanner = new Scanner(System.in);
	
		
	public static void main(String[] args) {
		ExClassStudent cs = new ExClassStudent(10);
		UIMain uimain = new UIMain();
		
		boolean run = true;
		int menu = 0;		//메뉴 선택
		String name = null;
		ExStudent st = null;
		
		//test code
		for(int i=0; i<3; i++) {
			int index = cs.add(new ExStudent("choi"+i, 3, 100+i, 90+i, 80+i));
			System.out.println(cs.stClass[index]);
		}
		
		while(run) {
			uimain.displayMenu();
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				uimain.displayAddMenu();			
				cs.add(st);
				break;
			case 2:
				name = uimain.displaySearchMenu();
				st = cs.search(name);
				
				break;
			case 3:
				uimain.displayClassList(cs);
				break;
			case 4:
				name= uimain.displayEdit();
				st = uimain.displayAddMenu();
				cs.edit(name, st);
				System.out.println("edit: " + st);
				break;
			case 5: 
				name = uimain.displayDelete();
				st = cs.remove(name);
				System.out.println("del: "+st);
				break;
			case 6:
				uimain.displayClassTotalAvg(cs);				
				break;
			case 7:
				run = false;
				break;
			default:
				System.out.println("1~7 중에 선택하여 주세요.");
			}
		}
		uimain.displayExit();

	}

}
