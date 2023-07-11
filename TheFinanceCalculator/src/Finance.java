import java.util.*;
public class Finance {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter principle value");
    double principle=scan.nextDouble();
	System.out.println("Enter rate");
	double rate=scan.nextDouble();
	System.out.println("Enter time");
	double time=scan.nextDouble();
	FinanceCalculator f=new FinanceCalculator();
	System.out.println(f.calculateSimpleInterest(principle,rate,time));

}
}
