package ChooseAdventureGame;

import java.util.Scanner;

import Validation.ValidationClass;

public class GameMain {

	public static void main(String[] args) {
		
		
		 
		Scanner sc = new Scanner(System.in);
		
		firstChoice(sc);
		
		
		
	}

	private static void firstChoice(Scanner sc) {
		boolean userFailed = false;
		int userNumChoice;
		do {
			System.out.println(
					"Escape the Vault!\n" + "You awaken to a dimly lit Vault. There is no one around in sight.\n"
							+ "There are three doors in the room, one to the left, one to the right, and one straight ahead.\n"
							+ "What do you do?\n" + "1. Right door\n" + "2. Left door\n" + "3. Straight ahead\n");
			
			String userInput = sc.nextLine();
			userNumChoice = Integer.parseInt(userInput);
			userFailed = ValidationClass.validateNumber3(userInput);
		} while (userFailed);
		
		if (userNumChoice == 1){
			System.out.println("You go through the door on the right.");
			
			secondChoiceRight(sc);
		} else if (userNumChoice == 2) {
			System.out.println("You go through the door on the left.");
			 
			secondChoiceLeft(sc);
		} else {
			System.out.println("You go through the door straight ahead.");
		
			secondChoiceStraight(sc);
		}
		
	}
	private static void secondChoiceRight(Scanner sc) {
		boolean userFailed = false;
		int userNumChoice;
		do {
			System.out.println(
					"The door on the right opens. The room is a complete dead end.\n"
							+ "You should probably go back.\n"
							+ "What do you do?\n" + "1. Go back.\n" + "2. Linger in the empty room.");
			
			String userInput = sc.nextLine();
			userNumChoice = Integer.parseInt(userInput);
			userFailed = ValidationClass.validateNumber2(userInput);
		} while (userFailed);
		
		if (userNumChoice == 1){
			System.out.println("You go back the way you came.");
			// Insert method call for what happens if you go through the door on the right. 
			firstChoice(sc);
		}  else {
			System.out.println("You linger in the empty room. This is your new home now.");
			System.exit(0);
		}
		
	}
	
	private static void secondChoiceLeft(Scanner sc) {
		boolean userFailed = false;
		int userNumChoice;
		do {
			System.out.println(
					"The door on the left opens. The room is a complete dead end.\n"
							+ "You should probably go back.\n"
							+ "What do you do?\n" + "1. Go back.\n" + "2. Linger in the empty room.");
			
			String userInput = sc.nextLine();
			userNumChoice = Integer.parseInt(userInput);
			userFailed = ValidationClass.validateNumber2(userInput);
		} while (userFailed);
		
		if (userNumChoice == 1){
			System.out.println("You go back the way you came.");
			// Insert method call for what happens if you go through the door on the right. 
			firstChoice(sc);
		}  else {
			System.out.println("You linger in the empty room. This is your new home now.");
			System.exit(0);
		}
		
	}
	
	private static void secondChoiceStraight(Scanner sc) {
		boolean userFailed = false;
		int userNumChoice;
		do {
			System.out.println(
					"The door straight ahead opens. The next room has two further doors.\n"
							+ "Which door do you open?\n"
							+ "1. The Vault security door.\n" + "2. The Emergency Exit door.");
			
			String userInput = sc.nextLine();
			userNumChoice = Integer.parseInt(userInput);
			userFailed = ValidationClass.validateNumber2(userInput);
		} while (userFailed);
		
		if (userNumChoice == 1){
			System.out.println("You open the Vault security door. A click can be heard as a boobytrap is sprung.\n"
					+ "The last thing you hear is a deafening explosion.\n"
					+ "Game over.");
			// Insert method call for what happens if you go through the door on the right. 
			System.exit(0);
		}  else {
			System.out.println("The Emergency exit door opens slowly, granting you a vision of the wasteland beyond.\n"
					+ "Your new life above ground begins now.\n");
			victoryMethod();
		}
		
	}
	
	public static void victoryMethod(){
		System.out.println("You win!");
	}
}
