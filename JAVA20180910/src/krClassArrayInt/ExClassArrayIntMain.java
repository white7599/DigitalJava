package krClassArrayInt;


public class ExClassArrayIntMain {
	static final int ARR_SIZE=5;
	static MyNode[] myArr = new MyNode[ARR_SIZE];
	static int index = 0;
	
	public static void init() {
		//배열을 초기화 한다.(배열의 모든 객체를 0값을 넣는다.)
		for(int i=0; i<myArr.length; i++) {
			myArr[i] = new MyNode(0);
		}
	}
	/*static int index = 0;
	
	public static void add(MyNode node) {
		myArr[index++] = node;		
	}*/
		
	//원하는 index에 value 넣어주기
	public static void add(int index, int value) {
		if(myArr != null)
			myArr[index].value = value;
	}
	
	public static void add(int value) {
//		if(myArr.length != index)
		if(index < myArr.length)
			myArr[index++].value = value;
		else
			System.out.println("배열 범위 초과");
		
	}
	
	public static void add(int index, MyNode node) {
		myArr[index] = node;
	}
	
	public static void add(MyNode node) {
		if(index < myArr.length)
			myArr[index++] = node;
		else
			System.out.println("배열범위 초과");
	}
	
	public static void printAll() {
		for(int i=0; i<myArr.length;i++) {
			System.out.print(myArr[i]+", ");
		}
		System.out.println();
	}
	public static void delete() {
		//항상 마지막 데이터를 삭제한다.(맨 마지막 저장된 데이터를 삭제한다.)
		
		/*if(index >= 0)
			myArr[--index] = null;*/
		
		int tmp = 0;
		if(index > 0 ) {
			tmp = myArr[index].value;
			myArr[index] = null;
		}
		
	}
	
	public static void main(String[] args) {
		init();
		
		//배열에 값 넣기 // 1,2,3,4,5
		for(int i=0; i<myArr.length; i++) {
//			myArr[i].value = i+1;		//init()에서 객체 생성했기에 직접 값 입력한다.	
			add(i+1);
		}
		add(0, 999);
		printAll();
		//delete 
		for(int j=0; j<myArr.length;j++) {
			delete();
			System.out.print("["+j+"]: ");printAll();
		}
	
		printAll();	
		
		
		
		MyNode addNode = new MyNode(111);
		add(3, addNode);
//		add(3, new MyNode(111));
		System.out.println("new node start---------");
		NodeArr nodearr = new NodeArr();
		nodearr.init();
		nodearr.printAll(); //0,0,0,0,0
		nodearr.add(1); 
		nodearr.add(2);	
		nodearr.printAll();//1,2,0,0,0
		MyNode node = new MyNode(30);
		nodearr.add(node);
		nodearr.printAll(); //1,2,30,0,0
System.out.println("new node end ----------");
System.out.println();

			
		/*for(int i=0; i<myArr.length; i++)
			System.out.println(myArr[i]);*/
		
		
		
		
		
		
		
		
		
		
		/*NodeArr nodearr = new NodeArr();
		nodearr.add(10);		
		nodearr.add(new MyNode());		 
		*/
		/*MyNode node = new MyNode(10);
		myArr[0] = node;		
		
		add(node);
		
//		node.value = 1;
		add(new MyNode(1));
//		node.value = 2;
		add(new MyNode(2));*/
		
		/*int i=0;
		MyNode addNode = new MyNode(5);
		myArr[0] = addNode;
		myArr[1] = new MyNode(50);	
		
		
		for(int ii=0; ii<myArr.length; ii++)
			System.out.println(myArr[ii]);*/
		
		
		
		/*for(int i=0; i<myArr.length; i++) {
			myArr[i] = new MyNode(i+1);
			
			System.out.println(myArr[i]);
		}*/
		
		

	}

}
