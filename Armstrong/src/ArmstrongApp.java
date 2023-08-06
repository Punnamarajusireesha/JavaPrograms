import java.util.*;
public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to check its Armstrong");
	int n=scan.nextInt();
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	Armstrong a=new Armstrong();
	int res=a.findArmstrong(n,count);
	if(res==n) {
	System.out.println("It is Armstrong Number");
}
	else {
		System.out.println("It is not an Armstrong Number");
	}
}
}
