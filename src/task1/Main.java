package task1;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������� ����� �����: ");
		
		try {
			n = input.nextInt();
			input.close();
			
			if (Program.IsEven(n)) System.out.println("�������� ����� ������.");
			else System.out.println("�������� ����� ��������.");
			
			if (Program.IsPrime(n)) System.out.println("�������� ����� �������.");
			else System.out.println("�������� ����� ���������.");
		} catch (Exception e) {
			System.out.println("�������� ����� ������ ���� �����!");
		}
		input.close();	
	}
}
