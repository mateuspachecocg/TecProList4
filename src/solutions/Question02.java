package solutions;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("WEEK DAY :");
		String day = scanner.nextLine();
		
		System.out.println("TOOL TYPE :");
		String type = scanner.nextLine();
		
		System.out.println("RENT VALUE:");
		Double priceRent = scanner.nextDouble();
		
		double netPrice = calcRentTool(day, type, priceRent);
		
		System.out.printf("RENT NET VALUE: U$ %.2f", netPrice);
	}
	
	// toolType: used or new
	public static double calcRentTool(String weekDay, String toolType,double rentValue) {
		
		double discount = 0.00, addition = 0.00;
		
		if (weekDay.equals("monday") || weekDay.equals("tuesday") || weekDay.equals("thursday")) {
			discount = 0.40;
		}
		
		if (toolType.equals("new")) {
			addition = 0.15;
		}
		
		return rentValue*(1.00 - discount + addition);
	}
}
 