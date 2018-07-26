package HW6;

import java.util.ArrayList;
import java.util.List;

public class HW6 {

	public static void main(String[] args) {
		Candy yubileinoe = new Candy("yubileinoe", 4, 7);
		Candy union = new Candy("union", 2, 9);
		Candy karakum = new Candy("karakum", 3, 12);
		Candy redPoppy = new Candy("redPoppy", 9, 10);

		List<Candy> gift = new ArrayList();
		gift.add(yubileinoe);  
		gift.add(union);
		gift.add(karakum);
		gift.add(redPoppy);    
                  
		Gift.showGift(gift);

		Gift.sortGiftByWeight(gift);
		Gift.getSugar(gift, 9);

	}
}