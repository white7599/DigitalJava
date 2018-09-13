package krStackArray;

public class MyNode {
	private int value;

	MyNode(){
		this(0);
	}
	
	MyNode(int value){
		setValue(value);
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}	
	
	@Override
	public String toString() {
		return ""+getValue();
	}
	
}
