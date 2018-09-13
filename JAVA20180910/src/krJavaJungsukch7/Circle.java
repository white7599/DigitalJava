package krJavaJungsukch7;

public class Circle extends Shape {
	double r;	//반지름
	
	Circle(double r){
		super();
		this.r = r;
	}
	
	@Override
	double calcArea() {
		//pi * 반지금 * 반지름
		if(r>0) 
			return (Math.PI * r * r);
		else 
			return 0.0;
	}

}
