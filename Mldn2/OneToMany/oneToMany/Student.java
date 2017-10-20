package oneToMany;

public class Student {

	private String name;
	private int age;
	private School school;
	
	public Student(String name,int age){
		this.setAge(age);
		this.setName(name);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public School getSchool(){
		return school;
	}
	public void setSchool(School school){
		this.school = school;
	}
     
	//覆写toString 方法
	public String toString(){
		return "姓名"+this.name +"年龄"+this.age;
	}
}
