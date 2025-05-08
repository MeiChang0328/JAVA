package Week10to18.Ch08.Data0508;

public class Student {
	private String id;
	private String name;
	private String password;
	private String email;
	private String birth;
	private String address;
	private String department;
	private String school;
	private String studentId;


	public Student() {
	}

	public Student(String id, String name, String studentId) {
		this.id = id;
		this.name = name;
		this.studentId = studentId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public void eat(){
		System.out.println(name+"去吃東西");
	}
	public void sleep(){
		System.out.println(name+"去睡覺了");
	}
	public void goCourse(){
		System.out.println(name+"去上課了");
	}
	public void goParty(){
		System.out.println(name+"去派對了");
	}

}
