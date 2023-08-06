import java.util.*;
public class Main {

	public static void calculateSumOfDigits(int n) {
    int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println(sum);
	}

	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number N");

	int n=scan.nextInt();

	calculateSumOfDigits(n);

	}

	}

	