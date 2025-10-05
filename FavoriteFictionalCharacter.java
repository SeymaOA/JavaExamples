//Program that reads the user's favorite fictional character name 
//and, their first name. The program then calculates the distance between the 
//first letter of the user's first name and the fictional character's first name 
//and displays the result. The distance depends on alphabetical order. If the distance is 0, 
//the program should print a special message like: 
//"distance is zero, coincidence? I think not!" 


import java.util.Scanner;

public class FavoriteFictionalCharacter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		char firstName , favChar;
		
		int distance;
		
		System.out.print("enter your first name: ");
		firstName = scnr.next().toUpperCase().charAt(0);
		
		
		System.out.print("enter your favorite fictional character's name: ");
		favChar = scnr.next().toUpperCase().charAt(0);
		
		
		distance = Math.abs(firstName - favChar);
		
		if(distance == 0) {
			System.out.println("distance is zero, coincidence? I think not!");
		}
		else {
			System.out.println("The distance between the first letters is: " + distance + " letters!");
		}
		
	}

}
