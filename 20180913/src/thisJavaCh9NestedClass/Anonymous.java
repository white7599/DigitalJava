package thisJavaCh9NestedClass;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}		
	};
	
	Vehicle field2 = ()->System.out.println("�����Ű� �޸��ϴ�.2");
	
	void method() {
		Vehicle localVar = ()->System.out.println("�¿����� �޸��ϴ�.");
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
	
	
}
