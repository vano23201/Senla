using System;

namespace Senla
{
    class Program
    {
        static void Main (string[] args)
        {
            double n, k;
            int n1, k1, i;
            string text, word;


            //Задание 1
            Console.Write("Введите n: ");
            n = Convert.ToDouble(Console.ReadLine());

            if (Task1.IsInt(n) == true)
            {
                n1 = Convert.ToInt32(n);

                if (Task1.IsEven(n1) == true)
                {
                    Console.WriteLine("Введённое число является чётным");
                }
                else
                {
                    Console.WriteLine("Введённое число не является чётным");
                }


                if (Task1.IsPrime(n1) == true)
                {
                    Console.WriteLine("Введённое число является простым");
                }
                else
                {
                    Console.WriteLine("Введённое число является составным");
                }
            }
            else
            {
                Console.WriteLine("Введённое число не является целым");
            }


            //Задание 2
            Console.Write("Введите n: ");
            n = Convert.ToDouble(Console.ReadLine());
            Console.Write("Введите k: ");
            k = Convert.ToDouble(Console.ReadLine());

            if (Task2.IsInt(n) == true && Task2.IsInt(k) == true)
            {
                n1 = Convert.ToInt32(n);
                k1 = Convert.ToInt32(k);

                Console.WriteLine("НОД({0}, {1}) = {2}, НОК({0}, {1}) = {3}", n1, k1, Task2.GCD(n1, k1), Task2.LCM(n1, k1));
            }
            else
            {
                Console.WriteLine("Введённое число не является целым");
            }


            //Задание 3
            Console.Write("Введите текст: ");
            text = Console.ReadLine();

            Console.WriteLine("В введённом предложении {0} слов", Task3.Counter(text));


            //Задание 4
            Console.Write("Введите текст: ");
            text = Console.ReadLine();
            Console.Write("Введите слово: ");
            word = Console.ReadLine();

            Console.WriteLine("Слово {0} употребляется в тексте {1} раз", word, Task4.Counter(text, word));


            //Задание 5
            Console.Write("Введите сколько чисел-палиндромов требуется найти: ");
            n1 = Convert.ToInt32(Console.ReadLine());
            i = 1;

            while(n1 > 0)
            {
                if (Task5.IsPalindrome(i) == true)
                {
                    n1--;

                    Console.WriteLine("Число {0} является палиндромом", i);
                }

                i++;
            }
        }
    }
}
