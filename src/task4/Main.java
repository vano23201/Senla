package task4;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		String text, word;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������� �����: ");
		text = input.nextLine();
		System.out.print("������� �����: ");
		word = input.nextLine();
		input.close();
		
		System.out.printf("����� %s ����������� � ������ %d ���(-�).", word, Program.Counter(text.toLowerCase(), word.toLowerCase()));
	}
}
