import java.util.*;
public class Primes {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number to check if it is prime");
	int n=scan.nextInt();
	boolean isPrime=false;
	if(n<2) {
		System.out.println("Entered number is not a prime");
	}
	else {
	 for(int i=2;i*i<=n;i++) {
		   if(n%i!=0) {
			isPrime=true;
			break;
		}
		   if(isPrime==true) {
			   System.out.println("Entered Number is Prime");
		   }
		   else {
		System.out.println("It is not a prime");
	    
	 }
 }
	}
}
}


