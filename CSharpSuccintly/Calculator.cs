using System;

namespace csharpsuccintly {
    class Calculator {
        public static void calculate() {
            //Information
            Console.WriteLine("With this calculator you can (A)dd, (R)emove, (D)ivide and (M)ultiply");
            Console.WriteLine("type (Q)uit to end");
            //recuperation des infos
            bool quit=false;
            do {
                double result = 0;
                double numOne = 0;
                double numTwo = 0;
                Console.WriteLine("What do you want to do ?: ");
                String input = Console.ReadLine();
                char firstChar = input[0];
                if (firstChar == 'Q' || firstChar == 'q') {
                    quit=true;
                }
                if (!quit){
                    numOne = getNumber("First");
                    numTwo = getNumber("Second");
                }
                switch (firstChar){
                    case('A'):
                    case('a'):
                        result = numOne+numTwo;
                        break;
                    case('D'):
                    case('d'):
                        result = numOne/numTwo;
                        break;
                    case('R'):
                    case('r'):
                        result = numOne-numTwo;
                        break;
                    case('M'):
                    case('m'):
                        result = numOne-numTwo;
                        break;
                    case('q'):
                    case('Q'):
                        break;
                    default:
                        Console.WriteLine("Bad command: "+input);
                        break;    
                }
                if(!quit)
                    Console.WriteLine(result);
                else
                    Console.WriteLine("Bye !");
            }
            while (!quit);
        }

        public static double getNumber(String texte){
            Console.Write($"{texte} Number: ");
            String numInput = Console.ReadLine();
            return Double.Parse(numInput);    
        }
    }
}
