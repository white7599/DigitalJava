package examStudent;

public class ExStMain {

	public static void main(String[] args) {
		/*for(int i=1; i<5; i++) {
			ExStudent st = new ExStudent("choi"+i, 3, 100, 90, 80);
			System.out.println(st);
		}	*/
		
		ExClassStudent cs = new ExClassStudent(5);
		for(int i=0; i<cs.stClass.length+1; i++) {
			int index = cs.add(new ExStudent("choi"+i, 3, 100+i, 90+i, 80+i));
			System.out.println(cs.stClass[index]);
		}
		
		ExStudent st = cs.search("choi3");
		System.out.println(st);
		
		System.out.println("remove(5) 후 결과값: ");
		ExStudent removeSt = cs.remove(3);
		System.out.println(removeSt);
		
		
		for(int i=0; i<cs.stClass.length; i++) {
			System.out.println(cs.stClass[i]);
		}
		
	}
}
