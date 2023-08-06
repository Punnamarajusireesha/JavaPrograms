import java.util.*;
public class Solution8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to print numbers divisible by 5 and not 3");
		int n=scan.nextInt();
		Divby5not3(n);
	}
	public static  void Divby5not3(int n) {
		for(int i=0;i<n;i++) {
			if(i%2!=0 && i%5==0) 
				System.out.println(i);
		}

	}
}
