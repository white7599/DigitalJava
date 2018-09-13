package thisJavaCh9NestedClass;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}		
	};
	
	Vehicle field2 = ()->System.out.println("자전거가 달립니다.2");
	
	void method() {
		Vehicle localVar = ()->System.out.println("승용차가 달립니다.");
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
	
	
}
