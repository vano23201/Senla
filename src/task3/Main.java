package task3;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������� �����������: ");
		String text = input.nextLine();
		input.close();
		
		int length = Program.Counter(text);
		String[] sortedwords = Program.Sort(text);
		
		System.out.printf("�� �������� ����������� ���������� %d ����.\n", length);
		System.out.println(Program.Capitalizer(text));
		
		for (int i = 0; i < length; i++) {
			System.out.println(sortedwords[i]);
		}
	}
}
