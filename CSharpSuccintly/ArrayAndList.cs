using System;
using System.Collections.Generic;

namespace csharpsuccintly {
    class ArrayAndList {
        public static void write (){
            int[] oddNumbers = { 1, 3, 5 };
            int firstOdd = oddNumbers[0];
            int lastOdd = oddNumbers[2];
            Console.WriteLine($"{firstOdd}  {lastOdd}");
            List<decimal> stockPrices = new List<decimal>();
            stockPrices.Add(56.23m);
            stockPrices.Add(72.80m);
            decimal secondStockPrice = stockPrices[1];
            Console.WriteLine(secondStockPrice);
            double[] temperatures = { 72.3, 73.8, 75.1, 74.9 };
            for (int i= 0; i<temperatures.Length;i++){
                Console.WriteLine(temperatures[i]);
            }

            foreach (int temperature in temperatures){
                Console.WriteLine(temperature);
            }

            int tempcount=temperatures.Length-1;
            while (tempcount>=0){
                Console.WriteLine(temperatures[tempcount]);
                tempcount--;
            }

            tempcount=temperatures.Length-1;
            do {
                Console.WriteLine(temperatures[tempcount]);
                tempcount--;
            }
            while (tempcount>=0);
        }   
    }
}