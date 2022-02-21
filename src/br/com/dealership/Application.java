package br.com.dealership;

import java.util.Scanner;

import br.com.dealership.utils.Menu;

public class Application {

	public static void main(String[] args) {
	
		String menuSelection;
		Scanner scanner = new Scanner(System.in);
		
		Menu menu = new Menu();
		
		do {
			menu.mainMenu();
			menuSelection = scanner.nextLine();
			switch(menuSelection) {
			case "1":
				
				
			case "2":
			case "3":
			}
		}
		while(menuSelection != "0");
	}
}
