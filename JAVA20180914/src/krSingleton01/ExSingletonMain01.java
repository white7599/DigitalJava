package krSingleton01;

public class ExSingletonMain01 {

	public static void main(String[] args) {
//		MySingleton01 mysingleton = new MySingleton01(); //The constructor MySingleton01() is not visible error! -> private 积己磊 -> 按眉 积己 阂啊
		
		MySingleton01 mysingleton = MySingleton01.getInstance();
		mysingleton.info();
		
		
		

	}

}
