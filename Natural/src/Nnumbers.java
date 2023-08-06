import java.util.*;
public class Nnumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number to calculate its sum");
	int a=scan.nextInt();
	int sum=0;
	for(int i=0;i<=a;i++) {
		sum=sum+i;
	}
		System.out.println("The sum is:"+sum);
	
}
}
