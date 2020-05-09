using System;
using System.Collections.Generic;
using System.Text;

namespace Senla
{
    class Task3
    {
        static public int Counter(string text)
        {
            int counter = 0;

            if(text.Length > 0)
            {
                counter++;
            }

            for(int i = 0; i < text.Length; i++)
            {
                if(text[i] == Convert.ToChar(" "))
                {
                    counter++;
                }
            }

            return counter;
        }
    }
}
