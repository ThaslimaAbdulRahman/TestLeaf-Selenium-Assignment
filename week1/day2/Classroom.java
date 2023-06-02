package week1.day2;

public class Classroom {
	
	public static void main(String[] args) {
		int marks=234;
		
		if(marks<0) {
			System.out.println("Negative");
		}
		else if(marks>0) {
			System.out.println("Positive");
		}
		else if(marks==0) {
			System.out.println("Neutral");
		}
	    else {
	    	System.out.println("Number not define");
	    }
		}
}