package lab10movielist;

import java.util.ArrayList;

import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userInput = "";
		String repeat = "";// Use repeat to let you know why and what its assigned to and for

		do {
			System.out.println("Welcome to the Grand Circus Movie Database!");

			// list of categories
			System.out.println("\nThere are 50 movies in this list.");
			System.out.println("\nThe genres are : Horror, Comedy, Animated, Scifi, Action, and Drama ");

			// userInput to send to second class
			System.out.print("\nWhich category are you interested in?: ");
			userInput = scnr.nextLine();
			System.out.println();

			while (!userInput.equalsIgnoreCase("scifi") && (!userInput.equalsIgnoreCase("horror"))
					&& (!userInput.equalsIgnoreCase("animated")) && (!userInput.equalsIgnoreCase("action"))
					&& (!userInput.equalsIgnoreCase("drama")) && (!userInput.equalsIgnoreCase("comedy"))) {
				// equals ignore case,
				// getting it to
				// return true from
				// comparing the
				// strings,
				// otherwise false.
				System.out.print(
						"Invalid Input. Please select from the following: Horror, Animated, Scifi, Action or Drama:  ");
				userInput = scnr.nextLine();
				System.out.println();
			}

			userInput = userInput.toLowerCase();
			System.out.println("Category: " + userInput.substring(0, 1).toUpperCase().concat(userInput.substring(1)));

			Movies list = new Movies();

			for (Movies m : list.listOfMovies()) {// using m for representing movies
				if (userInput.equalsIgnoreCase(m.getCategory())) {// ignoring case sensitive
					System.out.println(m);// then print out m.
				}

			}

			System.out.println();
			System.out.print("Continue? (Y/N:) ");
			repeat = scnr.nextLine();
			System.out.println();

			while (!repeat.equalsIgnoreCase("Y") && (!repeat.equalsIgnoreCase("N"))) {// !N for ignoring if its an upper
																						// or lower case
				System.out.print("Invalid Input. Would you like to view another movie database? Y/N: ");
				repeat = scnr.nextLine();
				System.out.println();
			}

		} while (repeat.equalsIgnoreCase("Y"));

		System.out.println("Come to the movies again soon!");

	}
}
