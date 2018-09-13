package krClassArrayInt;

public class NodeArr {
	MyNode[] arr = new MyNode[5];
	static int index = 0;	//값을 저장할 때마다 1씩 증가
	
	void init() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = new MyNode(0);
		}
	}
	
	void add(int num) {
		if(index < arr.length)
			arr[index++].value = num;
		else
			System.out.println("배열범위 초과: add(int num)");
		
		
	}
	
	void add(MyNode node) {
		if(index < arr.length)
			arr[index++] = node;
		else
			System.out.println("배열범위 초과: add(MyNode node)");
	}
	
	void printAll() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ ((i==arr.length-1)? "": ", "));
		}
		System.out.println();
	}
}
