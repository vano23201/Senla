package task1;

public class Program {
	static Boolean IsEven(int n) {
		if (n % 2 == 0) return true;
		return false;
	}

	static Boolean IsPrime(int n) {
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
	}
}
