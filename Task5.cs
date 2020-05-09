using System;
using System.Collections.Generic;
using System.Text;

namespace Senla
{
    class Task5
    {
        public static bool IsPalindrome(int n)
        {
            int reverse = 0, d, n1 = n;

            while (n != 0)
            {
                d = n % 10;
                reverse = reverse * 10 + d;
                n /= 10;
            }

            if (n1 == reverse)
            {
                return true;
            }

            return false;
        }
    }
}
