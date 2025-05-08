package Week10to18.Ch08.Data0508;

public class MasterStudent extends inheritSudents{
	private String theisName;

	public MasterStudent(){
		super();
	}
	public MasterStudent(String id, String name, String studentId,String theisName) {
		super(id,name,studentId);
		this.theisName = theisName;
	}

	public void doResearch(){
		System.out.println(getName() + "is going to do research");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " has no time to eat");
	}
}
