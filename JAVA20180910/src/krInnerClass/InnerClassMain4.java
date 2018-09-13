package krInnerClass;

class OC{
	int value = 10;
	
	class IC{
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("value: "+value);	//30
			System.out.println("this.value: "+this.value);	//20
			System.out.println("OC.this.value: "+OC.this.value);	//10			
		}
	}
}

public class InnerClassMain4 {

	public static void main(String[] args) {
		OC oc = new OC();
		OC.IC ic = oc.new IC();
		ic.method();

	}

}
