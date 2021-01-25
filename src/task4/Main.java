package task4;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		String text, word;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите текст: ");
		text = input.nextLine();
		System.out.print("Введите слово: ");
		word = input.nextLine();
		input.close();
		
		System.out.printf("Слово %s встречается в тексте %d раз(-а).", word, Program.Counter(text.toLowerCase(), word.toLowerCase()));
	}
}
