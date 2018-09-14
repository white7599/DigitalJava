package krJavaExam0913;

public class Student extends Person implements ScoreInterface {
	private static int stdid = 1001;		//학번(시작값: 1001)
	int subjectsCount = Subject.values().length;	//과목수	
	private int[] subject = new int[subjectsCount];	//과목 점수
	private int id;		//객체 아이디
	
	Student(String n) {
		super(n);
	}
	
	Student(String n, int[] subject){
		super(n);
		id = stdid++;
		this.subject = subject;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int total() {
		int totalScore = 0;
		for(int i=0; i<subject.length; i++) {
			totalScore += subject[i];
		}
		return totalScore;
	}
	@Override
	public double average() {
		double avg = 0;
		if(subject.length > 0)
			avg = ((double)total()/subject.length);
		return avg;
	}
	
	public void setKor(int kor) {
		subject[Subject.KOR.ordinal()] = kor;
	}
	
	public int getKor() {
		return subject[Subject.KOR.ordinal()];
	}
	
	public void setEng(int eng) {
		 subject[Subject.ENG.ordinal()] = eng;
	}
	
	public int getEng() {
		return subject[Subject.ENG.ordinal()];
	}
	
	public void setMath(int math) {
		subject[Subject.MATH.ordinal()] = math;
	}
	
	public int getMath() {
		return subject[Subject.MATH.ordinal()];
	}
	
	
	public void setSubject(int kor, int eng, int math) {
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
	
	public int[] getSubject() {
		int[] subject = new int[3];
		subject[0] = getKor();
		subject[1] = getEng();
		subject[2] = getMath();
		
		return subject;
	}
	
	/*public static void main(String[] args) {
		int[] subject = {100,100,100};
		Student st = new Student("cho", subject);
		System.out.println(st.getId());
		
		Student st1 = new Student("cho1", subject);
		System.out.println(st1.getId());
		int[] ss = st1.getSubject();
		System.out.println(ss[0]);
		
	}*/
	
	public String toString() {
		return this.id+"";
	}
	
	
	
	

}
