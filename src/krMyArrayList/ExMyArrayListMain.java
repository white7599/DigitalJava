package krMyArrayList;

public class ExMyArrayListMain {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		for(int i=1; i<15; i++) {
			list.add(new MyNode(i));
		}
		System.out.println("add 4�� 1,2,3,4 ������..");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print("["+i+"]"+list.get(i)+", ");
		}
		System.out.println();
		
		MyNode reNode = list.remove(0);
		System.out.println("index 0�� ����..."+reNode);
		//����� ���� ���
		for(int i=0; i<list.size(); i++) {
			System.out.print("["+i+"]"+list.get(i)+", ");
		}
		System.out.println();

	}

}
