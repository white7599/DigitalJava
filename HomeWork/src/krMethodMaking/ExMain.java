/*
 * 2019.09.10
 * ��) �Լ� �����

main ���� �����ϴ� �Լ� �����

1) main���� Hello ����ϴ� �Լ� ���� call�ϱ�
2) main���� �Լ��� call�Ͽ� �հ� ���ϴ� �Լ� �����
   ���۰��� ������ ���� �Լ� ���ڷ� �޴´�.
   �Լ����� ��� ���� ����Ѵ�.
3) main���� �Լ��� call�Ͽ� ���۰��� ������ ���� �Է¹ް� �Է¹��� ������ �������� ¦���� ������ �Ѱ��ִ� �Լ� �����

ex)
public class ExMain{
	public static void main(String[] args){
	    1) print();
	    2) sum(10,50);
	    3) int count = countEven(1, 10);
	       System.out.println("¦�� �� : "+count);
	}
}
 */
package krMethodMaking;

public class ExMain {

	static void print() {
		System.out.println("Hello");
	}
	
	static void sum(int x, int y) {
		int sumResult = 0;
		sumResult = x + y;
		System.out.println("sum("+x+", "+y+") = "+sumResult);
	}
	
	static int countEvent(int x, int y) {
		int startNo;
		int endNo;
		if(x <= y) {
			startNo = x;
			endNo = y;
		} else {
			startNo = y;
			endNo = x;			
		}
		int cnt = 0;
		for(int i=startNo; i<=endNo; i++) {
			if(i%2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		print();
		sum(10, 50);		
		int count = countEvent(1, 10);
		System.out.println("¦�� ��: "+ count);

	}

}
