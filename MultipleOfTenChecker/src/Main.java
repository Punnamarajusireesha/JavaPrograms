import java.util.*;
public class Main {
	public static void checkMultipleOfTen(int n,int a)

	{
		 if(n%a==0) {
			 System.out.println("It is multiple of "+a);
		 }
		 else {
			 System.out.println("It is not multiple of "+a);
		 }
	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a number N");
     int n=scan.nextInt();
     System.out.println("Enter another number to check if it is multiple of  "+n);
     int a=scan.nextInt();
     checkMultipleOfTen(n,a);
	}
	}

