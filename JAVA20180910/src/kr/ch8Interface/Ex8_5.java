package kr.ch8Interface;

public class Ex8_5 {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();
	}

}
