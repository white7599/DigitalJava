package krMyArrayList;

public class MyArrayList {
	private MyNode[] arr = new MyNode[10];
	private int size = 0;
	
	void add(MyNode node) {	
		//�迭�� ���̺��� �� ���� �����ؾ� �Ǵ� ��� ����
		if(size >= arr.length) {
			MyNode[] newArr = new MyNode[arr.length*2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
		arr[size++] = node;		
	}
	
	MyNode get(int index) {
		if(index >=0 && index < size)
			return arr[index];
		return null;
	}
	
	MyNode remove(int index) {
		MyNode ret = arr[index];
		//������ �ε������� �ε���+1�� ����Ÿ�� ������ �о���
		for(int i=0; i<size;i++)
			arr[index+i] = arr[index+i+1];		
		arr[size] = null;		
		--size;
		
		return ret;
	}
	
	int size() {
		return this.size;
	}
	
	boolean isEmpty() {
		return ((this.size == 0)? true: false);
	}
	
	void clear() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = null;
		}
		size = 0;
		
		/*arr = new MyNode[10];
		System.gc();*/
	}
	
	
}
