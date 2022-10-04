package javatraining;
public class multiplecatch {

	public static void main(String[] args) {
		int x[]=new int[6];
		try {
		x[7]=10/0;
	}
    catch(ArithmeticException e)
		{
    	System.out.println("Exception code");
		}

	    catch(ArrayIndexOutOfBoundsException e)
			{
	    	System.out.println("Exception code");
			}
	}
}

