package com.kodnest.Arrays.Level2;
import java.util.*;
public class Swap {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int x=scan.nextInt();
	int y=scan.nextInt();
	System.out.println("Entered numbers are "+x +" and "+y);
	int help;
	help=x;
	x=y;
	y=help;
	System.out.println("The numbers are "+x+" and "+y);
}
}
