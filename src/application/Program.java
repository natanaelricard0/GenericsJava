package application;

import java.util.Scanner;

import services.PrintService;
import services.PrintServiceString;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		ps.addValue("Maria");
		
		for (int i = 0; i < n; i++) {
			Integer  value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = (Integer) ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
