package com.kodnest.Arrays.Level4;
import java.util.*;
public class MergeArrays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1-D Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length-1;i++) 
		{
        arr[i]=scan.nextInt();
        }
		System.out.println("Enter 2-D Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length-1;i++) 
		{
        arr1[i]=scan.nextInt();
        }
		System.out.println("Merged Array is: ");
		MergeApp m=new MergeApp();
		int[] x=m.merging(arr,arr1);		
			for(int a:x) {
				System.out.print(a+" ");
			}
            }
}

