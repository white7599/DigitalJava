package krInnerClass;

class Outer{
	int outValue;
	
//	Inner in = new Inner();	//�ȿ��� inner class ������ ���� ���� 
	
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
//		out.in.innerValue = 100;	// outer class �ȿ��� inner class new�� ���� �� ��� ��� ����
		
//		new �ÿ� inner class�� outer class�� ������ ���������� ���Ͽ� ���� ���� 
		Outer.Inner in = out.new Inner();
		in.innerValue = 100;
		
		Outer.StaticClass stInner = new Outer.StaticClass();
		stInner.staticValue = 1000;
		Outer.StaticClass.staticInt = 10000;
		
		
	}

}
