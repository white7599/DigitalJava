package krInnerClass;

class OutClass{
	private int outerIv = 0;
	static int outerCv = 1;
	
	class InClass{
		int inValue = outerIv;
		int inValue2 = outerCv;
		
	}
	
	static class StClass{
//		int stValue = outerIv;	//
		static int stCv = outerCv;
		static void method1() {
			
		}
	}
	
	void method() {
		int lv = 2;
		final int FINAL_LV = 3;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;	//
			int liv3 = lv;
			int liv4 = FINAL_LV;
		}
		
		LocalInner li = new LocalInner();
		System.out.println("li.liv: " +li.liv);
		System.out.println("li.liv2: " +li.liv2);
		System.out.println("li.liv3: " +li.liv3);
		System.out.println("li.liv4: " +li.liv4);
		
	}
}
public class InnerClassMain2 {

	public static void main(String[] args) {
		OutClass out = new OutClass();
//		OutClass.InClass in = out.new InClass();
//		OutClass.StClass st = new OutClass.StClass();
		out.method();
		System.out.println(out.outerCv);
//		System.out.println(in.inValue);
//		System.out.println(st.stCv);
		
		

	}

}
