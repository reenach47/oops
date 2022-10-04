package javatraining;

import basicsprogram.string;

public class Static {
         string name;
		 int id;
		 int sal;
		 static String comp;
		 public static void main(String[] args) {
			 Static emp1=new Static();
			 emp1.init("reena",1,30000,"Evry");
			 initstaticData();
			 emp1.display();
			  Static emp2=new Static();
			  emp2.init("sakshi",2,7000,"tieto");
			  emp2.display();
		 }
		void init(String name,int id,int sal, String comp)
		 {
			 string string = null;
			 this.name =string;
			 this.id=id;
			 this.sal=sal;
			 this.comp=comp;
		 } 
		  void display()
		  {
			 System.out.println("Employee name is"+name);
			 System.out.println("employee id is"+id);
			 System.out.println("employee sal is"+sal);
			 System.out.println("employee comp is"+comp);
		}
			 static void initstaticData()

			 {
				 comp="Evry";
			 }
			 static {
				 System.out.println("employee details");
			 }
	}


