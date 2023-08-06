package com.kodnest.Arrays.Level4;
import java.util.Scanner;
public class FindSumApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1-D Length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter values");		
	  for(int i=0;i<=arr.length-1;i++) 
		  {
		    arr[i]=scan.nextInt();
          }
    FindSum a=new FindSum();
    int sum=a.findSum(arr);
   System.out.println("The Sum of Array elements is: "+sum);
}
}
