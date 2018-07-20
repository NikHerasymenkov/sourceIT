package HW8;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 89, 3, 4, 5, 6, 66, 75, 78, 89, 1, 3 };
		bubleSort(array);
		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}    
	}
private static void bubleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

				}
			}
			
		}
	System.out.println(Arrays.toString(arr));    
	}


}

