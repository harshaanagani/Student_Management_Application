package com.seleniumexpress.lc.controllers;



public class sorting {
public static void main(String[] args) {
	int arr[]= {18,2,39,183,8};
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
	}
	
	 System.out.println(arr[arr.length-1]);
	 
	 System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
}
}




