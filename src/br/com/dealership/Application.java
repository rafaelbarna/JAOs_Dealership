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
		vehicles.add(new Vehicle(1, "NEW", "OPU42MAG", "QUADRA", "TURBO-R V-TECH", "2077", 100000.00));

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
						System.out.println("-- REGISTRATION REQUIRED --");
						break;
					}

					System.out.print("\n--USER FOUND--");
					System.out.println("\nVEHICLE ID: ");
					Integer vehicleID = scanner.nextInt();

					Vehicle selectedVehicle = null;
					for (Vehicle vehicle : vehicles) {
						if (vehicle.getId().equals(vehicleID)) {
							selectedVehicle = vehicle;
						}
						Menu.menuDealership(selectedVehicle);

						System.out.println("ACCEPT TRANSACTION (Y/N)");
						String sellVehicle = scanner.next();

						if (sellVehicle.equals("Y")) {
							Double total = selectedVehicle.getPrice();
							vehicles.remove(selectedVehicle);

						} else {
							break;
						}
					}
					continue;
				}

				else if (registeredUser.equals("N")) {
					System.out.print("ID: ");
					Integer id = scanner.nextInt();
					System.out.print("NAME: ");
					name = scanner.next();
					login = name;
					System.out.print("PASSWORD: ");
					password = scanner.next();
					Double money = 1000000.00;

					Client client = null;
					client = new Client(id, name, login, password, money);
					DB.newUser(id, client);

					System.out.println("-- SUCESSFULLY REGISTERED --");
					break;
				} else {
					System.out.println("-- INVALID OPTION --");
					break;
				}

			case 3:
				System.out.print("~~ ADMIN SYS ~~");
				System.out.print("\nLOGIN: ");
				String login2 = scanner.next();
				System.out.print("PASSWORD: ");
				String password2 = scanner.next();

				if (login2 != login && password2 != password) {
					System.out.println("\n- LOGIN SUCEFFUL");
					System.out.println("-- NEW VEHICLE\n");

					System.out.print("ID: ");
					Integer id = scanner.nextInt();

					System.out.print("CATEGORY: ");
					String category = scanner.next();

					System.out.print("LICENSE PLATE: ");
					String licensePlate = scanner.next();

					System.out.print("BRAND: ");
					String brand = scanner.next();

					System.out.print("MODEL: ");
					String model = scanner.next();

					System.out.print("YEAR: ");
					String year = scanner.next();

					System.out.print("PRICE: ");
					Double price = scanner.nextDouble();

					vehicles.add(new Vehicle(id, category, licensePlate, brand, model, year, price));

				} else {
					System.out.println("-- LOGIN FAILED --");
					break;
				}

				break;
				
			case 4:
				System.out.print("~~ ADMIN SYS ~~");
				System.out.print("\nLOGIN: ");
				login2 = scanner.next();
				System.out.print("PASSWORD: ");
				password2 = scanner.next();

				if (login2 != login && password2 != password) {
					System.out.println("\nVEHICLE ID: ");
					Integer vehicleID = scanner.nextInt();

					Vehicle selectedVehicle = null;
					
					for (Vehicle vehicle : vehicles) {
						if (vehicle.getId().equals(vehicleID)) {
							selectedVehicle = vehicle;
						}
						Menu.menuDealership(selectedVehicle);
						System.out.println("\nID / CATEGORY / LICENSEPLATE / BRAND / MODEL / YEAR / PRICE");
						String selectDBCategoryChange = scanner.next();
						if(selectDBCategoryChange.equals("ID")) {
							System.out.print("ID: ");
							int id = scanner.nextInt();
							selectedVehicle.setId(id);
						}
						else if(selectDBCategoryChange.equals("CATEGORY")) {
							System.out.print("CATEGORY: ");
							String category = scanner.next();
							selectedVehicle.setCategory(category);
						}
						else if(selectDBCategoryChange.equals("LICENSEPLATE")) {
							System.out.print("LICENSE PLATE: ");
							String licensePlate = scanner.next();
							selectedVehicle.setlicensePlate(licensePlate);
						}
						else if(selectDBCategoryChange.equals("BRAND")) {
							System.out.print("BRAND: ");
							String brand = scanner.next();
							selectedVehicle.setBrand(brand);
						}
						else if(selectDBCategoryChange.equals("MODEL")) {
							System.out.print("MODEL: ");
							String model = scanner.next();
							selectedVehicle.setModel(model);
						}
						else if(selectDBCategoryChange.equals("YEAR")) {
							System.out.print("YEAR: ");
							String year = scanner.next();
							selectedVehicle.setManufacturingYear(year);
						}
						else if(selectDBCategoryChange.equals("PRICE")) {
							System.out.print("PRICE: ");
							Double price = scanner.nextDouble();
							selectedVehicle.setPrice(price);
						}
						else {
							System.out.println("ERROR - INVALID OPTION");
							break;
						}
						
						System.out.print("~~ DATABASE UPDATED ~~");
						System.out.print("SELECTED VEHICLE: " + selectedVehicle + " OPTION: " + selectDBCategoryChange);
					}
				}
			}

		}
		while (menuSelection != 0);

		scanner.close();
	}
}