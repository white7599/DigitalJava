/*
 * 2019.09.10
 * ��) class method �����
class ��� �Լ��� �����Ͽ� ����Ͻÿ�
1) "myclass"�� ����ϴ� �Լ��� �ۼ��Ͻÿ�
2) �̸��� ��̸� �Է¹޾� ����ϴ� �Լ��� �ۼ��Ͻÿ�
3) ��ȭ��ȣ�� �Ѱ��ִ� �Լ��� �ۼ��Ͻÿ�.

class MyClass{   
  //method ����
}

ex) 
public class ExMain{
     pubic stiatc void main(String[] args){
	MyClass my = new MyClass();
             1) my.echo();
	2) my.info("ȫ�浿","������ ����");
             3) String phone = my.getPhone();
	    System.out.print("phone : "+phone );
     }
}
 */
package krClassMethod;

class MyClass{
	private String phone;;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	void echo() {
		System.out.println("myclass");
	}
	void info(String name, String hobby) {
		System.out.println("�̸�: " + name);
		System.out.println("���: " + hobby);
	}
	
	
}

public class ExMain {

	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.echo();
		my.info("ȫ�浿","������ ����");
		my.setPhone("010-000-0000");
		String phone = my.getPhone();
	    System.out.print("phone : "+phone );

	}

}
