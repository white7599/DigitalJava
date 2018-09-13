package krJavaJungsukch7;

public class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		if(width > 0 && height > 0) 
			return (width * height);
		 else 
			return 0.0;
	}
	
	boolean isSquare() {
		if(width > 0 && height > 0 && width == height)
			return true;
		else
			return false;
	}

}
