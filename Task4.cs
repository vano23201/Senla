using System;
using System.Collections.Generic;
using System.Text;

namespace Senla
{
    class Task4
    {
        static public int Counter (string text, string word)
        {
            int counter = 0, i, j;

            for (i = 0; i < text.Length - word.Length + 1; i++)
            {
                if (text[i] == word[0])
                {
                    for(j = 1; j < word.Length; j++)
                    {
                        if (text[i + j] != word[j])
                        {
                            break;
                        }

                        if (j == word.Length - 1)
                        {
                            counter++;
                            i += word.Length;
                            break;
                        }
                    }
                }
            }

            return counter;
        }
    }
}
