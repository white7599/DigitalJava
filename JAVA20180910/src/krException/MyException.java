package krException;

//나만의 exception class 생성하여 처리할 경우
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
