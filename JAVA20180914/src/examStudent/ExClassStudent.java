package examStudent;

public class ExClassStudent {
	ExStudent[] stClass;
	int stIndex = 0;
	int stCont = 0;
	
	ExClassStudent(int stCont){
		stClass = new ExStudent[stCont];
		this.stCont = stCont;
		
	}
	
	//��ȯ��: �߰��� index���� �����Ѵ�.
	public int add(ExStudent st) {
		try {
			if(st != null) {
				stClass[stIndex] = st;
				++stIndex;		
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ���� �ʰ�: ���� �Ұ�");
		} 
		return stIndex-1;	
	}
	
	//�˻�(����: �̸�, ��ȯ��: �˻��� �迭�� index ���� �Ѱ��ش�.
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
	
	//���� remove ��ȯ��: ������ ���� �Ѱ��ش�.
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
	/* �ش� index ���� �����ϱ�*/
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
