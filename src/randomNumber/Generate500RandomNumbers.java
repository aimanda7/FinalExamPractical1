package randomNumber;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Generate500RandomNumbers {

	/*
	 * Practical 1: Generate 500 random numbers and print the nth smallest number in
	 * a programming language of your choice. (Ask user for the Nth smallest number)
	 */

	public static void main(String[] args) {

		Set<Integer> myNumbers = new TreeSet<>();
		while (myNumbers.size() < 500) {
			myNumbers.add(getRandomNumber(1000));
		}
		System.out.println(myNumbers);
		Object[] array = myNumbers.toArray();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n to find the nth smallest number: ");
		int n = scanner.nextInt();

		if (n >= 1 && n <= 500) {
			System.out.println("The " + n + "th smallest number is: " + array[n - 1]);

		} else {
			System.out.println("Invalid input for n. Please enter a value between 1 and 500");
		}

		scanner.close();
	}

	private static int getRandomNumber(int maxValue) {
		Random random = new Random();
		int randomValue = random.nextInt(maxValue) + 1;
		return randomValue;

	}

}
