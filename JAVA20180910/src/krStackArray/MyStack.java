package krStackArray;

public class MyStack {
	MyNode[] stack;
	int top = 0;	//index와 같음
	
	MyStack(int size){
		stack = new MyNode[size];
		init();
	}
	
	void init() {	//init와 같음
		// 노드를 모두 만들어서 노드의 필드 value에 0으로 초기화
		for(int i=0; i<stack.length; i++) {
			stack[i] = new MyNode(0);
			stack[i].setValue(0);
		}
	}
	
	//데이터 들어오는 순서대로 배열에 추가함
	void push(int num) {	//add와 같음
		if(num <= stack.length)
			stack[top++].setValue(num);		
		/*try {
			stack[top++].setValue(num);
		} catch(Exception e) {
			System.out.println(e.getMessage());			
		}*/
	}
	
	int pop() {	//delete 와 같음
		int ret = -1;
		//stack에서 삭제할 객체의 데이터를 return 하여 준다.
		--top;
		if(top >= 0) {
			ret = stack[top].getValue(); //저장된 데이터를 넘겨준다.
			//stack[top] = null;
		}
		else {
			System.out.println("stack empty");
		}
		return ret;	
		
		/*if(top !=stack.length) {
			stack[top] = null;
			int ret = stack[top].getValue();
		} 
		return ret;*/
	}
	
	void printAll(String MethodName) {	//stack에 저장된 데이터를 출력한다.
		System.out.println(MethodName);
		for(int i=0; i<stack.length; i++)
			System.out.print(stack[i]+((i==stack.length-1)? "": ", "));
		System.out.println();
	}
	
}
