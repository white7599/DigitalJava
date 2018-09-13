package krStackArray2;

public class ExIntStackMain {
	static final int STACK_SIZE = 5;
	static int[] intStack = new int[STACK_SIZE];
	static int top = 0;
	
	static void init() {
		for(int i=0; i<intStack.length; i++) {
			intStack[i] = 0;
		}
		top = 0;
	}
	
	static void printAll() {
		for(int i=0; i<intStack.length; i++) {
			System.out.print(intStack[i]+", ");
		}
		System.out.println();
	}
	
	static void push(int value) {
		if (top<intStack.length)
			intStack[top++] = value;	
		else {
			/*reSize();
			intStack[top++] = value;*/
			System.out.println("���� �ʰ�");
		}
	}
	
	static void reSize() {
		//���ο� �迭�� �����Ѵ�. (������ �迭���� 2�� ũ�� �����)
		int[] cpyArr = new int[intStack.length*2];
		
		//���ο� �迭�� ����ҿ� ���� �迭�� �� ��Ұ��� �����Ѵ�. 
		/*for(int i=0; i<intStack.length; i++) {
			cpyArr[i] = intStack[i];
		}*/
		System.arraycopy(intStack, 0, cpyArr, 0, intStack.length);
		//������ �迭��(��������) <-- ���� ������ �迭��(��������)
		intStack = cpyArr;
		
		
	}
	
	static int pop() {
		int ret = -1;
		--top;
		if(top >=0) {
			ret = intStack[top];
			intStack[top] = 0;
		} else {
			System.out.println("empty");
		}
		return ret;
	}
	
	public static void main(String[] args) {
		init();
		printAll();	//0,0,0,0,0
		
		for(int i=0; i<intStack.length+2;++i) {
			push(i);
		}
		printAll();		//0,1,2,3,4
		reSize();
		push(10);
		push(12);
		printAll();		//0,1,2,3,4
		
		/*for(int i=0; i<intStack.length; i++) {
			int tmp = pop();
			System.out.print(tmp+", ");
		}	//4,3,2,1,0
		System.out.println();
		
//		init();
		
		push(10);
//		printAll();
		push(30);
//		printAll();
		pop();
//		printAll();
		push(50);
		printAll();*/

	}

}
