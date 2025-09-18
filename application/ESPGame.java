package application;
import java.util.Scanner;
import java.util.Random;

/*
* Class: CMSC203
* Instructor: Professor Tarek
* Description: This class is a guessing game of colors between a user and a computer
* Due: 09/17/2025
* Platform/compiler: Eclipse Compiler for Java (ECJ)
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Emmanuel Leo Baimba Demby
*/

public class ESPGame {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		//Constant Variables
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		final int TOTAL_ROUNDS = 11;
		
		//Normal Variables
		String userName; 
		String userMcNumber;
		String userDescription;
		String dueDate;
		String userGuess; 
		String botChoice;
		int userCorrectGuesses = 0, randomNumber;
		
		//Define random number
		System.out.println("Please enter your name: ");
		userName = keyboard.nextLine();
		
		System.out.println("Please enter your MC#: ");
		userMcNumber = keyboard.nextLine();
		
		System.out.println("Please write a brief description about yourself: ");
		userDescription = keyboard.nextLine();
		
		System.out.println("Please enter due date: ");
		dueDate = keyboard.nextLine();
		
		// Match colors with random numbers
		Random rand = new Random();
		int round = 1;
		
		while (round < (TOTAL_ROUNDS + 1)) {
			randomNumber = rand.nextInt(5);
			
			switch(randomNumber) {
				case 0:
					botChoice = COLOR_RED;
					break;
				case 1:
					botChoice = COLOR_GREEN;
					break;
				case 2:
					botChoice = COLOR_BLUE;
					break;
				case 3:
					botChoice = COLOR_ORANGE;
					break;
				default:
					botChoice = COLOR_YELLOW;
			}
			// Ask for users' guess
			System.out.println("I am thinkin of a color");
			System.out.println("Is it Red, Green, Blue, Orange or Yellow?");
			System.out.println("Please enter your guess: ");
			userGuess = keyboard.nextLine();
			
			//Validate user input
			while (!userGuess.equalsIgnoreCase(COLOR_RED) &&
	                !userGuess.equalsIgnoreCase(COLOR_GREEN) &&
	                !userGuess.equalsIgnoreCase(COLOR_BLUE) &&
	                !userGuess.equalsIgnoreCase(COLOR_ORANGE) &&
	                !userGuess.equalsIgnoreCase(COLOR_YELLOW)) {
				System.out.println("Invalid Color. Please try again: ");
				userGuess = keyboard.nextLine();
			}
			// Show computer's choice
			System.out.println("I was thinking of " + botChoice);
			//Calculate user's correct guesses
			if (userGuess.equalsIgnoreCase(botChoice)) userCorrectGuesses += 1;
			round++;
		}
		System.out.println("Game Over");
		System.out.println("You guessed " + userCorrectGuesses + " out of " + TOTAL_ROUNDS);
		
		System.out.println("Student Name: " + userName);
		System.out.println("Student MC #: " + userMcNumber);
		System.out.println("Student Description: " + userDescription);
		System.out.println("Due date: " + dueDate);
		
		keyboard.close();
		System.exit(1);
	}

}
