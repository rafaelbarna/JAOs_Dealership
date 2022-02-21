package br.com.dealership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.dealership.bean.Admin;
import br.com.dealership.bean.Vehicle;
import br.com.dealership.utils.Menu;

public class Application {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("NEW", "OPU42MAG", "QUADRA", "TURBO-R V-TECH", "2077", 100000.00F));
		
		Admin admin = new Admin(1, "Jão", "jao", "123");

		
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		
		do {
			menu.mainMenu();
			menuSelection = scanner.nextInt();
			switch(menuSelection) {
			
			case 1:
				Menu.menuDealership(vehicles);
			case 2:
			case 3:
				
				System.out.print("CATEGORY:  ");
				String category = scanner.nextLine();
				
				System.out.print("LICENSE PLATE:  ");
				String licensePlate = scanner.nextLine();
				
				System.out.print("BRAND:  ");
				String brand = scanner.nextLine();
				
				System.out.print("MODEL:  ");
				String model = scanner.nextLine();
				
				System.out.print("YEAR:  ");
				String year = scanner.nextLine();
				
				System.out.print("PRICE:  ");
				Float price = scanner.nextFloat();

				vehicles.add(new Vehicle(category, licensePlate, brand, model, year, price));
			}
		}
		
		
		while(menuSelection != 0);
		
		
		scanner.close();
	}
}
