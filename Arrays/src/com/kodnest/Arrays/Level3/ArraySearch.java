package com.kodnest.Arrays.Level3;
import java.util.*;
public class ArraySearch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1-D Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter values");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
      System.out.println("Enter the key");
      int key=scan.nextInt();
     ArraySearchApp a=new ArraySearchApp();
     int res=a.linearSearch(arr,key);
     if(res>0) {
    	 System.out.println("Key is found ");
     }
     else {
    	 System.out.println("Key is not found");
     }
}

}
