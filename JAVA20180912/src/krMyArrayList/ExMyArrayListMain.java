package krMyArrayList;

public class ExMyArrayListMain {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		for(int i=1; i<15; i++) {
			list.add(new MyNode(i));
		}
		System.out.println("add 4번 1,2,3,4 저장함..");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print("["+i+"]"+list.get(i)+", ");
		}
		System.out.println();
		
		MyNode reNode = list.remove(0);
		System.out.println("index 0번 삭제..."+reNode);
		//저장된 내용 출력
		for(int i=0; i<list.size(); i++) {
			System.out.print("["+i+"]"+list.get(i)+", ");
		}
		System.out.println();

	}

}
