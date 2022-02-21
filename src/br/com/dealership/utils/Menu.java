package br.com.dealership.utils;

import java.util.List;
import java.util.Scanner;

import br.com.dealership.bean.Vehicle;

public class Menu {

	public void mainMenu() {

		System.out.println("\n---- JÃOs - New and Used Vehicles Dealership ----\n");
		System.out.println("1 - Visit Dealership");
		System.out.println("2 - Buy a new Vehicle");
		System.out.println("3 - Register a new Vehicle");
		System.out.println("0 - Leave Dealership");
	}

	public static void menuDealership(List<Vehicle> vehicles) {

		String formatter = "| %d   | %s      | %s   | %s          | %s     | %s              | %.2f | %n";
		System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");
		System.out.printf("| #   | CATEGORY | PLATE      | BRAND           | MODEL           | YEAR     | PRICE        |%n");
		System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");
		for (Vehicle vehicle : vehicles) {
			System.out.format(formatter,
					vehicle.getId(),
					vehicle.getCategory(),
					vehicle.getlicensePlate(),
					vehicle.getBrand(),
					vehicle.getModel(),
					vehicle.getManufacturingYear(),
					vehicle.getTotal()
					);
		}
		System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");
	}
	
	public static void menuDealership(Vehicle vehicle) {

		String formatter = "| %d   | %s      | %s   | %s          | %s     | %s              | %.2f | %n";
		System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");
		System.out.printf("| #   | CATEGORY | PLATE      | BRAND           | MODEL           | YEAR     | PRICE        |%n");
		System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");

			System.out.format(formatter,
					vehicle.getId(),
					vehicle.getCategory(),
					vehicle.getlicensePlate(),
					vehicle.getBrand(),
					vehicle.getModel(),
					vehicle.getManufacturingYear(),
					vehicle.getTotal()
					);
			System.out.format("+-----+----------+------------+-----------------+-----------------+----------+--------------+%n");
	}

	public static void newVehicle(Vehicle vehicle) {

	}
}
