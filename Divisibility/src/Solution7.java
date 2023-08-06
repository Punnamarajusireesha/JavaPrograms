import java.util.*;
public class Solution7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to print numbers divisible by 2 and 3");
		int n=scan.nextInt();
		Divby2and3(n);
	}
	public static  void Divby2and3(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0 && i%3==0) 
				System.out.println(i);
		}

	}
}
