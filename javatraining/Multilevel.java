package javatraining;
class transferfunds{
	public transferfunds()
	{
	System.out.println("main funds");
	}
	public void banktype() {
		System.out.println("basic");	
	}
	class SBI extends transferfunds{
		public SBI()
		{
			System.out.println("SBI");
		}
	public void type()
	{
		System.out.println("savings");
	}
	public class branch extends SBI{
		public branch() {
		System.out.println("branch name:rr nagar");
	}
	
}
	public class Multilevel extends {
    public static void main(String[] args) {
		branch obj=new branch();
        obj.banktype();
        obj.type();
	}
}
	}
}

	


