import java.util.*;
public class Fact {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter N");
	int n=scan.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
		System.out.println("Factorial result is "+fact);
}
}
