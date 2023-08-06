package com.kodnest.Arrays.Level1;
import java.util.*;
public class Program3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1D length");
	int n=scan.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter values");
	for(int i=0;i<=n;i++) {
		arr[i]=scan.nextInt();
	}
   for(int i:arr) {
	   if(i>0)
		   System.out.println(i);
   }
}
}
















