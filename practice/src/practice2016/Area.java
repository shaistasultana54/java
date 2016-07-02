package practice2016;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		int radius; double area;
		Scanner input = new Scanner(System.in);
		radius=input.nextInt();
		area=3.14*radius*radius;
		System.out.println("area is"+ area);

	}

}
