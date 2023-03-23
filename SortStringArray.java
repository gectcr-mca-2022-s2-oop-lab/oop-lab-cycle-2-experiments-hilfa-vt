package cycle2;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		String[] arr = new String[sc.nextInt()];
		System.out.println("enter string array elements:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}