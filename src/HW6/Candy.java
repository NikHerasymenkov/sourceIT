package HW6;

public class Candy extends Sweet {
	Candy(String name, int weight, int sugar) {
		super.name = name;
		super.weight = weight;    
		super.sugar = sugar;
             
	}

	@Override
	public String toString() {
		return "Candy [name=" + name + ", weight=" + weight + ", sugar=" + sugar + "]";
	}

}
          