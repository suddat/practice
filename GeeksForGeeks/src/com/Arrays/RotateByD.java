package com.Arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateByD {
	
	void rotateD(List<Integer> list, int d) {
		for(int i = 0; i<d; i++) {
			rotateByOne(list);
		}
		printArray(list);
	}
	
	void rotateByOne(List<Integer> list) {
		int temp, len;		
		temp = list.get(0);
		list.remove(0);
		len = list.size();
		list.add(temp);
		//printArray(list);
		//System.out.println("length =>"+list.size());
	}
	void printArray(List<Integer> list) {
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
	public static void main(String[] args) {
		RotateByD rot = new RotateByD();
		int[] arr = {1, 2, 3, 4, 5};
		int d = 0;
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of D to shift array -> ");
		d = sc.nextInt();
		if(d>arr.length) {
			System.out.println("Value of D Cannot be greater than " + arr.length);
			System.exit(0);
		}
		for (int i = 0 ; i < arr.length ; i++) {
			list.add(i, arr[i]);
		}
		rot.rotateD(list, d);
	}

}
