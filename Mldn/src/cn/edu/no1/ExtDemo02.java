package cn.edu.no1;


public class ExtDemo02{
	public static void main(String arsg[]){
		Student stu = new Student()	;// 实例化子类对象
		stu.setName("张三") ;	// 此方法在Student类中没有明确定义
		stu.setAge(30) ;
		System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge() ) ;
	}
};

class Person{					// 定义Person类
	private String name ;		// 定义name属性
	private int age ;			// 定义age属性
	public void setName(String name){
		this.name = name;	
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	
};

class Student extends Person{					// 定义Student类
	// 此处不添加任何的代码
};