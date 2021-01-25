package task3;

public class Program {
	static int Counter (String text) {
        int counter = 0;

        if(text.length() > 0) counter++;

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == ' ') counter++;
        }

        return counter;
    }
	
	static char[] Capitalizer (String text) {
		char[] textArr = text.toCharArray();
		textArr[0] = Character.toUpperCase(textArr[0]);
		
        for (int i = 0; i < text.length(); i++)
        {
            if (textArr[i] == ' ')
            {
                textArr[i + 1] = Character.toUpperCase(textArr[i + 1]);
            }
        }

        return textArr;
    }
	
	static String[] Sort (String text) {
		String[] words;
		words = new String[Counter(text)];
		int nextwordstart = 0;
		int wordnumber = 0;
		
		for (int i = 0; i < text.length(); i++)
		{
			if (text.charAt(i) == ' ')
			{
				words[wordnumber] = text.substring(nextwordstart, i);
				nextwordstart = i + 1;
				wordnumber++;
			}
		}
		
		words[wordnumber] = text.substring(nextwordstart, text.length());
		
		return words;
	}
}
