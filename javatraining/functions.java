package javatraining;

public class functions {

	public static void main(String[] args) {
		functions obj=new functions();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
	void add()
	{
		int x=15;
		int y=20;
		int sum=x+y;
		System.out.println(sum);
	}
	void sub()
	{
		int x=65;
		int y=20;
		int sub=x-y;
		System.out.println(sub);
	}
	void mul()
	{
		int x=30;
		int y=20;
		int mul=x*y;
		System.out.println(mul);
    }
	void div()
	{
		int x=50;
		int y=2;
		int div=x/y;
		System.out.println(div);
	}
	
}
