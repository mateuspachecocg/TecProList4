package solutions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("SALARY MINIMUM :");
		double salaryMinimum = scanner.nextDouble();

		System.out.println("DEPENDENTS     :");
		int dependents = scanner.nextInt();
		
		System.out.println("SALARY VALUE   :");
		double salary = scanner.nextDouble();
		
		System.out.println("TAX UNNUSED    :");
		double taxUnnused = scanner.nextDouble();
		
		double taxValue = calcIncomeTax(salaryMinimum, dependents, salary, taxUnnused);

		//System.out.printf("\nYour Income Tax: R$ %0.2f", taxValue);
		
		System.out.println(taxValue);
	}
	
	public static double calcIncomeTax(double salaryMin, int dependents, double salary, double tax) {
		
		double salaryCount = (salary / salaryMin);
		double grossTax;
		if (salaryCount > 12) {
			grossTax = 0.20;
		} else if (salaryCount > 5) {
			grossTax = 0.08;
		} else {
			grossTax = 0.00;
		}
		
		double netValueTax = (salaryCount > 5) ? grossTax*0.96 - 0.02*dependents : 0.00;
		
		return netValueTax*salary;
	}

}
