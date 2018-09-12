/*
 * 2019.09.10
 * 문) class method 만들기
class 멤버 함수로 정의하여 사용하시오
1) "myclass"를 출력하는 함수를 작성하시오
2) 이름과 취미를 입력받아 출력하는 함수를 작성하시오
3) 전화번호를 넘겨주는 함수를 작성하시오.

class MyClass{   
  //method 정의
}

ex) 
public class ExMain{
     pubic stiatc void main(String[] args){
	MyClass my = new MyClass();
             1) my.echo();
	2) my.info("홍길동","정의의 도적");
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
		System.out.println("이름: " + name);
		System.out.println("취미: " + hobby);
	}
	
	
}

public class ExMain {

	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.echo();
		my.info("홍길동","정의의 도적");
		my.setPhone("010-000-0000");
		String phone = my.getPhone();
	    System.out.print("phone : "+phone );

	}

}
