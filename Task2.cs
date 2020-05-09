using System;
using System.Collections.Generic;
using System.Text;

namespace Senla
{
    class Task2
    {
        static public bool IsInt(double n)
        {
            if (n != Convert.ToInt32(n))
            {
                return false;
            }

            return true;
        }

        static public int GCD(int a, int b)
        {
            int с;

            while (b != 0)
            {
                с = a % b;
                a = b;
                b = с;
            }

            return a;
        }

        static public int LCM(int a, int b)
        {
            return (a * b) / GCD(a, b);
        }
    }
}
