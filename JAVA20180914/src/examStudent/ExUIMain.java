package examStudent;

import java.util.Scanner;

public class ExUIMain {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		boolean run = true;
		int menu = 0;		//메뉴 선택
		UIMain uimain = new UIMain();
		
		while(run) {
			uimain.displayMenu();
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				uimain.displayAddMenu();			
//				add();
				break;
			case 2:
				uimain.displaySearchMenu();				
				break;
			case 3:
			//	uimain.displayClassList();
				break;
			case 4:
				uimain.displayEdit();				
				break;
			case 5: 
				uimain.displayDelete();				
				break;
			case 6:
			//	uimain.displayClassTotalAvg();				
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
