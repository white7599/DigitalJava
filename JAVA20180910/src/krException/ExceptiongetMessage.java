package krException;

public class ExceptiongetMessage {

	public static void main(String[] args) {
		try {
			System.out.println("������");
			System.out.println(0/0);
			System.out.println("0���� ���������ϴ�.");
			throw new Exception();	//���������� ���� �߻���ų ��
		} catch (Exception e) {
			System.out.println("e.getMessage(): "+e.getMessage());
			e.printStackTrace();
		}	
		System.out.println("���α׷� ����");
		

	}

}
