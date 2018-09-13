package krException;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("나뉨수 입력");
		dividend = sc.nextInt();
		System.out.println("나눗수를 입력");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend +"/"+divisor+"="+dividend/divisor);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		} finally{
			System.out.println("나누기를 하였습니다.");
		}
		
		System.out.println("프로그램 종료");*/
		
		
		int[] intArr = new int[5];
		intArr[0] = 0;
		
		try {
			for(int index=0; index < intArr.length; index++) {
				intArr[index+1] = index+1+intArr[index];
				System.out.println("intArr["+index+"]" + intArr[index]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위 초과");
		}
		
		
		
	}

}
