package krMyArrayList;

public class MyArrayList {
	private MyNode[] arr = new MyNode[10];
	private int size = 0;
	
	void add(MyNode node) {	
		//배열의 길이보다 더 많이 저장해야 되는 경우 제외
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
		//삭제된 인덱스부터 인덱스+1한 데이타를 앞으로 밀어줌
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
