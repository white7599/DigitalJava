package krlangs;

public class Rect {
	int width;
	int height;	
	
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
		
	@Override
	public boolean equals(Object o) {
		Rect rect = (Rect)o;
		int objectArea = rect.width * rect.height;
		int thisRectArea = this.width * this.height;
		
		if(objectArea == thisRectArea) {
			return true;
		} else {
			return false;
		}	
		
//		return ((objectArea == thisRectArea)? true: false); //삼항 연산자
	}
}
