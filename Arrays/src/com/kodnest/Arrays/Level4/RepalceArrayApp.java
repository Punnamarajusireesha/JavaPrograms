package com.kodnest.Arrays.Level4;

public class RepalceArrayApp {
      void replace(int arr[]) {
    	 for(int i=0;i<=arr.length-1;i++) {
    		 if(arr[i]<0) 
    		 {
    			 arr[i]=0;
    		 }
    	 }
     }
}
