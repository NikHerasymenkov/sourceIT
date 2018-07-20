package test2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите максимальное число фигуры: ");
		int h = sc.nextInt();
		int n = 1;
		int i;
		for (i = 1; i <= h * 2;) {
			if (n <= i && i <= h * 2 - n) {
				System.out.print("*");
				n+=1;
			}
			else {
				System.out.println();
				i+=1;
				n=1;
			}   
		}
	}
	
	
}

