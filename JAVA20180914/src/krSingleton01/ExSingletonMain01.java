package krSingleton01;

public class ExSingletonMain01 {

	public static void main(String[] args) {
//		MySingleton01 mysingleton = new MySingleton01(); //The constructor MySingleton01() is not visible error! -> private ������ -> ��ü ���� �Ұ�
		
		MySingleton01 mysingleton = MySingleton01.getInstance();
		mysingleton.info();
		
		
		

	}

}
