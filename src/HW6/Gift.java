package HW6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gift {

	public static void showGift(List<Candy> gift) {

		for (Candy i : gift) {
			System.out.println(i);
		}
   
	}

	public static List<Candy> sortGiftByWeight(List<Candy> arr) {
		Collections.sort(arr, new Comparator<Candy>() {
			@Override
			public int compare(Candy o1, Candy o2) {
				return o1.weight.compareTo(o2.weight);
			}
		});
		System.out.println(arr);
		return arr;
	}

	public static void getSugar(List<Candy> arr, int sugar) {
		for (int i = 0; i < arr.size(); i++) {
			if (sugar == arr.get(i).getSugar()) {
				System.out.println(arr.get(i));

			}

		}
	}
}