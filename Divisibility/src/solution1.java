import java.util.*;
public class solution1 {
public static void main() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number greater than 100");
	int n=scan.nextInt();
	if(n>100) {
	 printNumbers(n);
	}
	else {
		System.out.println("Re-Enter number greater than 100");
	}
}
public static void printNumbers(int n) {
	for(int i=0;i<=n;i++) {
		System.out.println("i");
	}
}
}
