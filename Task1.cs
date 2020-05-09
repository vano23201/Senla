using System;
using System.Collections.Generic;
using System.Text;

namespace Senla
{
    class Task1
    {
        static public bool IsInt(double n)
        {
            if (n != Convert.ToInt32(n))
            {
                return false;
            }

            return true;
        }

        static public bool IsEven(int n)
        {
            if (n % 2 == 0)
            {
                return true;
            }

            return false;
        }

        static public bool IsPrime(int n)
        {
            if (n > 1)
            {
                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                    {
                        return false;
                    }
                }

                return true;
            }

            return false;
        }
    }
}
