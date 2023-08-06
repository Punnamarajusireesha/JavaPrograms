package com.kodnest.Arrays.Level3;
import java.util.*;
public class CopyArray {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("Enter 1-D Length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter values");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
		}
	int arr1[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
	}
	System.out.println("The copied array is:");
    for(int copy:arr1) {
    	System.out.println(copy);
    }

}
}
