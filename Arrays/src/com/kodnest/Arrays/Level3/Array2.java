package com.kodnest.Arrays.Level3;
import java.util.*;
public class Array2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1-D Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter values");		
		for(int i=0;i<=arr.length-1;i++) 
		       {
		         arr[i]=scan.nextInt();
        		}
		 System.out.println("Enter the Target");
         int target=scan.nextInt();
		  Array2App s=new Array2App();
		  boolean res=s.isPresent(arr,target);
		   if(res==true) {
		   System.out.println("Target is present");
		     }
		    else {
		   	 System.out.println("Target is not found");
		     }
}
}
