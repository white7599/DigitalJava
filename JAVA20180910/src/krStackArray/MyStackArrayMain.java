package krStackArray;

public class MyStackArrayMain {

	public static void main(String[] args) {
		MyStack mystack = new MyStack(10);
		
		mystack.init();
		mystack.printAll("=====mystack.init()========");
		
		for(int i=0; i<10; ++i) {
			mystack.push(i+1);
		}
		mystack.printAll("=====mystack.push()========");
		
		System.out.println("=====mystack.pop()========");
//		for(int j=0; j<mystack.stack.length; ++j) {
		for(int j=0; j<12; ++j) {
			int ret = mystack.pop();
			System.out.print(ret+ ((j == (mystack.stack.length-1)) ? "" : ", "));
		}	//5,4,3,2,1 Ãâ·Â		

	}

}
