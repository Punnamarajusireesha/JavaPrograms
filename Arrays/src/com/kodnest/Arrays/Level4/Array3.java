package com.kodnest.Arrays.Level4;
import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1-D Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length-1;i++) 
		{
        arr[i]=scan.nextInt();
        }
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length;i++) 
		{
        arr1[i]=scan.nextInt();
        }
		System.out.println("Merged Array is: ");
    Array3App a=new Array3App();
    int[]res=a.merging(arr, arr1);
    for(int x:res) {
    	System.out.print(x);
    }
}
}
