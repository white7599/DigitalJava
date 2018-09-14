package examStudent;

public class ExStudent extends ExPerson implements ScoreInterface {
	final static int DEFAULT_SUBJECTCOUNT = 3;
	static int default_id = 1001;
	private int id = 0;
	private int[] subject;
	
	ExStudent(String name) {
//		super(name);
		this(name, DEFAULT_SUBJECTCOUNT);
	}
	
	ExStudent(String name, int subjectCount){
		this(name,subjectCount,0,0,0);
	}
	
	ExStudent(String name, int subjectCount, int kor, int eng, int math) {
		super(name);
		subject = new int[subjectCount];
		setId(default_id);
		setSubject(kor, eng, math);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
		++this.default_id;
	}

	public int[] getSubject() {
		return subject;
	}

	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	public void setSubject(int kor, int eng, int math) {
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
	
	public int getKor() {
		return subject[Subject.KOR];
	}
	
	public void setKor(int kor) {
		this.subject[Subject.KOR] = kor;
	}
	
	public int getEng() {
		return subject[Subject.ENG];
	}
	
	public void setEng(int eng) {
		this.subject[Subject.ENG] = eng;
	}
	
	public int getMath() {
		return subject[Subject.MATH];
	}
	
	public void setMath(int math) {
		this.subject[Subject.MATH] = math;
	}
	
	public String toString() {
		return this.getId() + " : " + super.getName()+": "+this.getKor()+", "+this.getEng()+", "+this.getMath()
				+" [ÃÑÁ¡: "+this.total()+", Æò±Õ: "+this.average()+"]";
	}

	@Override
	public int total() {
		int sum =0;
		for(int tmp: subject) {
			sum += tmp;
		}
		return sum;
	}

	@Override
	public double average() {
		int total = this.total();		
		return (double)total/subject.length;
	}
	
	
	

}
