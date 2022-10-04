package javatraining;

public class Employee {
	String name;
	 int id;
	 int sal;
	 String desg;
 public static void main(String[] args) {
	 Employee emp1=new Employee();
	 emp1.init("reena",1,30000,"intern");
	 emp1.display();
 }
void init(String name_temp,int id_temp,int sal_temp,String desg_temp)
 {
	 name=name_temp;
	 id=id_temp;
	 sal=sal_temp;
	 desg=desg_temp;}
  void display()
  {
	 System.out.println("Employee name is"+name);
	 System.out.println("employee id is"+id);
	 System.out.println("employee sal is"+sal);
	 System.out.println("employee desg is"+desg);}}

