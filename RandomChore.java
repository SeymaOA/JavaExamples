//Program that allows the user to input the number of people living in a household. 
//Then the program chooses randomly one person to do the dishes.


import java.util.Random;
import java.util.Scanner;

public class RandomChore {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		
		int numPeople , chosenPerson;
		
		System.out.println("Hello! welcome to the chore selector .. ");
		System.out.print("Enter the number of people living in the house: ");
		
		numPeople = scnr.nextInt();
		
		chosenPerson = randGen.nextInt(numPeople) + 1;
		
		System.out.print("Alright! today it is the turn of Person " + chosenPerson  + " to do the dishes!");
		
	}

}
