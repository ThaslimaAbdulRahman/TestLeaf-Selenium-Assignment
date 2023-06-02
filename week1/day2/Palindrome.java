package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int rem;
		int num=121;
		int temp=num;
		int reverse=0;
	
	    while(num>0)  {
	    	rem = temp % 10;
	     	reverse = reverse * 10 + rem;
	     	num=num/10;
	       };

	     // palindrome if num and reverse are equal
	     if (temp== reverse)
	       System.out.println ("num is Palindrome");
	     else
	       System.out.println ("num is not Palindrome");
	 	    	
	    	 
	    			 
	    }
				
	}

