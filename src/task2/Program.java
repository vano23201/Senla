package task2;

public class Program {
	static int GCD(int a, int b) {
		int �;

		while (b != 0) {
			� = a % b;
			a = b;
			b = �;
	    }
		return a;
	}

	static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}
}