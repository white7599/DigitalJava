package krJavaJungsukch7;
class Outer{
	class Inner{
		int iv = 100;
	}
}

public class Ex7_25 {

	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.Inner ic = oc.new Inner();
		System.out.println(ic.iv);
		

	}

}
