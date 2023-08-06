package com.kodnest.Arrays.Level4;
import java.util.Scanner;
public class ReplaceArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1-D Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length-1;i++) 
		{
        arr[i]=scan.nextInt();
        }
		System.out.println("Before Replacing:");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		RepalceArrayApp a=new RepalceArrayApp();
		a.replace(arr);
		System.out.println("After Replacing:");
		for(int i:arr) {
			System.out.println(i+" ");
		}

		
		
}
}
