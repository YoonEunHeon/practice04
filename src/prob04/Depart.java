package prob04;

public class Depart extends Employee {
	private String title;

	public Depart( String name, int salary, String title ){
		super( name, salary );
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void getInformation() {
		System.out.printf(
			"이름:%s   연봉:%d 부서:%s\n", getName(), getSalary(), title);
	}
}
