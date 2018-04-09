package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
	
	void rotateRight(List<Integer> list, int len) {		
		for(int j = 0 ; len > 0 ; j++) {
			//System.out.println("\nin right =>>>"+len);
			rotateOne(list, len, j);
			len--;
		}
	}
	
	void rotateOne(List<Integer> list, int len, int diff) {
		//System.out.println("length ==>"+len+ " j==>"+diff + "size is =>"+ list.size());
		int temp;
		temp = list.get(len-1);
		list.remove(len-1);
		list.add(0, temp);
		removeElement(list, len-diff-1);
		printArray(list, len-1);
		System.out.println();
	}
	
	void removeElement(List<Integer> list, int index) {
		if(index < 0) {
			list.remove(0);
		}else {
			list.remove(index);
		}
	}
	
	void printArray(List<Integer> list, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		Rotate rot = new Rotate();
		List<Integer> list = new ArrayList<>();
		int[] arr 	= {1,2,3,4,5,6,7};
		for (int i=0; i< arr.length ; i++) {
			list.add(i, arr[i]);
		}
		rot.rotateRight(list, list.size());		
	}
}


/*
 
 package com.Arrays;

public class Rotate {
	
	void rotateRight(int[] arr, int len) {
		int t;
		for(int j = 0 ; j < len-1 ; j++) {
			t = arr[len-1-j];
			rotateOne(arr, t, len-1-j, j);
		}
	}
	
	void rotateOne(int[] arr, int tem, int len, int diff) {	
		System.out.println("\njlen =>" + len + " == temp ==" + tem);
		for (int i = len; i > 0; i--) {
			System.out.println(" == i ===>"+i);			
			arr[i] = arr[i-1];			
		}
		if(diff != 0 && len>diff) {
			arr[len-diff] = arr[len-diff+1];
		}		
		arr[0] = tem;
		printArray(arr, len);
		System.out.println();
	}
	
	void printArray(int[] arr, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Rotate rot = new Rotate();
		int[] arr 	= {1,2,3,4,5,6};
		rot.rotateRight(arr, arr.length);		
	}
}

 */
