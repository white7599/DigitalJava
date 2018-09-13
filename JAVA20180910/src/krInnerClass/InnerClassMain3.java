package krInnerClass;

class OClass{
	
	class IClass{
		int iv = 100;
		
	}
	
	static class SClass{
		int iv = 200;
		static int cv = 300;
	}
	
	void method() {
		class LClass{
			int iv = 400;
		}
		
		LClass lc = new LClass();
		System.out.println("LClass.iv: " + lc.iv);
	}
}

public class InnerClassMain3 {

	public static void main(String[] args) {
		OClass oc = new OClass();
		OClass.IClass ic = oc.new IClass();
		
		System.out.println("ic.iv : "+ic.iv );
		System.out.println("OClass.SClass.cv: "+OClass.SClass.cv);
		OClass.SClass sc = new OClass.SClass();
		System.out.println("sc.iv: "+sc.iv);
		
		oc.method();
	}

}
