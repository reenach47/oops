package javatraining;

public class throwse {

	public static void validate(int age) throws ArithmeticException {  
        if(age<18) {  
             
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        } } 
    public static void main(String args[]){  
        try {
			validate(16);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        System.out.println("rest of the code...");    
  }  

	}
