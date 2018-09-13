package krException;

public class ExceptiongetMessage {

	public static void main(String[] args) {
		try {
			System.out.println("나누기");
			System.out.println(0/0);
			System.out.println("0으로 나누었습니다.");
			throw new Exception();	//고의적으로 오류 발생시킬 때
		} catch (Exception e) {
			System.out.println("e.getMessage(): "+e.getMessage());
			e.printStackTrace();
		}	
		System.out.println("프로그램 종료");
		

	}

}
