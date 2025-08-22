package arrays;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		// int arr[] = new int[5];
		int arr[] = { 2, 5, 7, 9, 15 };

		// int arr[]= {5,10,15,20,25};
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		// System.out.println(a[7]);
		try {
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println("ArrayIndexOutofBoundException");
		}

		System.out.println(arr[2]);
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		arr[2] = 6;
		arr[4] = 28;
		System.out.println(arr[4]);
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

}
