package krJavaJungsukch7;

public class Circle extends Shape {
	double r;	//������
	
	Circle(double r){
		super();
		this.r = r;
	}
	
	@Override
	double calcArea() {
		//pi * ������ * ������
		if(r>0) 
			return (Math.PI * r * r);
		else 
			return 0.0;
	}

}
