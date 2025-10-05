// Program that calculates the discount for an airline ticket, 
//based on the user's airline club membership category. 
//The program will read the category name.
//Use a switch statement to calculate the discount 

import java.util.Scanner;

public class DiscountAirlineTicket {

	public static void main(String[] args) {	
		Scanner scnr = new Scanner(System.in);
		
		int digitMember;
		int ticketPrice = 100;
		
		System.out.println("Airline ticket price is 100$ without club membership.");
		
		System.out.print("Please enter one digit that matched with your airline club membership (Velociraptor: 1, Stegosaurus: 2, Triceratops: 3, T-Rex: 4, Brachiosaurus:5): ");
		digitMember = scnr.nextInt();
	
	switch(digitMember) {
		case 1:
			ticketPrice -= (ticketPrice * 0.05);
			System.out.println("Velociraptor club membership has 5% discount.\nYour new ticket price is: " + ticketPrice + "$");
			break;
			
		case 2:
			ticketPrice -= (ticketPrice * 0.1);
			System.out.println("Stegosaurus club membership has 10% discount.\nYour new ticket price is: " + ticketPrice + "$");
			break;
			
		case 3:
			ticketPrice -= (ticketPrice * 0.15);
			System.out.println("Triceratops club membership has 15% discount.\nYour new ticket price is: " + ticketPrice + "$");
			break;
			
		case 4:
			ticketPrice -= (ticketPrice * 0.30);
			System.out.println("T-Rex club membership has 30% discount.\nYour new ticket price is: " + ticketPrice + "$");
			break;
			
		case 5:
			ticketPrice -= (ticketPrice * 0.50);
			System.out.println("Brachiosaurus club membership has 50% discount.\nYour new ticket price is: " + ticketPrice + "$");
			break;
			
	}
	
	
	}

}
