package com.kodnest.Arrays.Level3;

public class Array2App {
public boolean isPresent(int arr[],int target) {
	for(int i=0;i<arr.length-1;i++) {
		if(target==arr[i]) {
			return true;
		}
}
	return false;
}
}
