package krException;

public class ExceptionThrows {
	public static void main(String[] args) {// throws Exception {
//		method();
		try {
			throw new MyException("MyException"); 
		} catch(MyException e){
			System.out.println(e.getMessage()+", "+e.getErrorCode());
		
		}
	}
	
	static void method() {	//throws Exception{
//		method2();
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("method() 예외 발생");
			e.printStackTrace();
		}
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}
}
