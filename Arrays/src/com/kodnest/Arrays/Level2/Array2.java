package com.kodnest.Arrays.Level2;
import java.util.Scanner;
public class Array2{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1D length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter values");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
		}
	for(int a:arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("Enter indexes to swap their numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int temp;
	temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
	System.out.println("Values after swapping:");
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
