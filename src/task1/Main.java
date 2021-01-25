package task1;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("¬ведите целое число: ");
		
		try {
			n = input.nextInt();
			input.close();
			
			if (Program.IsEven(n)) System.out.println("¬ведЄнное число чЄтное.");
			else System.out.println("¬ведЄнное число нечЄтное.");
			
			if (Program.IsPrime(n)) System.out.println("¬ведЄнное число простое.");
			else System.out.println("¬ведЄнное число составное.");
		} catch (Exception e) {
			System.out.println("¬ведЄнное число должно быть целым!");
		}
		input.close();	
	}
}
