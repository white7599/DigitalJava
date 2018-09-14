package examStudent;

public class ExClassStudent {
	ExStudent[] stClass;
	int stIndex = 0;
	int stCont = 0;
	
	ExClassStudent(int stCont){
		stClass = new ExStudent[stCont];
		this.stCont = stCont;
		
	}
	
	//반환값: 추가된 index값을 리턴한다.
	public int add(ExStudent st) {
		try {
			if(st != null) {
				stClass[stIndex] = st;
				++stIndex;		
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 초과: 저장 불가");
		} 
		return stIndex-1;	
	}
	
	//검색(인자: 이름, 반환값: 검색한 배열의 index 값을 넘겨준다.
	public ExStudent search(String name) {
		for(ExStudent st : stClass) {
			if(null != st) {
				if(name.equals(st.getName())) {
					return st;
				}
			}
		}
		return null;
	}
	
	public int searchName(String name) {
		int searchIndex = -1;
		for(int i=0; i<stClass.length; i++) {
			if(stClass[i] != null) {
				if(stClass[i].getName().equals(name)) {
					searchIndex = i;
					break;
				}
			}
		}
		return searchIndex;
	}
	
	//삭제 remove 반환값: 삭제할 값을 넘겨준다.
	public ExStudent remove(int index) {
		ExStudent delStudent = stClass[index];
		--stIndex;
		for(int i=index; i<(stClass.length-1); i++) {
			stClass[i] = stClass[i+1];
		}
		stClass[stClass.length-1] = null;
		
		return delStudent;
	}
	
	public ExStudent remove(String name) {
		ExStudent st = null;
		int index = searchName(name);
		if(index > -1)	{
			return remove(index);
		}
		return st;
	}
	/* 해당 index 내용 변경하기*/
	public void edit(int index) {
		
	}
	public void edit(String searchName, ExStudent newSt) {
		ExStudent st = null;
		int index = searchName(searchName);
		if(index > 0)
			stClass[index] = newSt;		
	}
	
	public void clear() {
		stClass = new ExStudent[stCont];
	}
	
	public ExStudent get(int index) {
		return stClass[index];
	}
	
	public int total() {
		int total=0;
		for(ExStudent tmp: stClass) {
			if(tmp == null)
				break;
			total += tmp.total();
		}
		return total;
	}
	
	public double average() {
		return (double)this.total()/this.stCont;
	}
	
	
	
	
	
	
	
}
