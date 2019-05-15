using System;
using static System.Math;


namespace csharpsuccintly { 
    class StringAndOperator {
        public static void write() {

            int val1 = 5;
            Console.WriteLine("val1:"+val1);
            int val2 = ++val1;
            Console.WriteLine("val1:"+val1);
            Console.WriteLine("val2:"+val2);
            int val3=2;
            Console.WriteLine("val3:"+val3);
            int val4=val3--;
            Console.WriteLine("val3:"+val3);
            Console.WriteLine("val4:"+val4);

            decimal price = 1.5m;
            String action = price > 2 ? "Sell" : "Buy";
            Console.WriteLine("Action: "+action);

            DateTime currentTime = DateTime.Now;
            currentTime = currentTime.AddDays(1);
            Console.WriteLine("Date "+currentTime);
            String shortDate= currentTime.ToShortDateString();
            Console.WriteLine(shortDate);
            String longDate = currentTime.ToLongDateString();
            Console.WriteLine("Le jour : {0} !",longDate);
            String texte = "fred";
            Console.WriteLine(texte+"!"); 

            string item = "bread";
            decimal amount = 2.25m;
            Console.WriteLine("{0,-10}{1:C}", item, amount);
            Console.WriteLine($"{item}  {amount}");
            Console.WriteLine($"{nameof(item)}: {item,-10} {nameof(amount)}: {amount:C}");
        }

    }
}