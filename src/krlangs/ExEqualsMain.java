package krlangs;

public class ExEqualsMain {

	public static void main(String[] args) {		
		MyPoint point = new MyPoint(2, 3);
		MyPoint cpyPoint = new MyPoint(2, 3);
		
		//�� ������ �� �ϱ� ���ؼ��� == ������ ����ϸ� �ȵ�
		if(point == cpyPoint) {
			System.out.println("(point == cpyPoint) ��: point == cpyPoint");
		} else {
			System.out.println("(point == cpyPoint) ��: point != cpyPoint");	// ��� ���(�ּҰ� ���ϹǷ�)
		}
		
		String str = new String("ȫ�浿");
		String newStr = new String("ȫ�浿");
		
		//�ڹ� lang ���� �⺻ �����Ǵ� Ŭ������ �޼ҵ�� �ٷ� ����Ͽ��� �ȴ�.
		if(str.equals(newStr)) {
			System.out.println("str == newStr");	// ��� ���
		} else {
			System.out.println("str != newStr");
		}
		
		if(point.equals(cpyPoint)) {
			System.out.println("point == cpyPoint");
		} else {
			System.out.println("point != cpyPoint"); // ��� ���: ������ ���� Ŭ������ ���� equals�� �ȵ� �������̵��Ͽ� equals�� ������ ��� ��.	
		}	
		
		
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);		
		
		System.out.println("====cpyPoint(10, 30)���� ���� ��====");
		cpyPoint.x = 10;
		cpyPoint.y = 30;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);
		
		cpyPoint = point.clone();
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("====clone���� ���� ��====");
		cpyPoint.x = 1111;
		cpyPoint.y = 2222;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);
		
		
		
		
		
		
		/*MyPoint point = new MyPoint(2, 3);
		MyPoint cpyPoint = new MyPoint(0, 0);
		
		cpyPoint = point;	//������������ �̹Ƿ� �ּҰ� �����ϱ⿡ �ȵ�
		
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);		
		
		System.out.println("====cpyPoint(10, 30)���� ���� ��====");
		cpyPoint.x = 10;
		cpyPoint.y = 30;
		System.out.println("cpyPoint: " + cpyPoint);
		System.out.println("point: " + point);*/
		
		

	}

}
