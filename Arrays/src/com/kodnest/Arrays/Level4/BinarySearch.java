package com.kodnest.Arrays.Level4;

public class BinarySearch{
 int search(int arr[],int key) {
	 int low=0;
	 int high=arr.length-1;
	 int mid;
	 while(low<=high) {
	 mid=(low+high)/2;
	 int n=arr[mid];
		if(key==n) {
			return n;
		}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	 return -1;
 }
}

