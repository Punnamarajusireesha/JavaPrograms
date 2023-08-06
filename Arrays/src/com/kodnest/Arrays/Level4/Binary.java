package com.kodnest.Arrays.Level4;
import java.util.*;
public class Binary {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1-D length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter elements of 1-D array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter key element to be searched in array");
	int key=scan.nextInt();
	BinarySearch b=new BinarySearch();
	int res=b.search(arr, key);
	if(res==key) {
		System.out.println("Key found at index ");
	}
	else {
		System.out.println("Key not found");
	}
}
}
