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
			System.out.println("범위 초과");
		}
	}
	
	static void reSize() {
		//새로운 배열을 생성한다. (기존의 배열보다 2배 크게 만든다)
		int[] cpyArr = new int[intStack.length*2];
		
		//새로운 배열의 각요소에 기존 배열의 각 요소값을 복사한다. 
		/*for(int i=0; i<intStack.length; i++) {
			cpyArr[i] = intStack[i];
		}*/
		System.arraycopy(intStack, 0, cpyArr, 0, intStack.length);
		//기존의 배열명(참조변수) <-- 새로 생성한 배열명(참조변수)
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
