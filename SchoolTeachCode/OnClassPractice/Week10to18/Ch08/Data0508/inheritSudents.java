package Week10to18.Ch08.Data0508;

public class inheritSudents extends Person{


	private String studentId;
	private String department;
	private String school;

	public inheritSudents() {
		super();
	}
	//呼叫父類的空參數建構方法

	public inheritSudents( String id,String name, String studentId) {
		super(id,name);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void goCourse(){
		System.out.println(getName()+"去上課了");
	}
	public void goParty(){
		System.out.println(getName()+"去派對了");
	}


	//覆寫父類方法
	@Override
	public void eat() {
		System.out.println("Student " + getName() + " is going to eat a lot.");
	}


}
