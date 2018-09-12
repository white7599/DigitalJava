package krArrayList;

import java.util.ArrayList;

public class ExArrayListMain {

	public static void main(String[] args) {
		ArrayList<MyNode> al = new ArrayList();
		for(int i=1; i<5; ++i) {
			al.add(new MyNode(i));
		}
		System.out.println("size = "+al.size());

		for(int i=0; i<4; ++i) {
			System.out.print(" ["+i+"]"+al.get(i));
		}
		System.out.println();
		
		System.out.println("al.remove(0) 실행 -----------");
		al.remove(0);	//index 0 삭제
		for(int i=0; i<al.size(); i++) {
			System.out.print(" ["+i+"]"+al.get(i));
		}
		System.out.println();
		
		al.clear();
		System.out.println("clear() 후 size = " + al.size());
	}

}
