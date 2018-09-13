package krJavaJungsukch7;

class Outer727{
	int value = 10;
	
	class Inner727{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer727.this.value);
		}
	}
}

public class Ex7_27 {

	public static void main(String[] args) {
		Outer727 outer = new Outer727();		
		Outer727.Inner727 inner = outer.new Inner727();
		
		inner.method1();

	}

}
