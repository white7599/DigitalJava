package krSingleton01;

public class MySingleton01 {
	private static MySingleton01 singleton = new MySingleton01();
	
	private MySingleton01() {}
	
	public static MySingleton01 getInstance() {
		return singleton;
	}
	
	public void info() {
		System.out.println("singleton");
	}
}
