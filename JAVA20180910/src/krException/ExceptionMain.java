package krException;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("������ �Է�");
		dividend = sc.nextInt();
		System.out.println("�������� �Է�");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend +"/"+divisor+"="+dividend/divisor);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���������ϴ�.");
		} finally{
			System.out.println("�����⸦ �Ͽ����ϴ�.");
		}
		
		System.out.println("���α׷� ����");*/
		
		
		int[] intArr = new int[5];
		intArr[0] = 0;
		
		try {
			for(int index=0; index < intArr.length; index++) {
				intArr[index+1] = index+1+intArr[index];
				System.out.println("intArr["+index+"]" + intArr[index]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �ʰ�");
		}
		
		
		
	}

}
