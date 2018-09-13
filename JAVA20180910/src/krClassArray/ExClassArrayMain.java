package krClassArray;

public class ExClassArrayMain {
	
	
	public static void main(String[] args) {
		Addr[] classArr = new Addr[5];
		//¿Ã∏ß "1","2","3","4","5"
		
		/*for(int i=0; i<classArr.length; i++) {
			classArr[i] = new Addr();
			classArr[i].setName("" +(i+1));			
			
			System.out.print(classArr[i].getName()+ ((i==classArr.length-1)? "": ", "));			
		}*/
		
		for(int index=0; index<classArr.length; index++) {
			classArr[index] = new Addr();
			classArr[index].setName(""+(index+1));
		}
		
		Addr in = new Addr();
		in.setName("»´");
		in.phone = "010";
		
		classArr[0] = in;
		for(int index=0; index<classArr.length; index++) {
			System.out.println("["+index+"] : "+classArr[index].getName()+", "+classArr[index].phone);
		}
		
		
		/*InnerArr inArr = new InnerArr(5);
		inArr.printArr();
		inArr.add("√÷", "010");
		inArr.printArr();*/

	}

}
