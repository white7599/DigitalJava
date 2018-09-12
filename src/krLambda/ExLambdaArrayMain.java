package krLambda;

import java.util.function.IntBinaryOperator;

public class ExLambdaArrayMain {

	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result, score);			
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		MyIntBinaryOperator myIntBO = new MyIntBinaryOperator();
		int tmp = maxOrMin(myIntBO);
		System.out.println("tmp: "+tmp);
		
		int tmp1 = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return ((left>right)?left:right);
			}
			
		}); 
		
		int max = maxOrMin(new MyIntBinaryOperator() {
			public int applyAsInt(int left, int right) {
				return ((left>right)?left:right);
			}
		});
		
		System.out.println("max : " + max);
		
		int min = maxOrMin(new MyIntBinaryOperator() {
			public int applyAsInt(int left, int right) {
				return ((left>right)?left:right);
			}
		});
		System.out.println("min : "+ min);
		
		
		IntBinaryOperator ib = (left, right)-> {
			return ((left>right)?left:right);
		};
		
		int tmp2 = maxOrMin(ib);
		
		System.out.println("tmp2 = "+tmp2);

	}

}
