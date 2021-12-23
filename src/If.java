
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Student Info");
		
		String s = sc.nextLine ();
		
		System.out.print("Enter the Number of Subject Cleared="+s);
		
		int n  = sc.nextInt();
		
		System.out.print("\n\nEnter the Number of Mathematics Marks="+s);
		
		int y  = sc.nextInt();
		
		if(n<=10) {
			if(y>=50){
				System.out.println("\n\n\nStudent is Eligible For Test");
			}
			else {
				System.out.println("\n\n\nStudent is Not Eligible For Test");
			}
		}
	   else {
		  System.out.println("\n\n\n\nStudent is Not Eligible For Test");
	  }
}
}