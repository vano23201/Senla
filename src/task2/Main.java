package task2;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int n, m;
		Scanner input = new Scanner(System.in);
		System.out.print("������� ��� ����� �����: ");
		
		try {
			n = input.nextInt();
			m = input.nextInt();
			System.out.printf("���(%d, %d) = %d\n���(%d, %d) = %d", n, m, Program.GCD(n, m), n, m, Program.LCM(n, m));
		} catch (Exception e) {
			System.out.println("��� �������� ����� ������ ���� ������!");
		}
		input.close();
	}
}
