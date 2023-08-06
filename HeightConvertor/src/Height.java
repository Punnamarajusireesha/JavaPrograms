import java.util.*;
public class Height {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter inches to convert into feet:");
	double inch=scan.nextDouble();
	HeightConverter h=new HeightConverter();
	System.out.println(h.convertInchesToFeet(inch));
}
}
