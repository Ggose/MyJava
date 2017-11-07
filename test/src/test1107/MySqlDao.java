package test1107;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("My Sql DB에서 검색");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("My Sql DB 삽입 ");		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("My Sql DB 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("My Sql DB에서 삭제");
	}

}
