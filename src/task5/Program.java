package task5;

public class Program {
	static boolean IsPalindrome (int n) {
		int i = 0, t = n;
		
		while (t != 0) {
			i *= 10;
			i += t % 10;
			t /= 10;
		}
		
		return i == n;
	}
}
