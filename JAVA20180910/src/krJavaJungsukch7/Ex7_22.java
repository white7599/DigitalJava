package krJavaJungsukch7;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();	//������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+", "+y+"]";
	}
}

public class Ex7_22 {
	
	static double sumArea(Shape[] arr) {
		double totalArea=0.0;
		for(int i=0; i<arr.length; i++) {
			totalArea += arr[i].calcArea();
		}
		
		return totalArea;
	}

	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("������ ��: "+sumArea(arr));		
		
		Circle circle = new Circle(2);
		System.out.println(circle.calcArea());
		
		Rectangle rec = new Rectangle(4,4);
		System.out.println(rec.calcArea());
		System.out.println(rec.isSquare());
	}
}
