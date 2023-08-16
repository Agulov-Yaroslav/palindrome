package palindrome;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Введите слово: ");
		String word = scanner.nextLine();

		if (isPalindrome(word)) {
			System.out.println("Слово \"" + word + "\" - палиндром.");
		} else {
			System.out.println("Слово \"" + word + "\" - не палиндром.");
		}

		scanner.close();
	}

	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		int len = word.length();
		
		if (len <= 1) {
			return true;
		}
		
		for (int i = 0; i < len / 2; i++) {

			if (word.charAt(i) != word.charAt(len - 1 - i)) 
				return false;
		}

		return true;

	}
}
