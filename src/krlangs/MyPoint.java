package krlangs;

public class MyPoint {
	int x, y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return this.x+", "+this.y;
	}
	
	@Override
	public boolean equals(Object p) {
		MyPoint point = (MyPoint)p;	//type casting @override annotation 사용하려면 object 받아서 캐스팅 해줘야 함.
		if(this.x == point.x && this.y == point.y) {
			return true;
		}
		return false;
	}
	
//	@Override
	public MyPoint clone() {
		return new MyPoint(this.x, this.y);
	}
	
}
