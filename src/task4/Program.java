package task4;

public class Program {
	static int Counter (String text, String word) {
        int counter = 0, i, j;

        for (i = 0; i < text.length() - word.length() + 1; i++) {
            if (text.charAt(i) == word.charAt(0)) {
                for (j = 1; j < word.length(); j++) {
                    if (text.charAt(i + j) != word.charAt(j)) break;

                    if (j == word.length() - 1 && text.charAt(i + j + 1) != ' ') {
                        counter++;
                        i += word.length();
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
