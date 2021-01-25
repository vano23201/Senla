package task2;

public class Program {
	static int GCD(int a, int b) {
		int ñ;

		while (b != 0) {
			ñ = a % b;
			a = b;
			b = ñ;
	    }
		return a;
	}

	static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}
}