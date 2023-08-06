package com.kodnest.Arrays.Level1;
import java.util.*;
public class Program1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1-D length");
	int n=scan.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter Array values");
	for(int i=0;i<=arr.length-1;i++) {
	     arr[i]=scan.nextInt();
	}
	System.out.println("The array contents are...");
	for(int i=0;i<=arr.length-1;i++) {
     System.out.println(arr[i]+" ");
}
}
}
