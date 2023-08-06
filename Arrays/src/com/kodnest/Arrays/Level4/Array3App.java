package com.kodnest.Arrays.Level4;

public class Array3App {
 int[] merging(int arr[],int arr1[]) {
	 int arr2[]=new int[arr.length];
	 for(int i=0;i<=arr.length-1;i++) {
		
			 arr2[i]=arr[i]+arr1[i];
		
	 }
	return arr2;
	 }	
 }

