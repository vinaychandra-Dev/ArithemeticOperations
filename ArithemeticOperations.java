package Data_Types;

import java.util.Scanner;

public class ArithemeticOperations {
	
	public  String	 ADD(int var1 ,int var2) {
		return "THE SUM OF THE TWO NUMBERS IS :"+(var1+var2);
	}
	public  String SUB(int var1,int var2) {
		return "THE DIFFERENCE OF TWO NUMBERS IS :"+(var1-var2);
	}
	public  String MULTIPLY(int var1,int var2) {
		return "THE MULTIPLY OF TWO NUMBERS IS :"+(var1*var2);
	}
	
	public  String DIVISION(int var1,int var2) {
		
		try {
			if(var2==0) {
				return "THE DIVISOR CAN'T BE ZERO ";
			}
			else {
		        return "THE DIVISION OF THE TWO NUMBERS IS :"+((double)var1/var2);
			}
		}
		catch(Exception e) {
		    
			return "ERROR"+e.getMessage();
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1 ,var2;
		
		Scanner sc = new Scanner(System.in);
		
		ArithemeticOperations obj = new ArithemeticOperations();

		
		while(true) {
			System.out.print("SELECT THE ARTHEMETIC OPERATION : '+' '-' '*' '/' 'Q' :");
		
		char response = sc.next().charAt(0);
		
		if(response=='Q' || response=='q' ) {
		System.out.println("THE PROCESS IS TERMINATED! ");
		break;
		}else {
        	
		System.out.println("ENTER THE NUMBERS :");
		var1=sc.nextInt();
		var2=sc.nextInt();
		
		
		switch(response) {
		
		case '+' : System.out.println(obj.ADD(var1, var2));
		           break;
		           
		case '-' : 
			       System.out.println(obj.SUB(var1, var2));
			       break;
	
		case '*' :	       
		           System.out.println(obj.MULTIPLY(var1, var2));
			       break;

		case '/' :	       
			       System.out.println(obj.DIVISION(var1, var2)); 
			       break;
			       
	    default  : System.out.println("SELECT THE APPROPRIATE OPTION ");
		}	
		
        }
		sc.close();
	}

}
}
