package Week10to18.Ch08.Data0508;

public class Person {
	private String id;
	private String name;
	private String password;
	private String email;
	private String birth;
	private String address;

	Person(){}

	Person(String id,String name){
		this.id=id;
		this.name=name;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setBirth(String birth){
		this.birth=Person.this.birth;
	}
	public void setAddress(String address){
		this.address=Person.this.address;
	}
	public String getAddress(){
		return address;
	}
	public String getId(){
		return id;
	}
	public String getPassword(){
		return password;
	}
	public String getBirth(){
		return birth;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	public void eat(){
		System.out.println(name+"去吃東西");
	}
	public void sleep(){
		System.out.println(name+"去睡覺了");
	}



	//id name初始化
}


