package thisJavaCh9NestedClass;

public class AnonymousMain {
	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		ano.field.run();
		ano.field2.run();
		ano.method();
		ano.method2(()->System.out.println("트럭이 달립니다."));
	}
}
