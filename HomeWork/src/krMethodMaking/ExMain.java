/*
 * 2019.09.10
 * 문) 함수 만들기

main 에서 실행하는 함수 만들기

1) main에서 Hello 출력하는 함수 만들어서 call하기
2) main에서 함수를 call하여 합계 구하는 함수 만들기
   시작값과 끝나는 값을 함수 인자로 받는다.
   함수에서 결과 값을 출력한다.
3) main에서 함수를 call하여 시작값과 끝나는 값을 입력받고 입력받은 숫자의 범위에서 짝수의 개수를 넘겨주는 함수 만들기

ex)
public class ExMain{
	public static void main(String[] args){
	    1) print();
	    2) sum(10,50);
	    3) int count = countEven(1, 10);
	       System.out.println("짝수 개 : "+count);
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
		System.out.println("짝수 개: "+ count);

	}

}
