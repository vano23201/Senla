package task5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину последовательности от 0 до 100: ");
        
        try {
            int n = input.nextInt();
            
            if (n >= 0 && n <= 100) {
                for (int i = 0; i < n + 1; i++) {
                    if (Program.IsPalindrome(i))  System.out.println(i);
                }
            } else System.out.println("Введённое число должно лежать в интервале от 0 до 100!");

        } catch (Exception e) {
            System.out.println("Необходимо ввести число!");
        }
        input.close();
	}
}