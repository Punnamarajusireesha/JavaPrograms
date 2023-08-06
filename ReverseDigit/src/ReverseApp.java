import java.util.*;
public class ReverseApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number ");
	int n=scan.nextInt();
	Reverse r=new Reverse();
	int rev=r.reverseDigit(n);
	System.out.println("The reverse of the number is "+rev);
	if(n==rev) {
		System.out.println("Entered number is a palindrome");
	}
	else {
		System.out.println("Entered number is not a palindrome");

	}
}
}
