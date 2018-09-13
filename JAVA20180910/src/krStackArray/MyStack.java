package krStackArray;

public class MyStack {
	MyNode[] stack;
	int top = 0;	//index�� ����
	
	MyStack(int size){
		stack = new MyNode[size];
		init();
	}
	
	void init() {	//init�� ����
		// ��带 ��� ���� ����� �ʵ� value�� 0���� �ʱ�ȭ
		for(int i=0; i<stack.length; i++) {
			stack[i] = new MyNode(0);
			stack[i].setValue(0);
		}
	}
	
	//������ ������ ������� �迭�� �߰���
	void push(int num) {	//add�� ����
		if(num <= stack.length)
			stack[top++].setValue(num);		
		/*try {
			stack[top++].setValue(num);
		} catch(Exception e) {
			System.out.println(e.getMessage());			
		}*/
	}
	
	int pop() {	//delete �� ����
		int ret = -1;
		//stack���� ������ ��ü�� �����͸� return �Ͽ� �ش�.
		--top;
		if(top >= 0) {
			ret = stack[top].getValue(); //����� �����͸� �Ѱ��ش�.
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
	
	void printAll(String MethodName) {	//stack�� ����� �����͸� ����Ѵ�.
		System.out.println(MethodName);
		for(int i=0; i<stack.length; i++)
			System.out.print(stack[i]+((i==stack.length-1)? "": ", "));
		System.out.println();
	}
	
}
