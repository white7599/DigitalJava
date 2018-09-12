package krLambda;

import java.util.function.IntBinaryOperator;

public class MyIntBinaryOperator implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		if(left > right)
			return left;
		return right;
		
//		return ((left>right)?left:right);
	}

}
