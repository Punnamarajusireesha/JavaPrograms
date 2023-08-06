package com.kodnest.Arrays.Level4;

public class MergeApp {
      int[] merging(int arr[],int arr1[]) {
    	  int arr2[]=new int[arr.length+arr1.length];
  		for(int i=0;i<=arr.length-1;i++) {
            arr2[i]=arr[i];
  		}
  		for(int i=0;i<=arr1.length-1;i++) {
  	          arr2[arr.length+i]=arr1[i];
  			}
  				return arr2;
  		
}
}
