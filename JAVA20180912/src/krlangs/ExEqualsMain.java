package krlangs;

public class ExEqualsMain {

	public static void main(String[] args) {		
		MyPoint point = new MyPoint(2, 3);
		MyPoint cpyPoint = new MyPoint(2, 3);
		
		//실 데이터 비교 하기 위해서는 == 연산자 사용하면 안됨
		if(point == cpyPoint) {
			System.out.println("(point == cpyPoint) 비교: point == cpyPoint");
		} else {
			System.out.println("(point == cpyPoint) 비교: point != cpyPoint");	// 요놈 출력(주소값 비교하므로)
		}
		
		String str = new String("홍길동");
		String newStr = new String("홍길동");
		
		//자바 lang 에서 기본 제공되는 클래스의 메소드는 바로 사용하여도 된다.
		if(str.equals(newStr)) {
			System.out.println("str == newStr");	// 요놈 출력
		} else {
			System.out.println("str != newStr");
		}
		
		if(point.equals(cpyPoint)) {
			System.out.println("point == cpyPoint");
		} else {
			System.out.println("point != cpyPoint"); // 요놈 출력: 본인이 만든 클래스인 경우는 equals가 안됨 오버라이딩하여 equals를 구현해 줘야 함.	
		}	
		
		
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);		
		
		System.out.println("====cpyPoint(10, 30)으로 변경 후====");
		cpyPoint.x = 10;
		cpyPoint.y = 30;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);
		
		cpyPoint = point.clone();
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("====clone으로 변경 후====");
		cpyPoint.x = 1111;
		cpyPoint.y = 2222;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);
		
		
		
		
		
		
		/*MyPoint point = new MyPoint(2, 3);
		MyPoint cpyPoint = new MyPoint(0, 0);
		
		cpyPoint = point;	//참조변수끼리 이므로 주소값 복사하기에 안됨
		
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);		
		
		System.out.println("====cpyPoint(10, 30)으로 변경 후====");
		cpyPoint.x = 10;
		cpyPoint.y = 30;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);*/
		
		

	}

}
