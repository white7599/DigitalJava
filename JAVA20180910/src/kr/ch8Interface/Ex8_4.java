package kr.ch8Interface;

class OracleDao implements DataAccessObject{
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	public void update() {
		System.out.println("Oracle DB�� ����");
	}
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}	
}

class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	public void update() {
		System.out.println("MySql DB�� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}	
}

public class Ex8_4 {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
