package krInnerClass;

class Outer{
	int outValue;
	
//	Inner in = new Inner();	//안에서 inner class 생성자 먼저 생성 
	
	class Inner{
		int innerValue;
	}
	
	static class StaticClass{
		int staticValue;
		static int staticInt;
	}
}
public class InnerClassMain {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outValue = 10;
//		out.in.innerValue = 100;	// outer class 안에서 inner class new를 먼저 한 경우 사용 가능
		
//		new 시에 inner class는 outer class의 생성한 참조변수를 통하여 생성 가능 
		Outer.Inner in = out.new Inner();
		in.innerValue = 100;
		
		Outer.StaticClass stInner = new Outer.StaticClass();
		stInner.staticValue = 1000;
		Outer.StaticClass.staticInt = 10000;
		
		
	}

}
