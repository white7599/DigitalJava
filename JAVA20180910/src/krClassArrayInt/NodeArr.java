package krClassArrayInt;

public class NodeArr {
	MyNode[] arr = new MyNode[5];
	static int index = 0;	//���� ������ ������ 1�� ����
	
	void init() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = new MyNode(0);
		}
	}
	
	void add(int num) {
		if(index < arr.length)
			arr[index++].value = num;
		else
			System.out.println("�迭���� �ʰ�: add(int num)");
		
		
	}
	
	void add(MyNode node) {
		if(index < arr.length)
			arr[index++] = node;
		else
			System.out.println("�迭���� �ʰ�: add(MyNode node)");
	}
	
	void printAll() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ ((i==arr.length-1)? "": ", "));
		}
		System.out.println();
	}
}
