package krLambda;

public class ExInterLambdaMain {
	static int[] arr = {10, 20};
	
	public static int add(MyInterface inter) {
		return inter.add(arr[0], arr[1]);
	}

	public static void main(String[] args) {
		int sum = add(new MyClass());
		
		System.out.println("sum = "+sum);
		
		int sum1 = add(new MyInterface() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
			
		});		
		System.out.println("sum1 = "+ sum1);

//		MyInterface my = (x,y)->{return x+y};
		MyInterface my = (x,y)->(x+y);
		int sum3 = add(my);
		System.out.println("sum3 = "+sum3);

		
	}

}
