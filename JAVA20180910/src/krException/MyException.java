package krException;

//������ exception class �����Ͽ� ó���� ���
public class MyException extends Exception {
	private final int ERROR_CODE;
	
	MyException(String msg, int errCode){
		super(msg);
		ERROR_CODE = errCode;		
	}
	
	MyException(String msg){
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERROR_CODE;
	}
}
