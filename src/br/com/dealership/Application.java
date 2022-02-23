package br.com.dealership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.dealership.bean.Admin;
import br.com.dealership.bean.Client;
import br.com.dealership.bean.User;
import br.com.dealership.bean.Vehicle;
import br.com.dealership.utils.DB;
import br.com.dealership.utils.Menu;

public class Application {

	public static void main(String[] args) {

		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();

		List<Vehicle> vehicles = new ArrayList<>();
//		List<User> users = new ArrayList<>();
		vehicles.add(new Vehicle(1, "NEW", "OPU42MAG", "QUADRA", "TURBO-R V-TECH", "2077", 100000.00F));

		System.out.println("ADMIN SYS");
		System.out.print("LOGIN: ");
		String login = scanner.next();
		System.out.print("PASS: ");
		String password = scanner.next();
		String name = "Jão Jewelles";
		
		Admin admin = new Admin(1, name, login, password);
		DB.newUser(1, admin);

		do {
			menu.mainMenu();
			menuSelection = scanner.nextInt();
			switch (menuSelection) {

			case 1:
				Menu.menuDealership(vehicles);
				break;

			case 2:
				System.out.println("\n~~ CLIENT SYS ~~");
				System.out.print("Registered USER (Y/N): ");
				String registeredUser = scanner.next();
				if (registeredUser.equals("Y")) {
					System.out.print("ID: ");
					Integer clientID = scanner.nextInt();

					User client = DB.searchClient(clientID);
					
					if (client == null) {
						System.out.println("REGISTRATION REQUIRED");
						
						System.out.print("ID: ");
						Integer id = scanner.nextInt();
						System.out.print("NAME: ");
						name = scanner.next();
						login = name;
						System.out.print("PASSWORD: ");
						password = scanner.next();
						
						client = new Client(id, name, login, password, client);
						
						System.out.println("SUCESSFULLY REGISTERED");
						break;
					}

					System.out.print("ID OF VEHICLE: ");
					Integer vehicleID = scanner.nextInt();
					vehicles.get(vehicleID);
					continue;
				}

			case 3:
				System.out.print("~~ ADMIN SYS ~~");
				System.out.print("LOGIN: ");
				String login2 = scanner.next();
				System.out.print("PASSWORD: ");
				String password2 = scanner.next();

				if (login2 != login && password2 != password) {
					System.out.println("\n- LOGIN SUCEFFUL");
					System.out.println("-- NEW VEHICLE\n");

					System.out.print("ID: ");
					Integer id = scanner.nextInt();

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

					vehicles.add(new Vehicle(id, category, licensePlate, brand, model, year, price));

				} else {
					System.out.println("LOGIN FAILED");
				}
				break;
			}
		}

		while (menuSelection != 0);

		scanner.close();
	}
}
