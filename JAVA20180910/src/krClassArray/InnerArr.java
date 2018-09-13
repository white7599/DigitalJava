package krClassArray;

public class InnerArr {
	Addr[] addr;
	
	InnerArr(int size){
		addr = new Addr[size];
		for(int i=0; i<addr.length; i++) {
			addr[i] = new Addr();
		}
	}
	
	void add(Addr tmp) {
		addr[0] = tmp;
	}
	
	void add(String name, String phone) {
		addr[0].setName(name);
		addr[0].phone = phone;
		
	}
	
	void delete() {
		
	}
	
	void search() {
		
	}
	
	void printArr() {
		for(int i=0; i<addr.length;i++) {
			if(addr[i] != null)
//			addr[i].setName(""+(i+1));
			System.out.println("name: " +addr[i].getName()+", phone: "+addr[i].phone);
		}
	}
}
