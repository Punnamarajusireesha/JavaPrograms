import java.util.*;
public class GcdApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers to find GCD");
	int m=scan.nextInt();
	int n=scan.nextInt();
	int res=Gcd.findGcd(m,n);
	System.out.println("GCD of " +m+" and"+n+" is "+res);
}
}
