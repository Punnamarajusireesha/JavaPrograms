package com.kodnest.Arrays.Level2;
import java.util.Scanner;
public class PrintArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
	PrintArray p=new PrintArray();
	p.printArray(arr);
	}
}
