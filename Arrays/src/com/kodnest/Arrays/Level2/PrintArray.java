package com.kodnest.Arrays.Level2;

public class PrintArray{
public void  printArray(int arr[]){
	System.out.println(" Array elements in forward direction");
	for(int a:arr) {
	System.out.print(a+" ");
}
	System.out.println("Array elements in backward direction");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
