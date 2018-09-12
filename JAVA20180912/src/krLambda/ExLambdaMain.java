package krLambda;

public class ExLambdaMain {

	public static void main(String[] args) {
		MyFuncInterface fi;
		
		fi=()->{
			String str = "method call";
			System.out.println(str);
		};
		fi.method();

		//익명 개체 생성 시 
		/*fi = new MyFuncInterface() {
			public void method() {
				String str = "method call";
				System.out.println(str);
		};*/
		
		MyFuncInterface2 fi2;
		fi2=(x)->{
			String str = x+ "interface2 : method call";
			System.out.println(str);
		};
		
		fi2.method(19);
		
		MyFuncInterface3 fi3 = (x, y) ->{return x+y;};
		MyFuncInterface3 fi3_2 = (x, y) -> x+y;
		
		
		
		
		
	}

}
