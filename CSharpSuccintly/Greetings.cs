using System;
using static System.Math;


namespace csharpsuccintly {   
    class Greetings {
        static void Main(){
            //Console.WriteLine("Greetings !: "+Calc.Pythagorean(2,54));
            //StringAndOperator.write();
            //ArrayAndList.write();
            //Calculator.calculate();
            
            /*Calculator1 calc = new Calculator1();
            calc.GetNumber("First");
            calc.GetNumber("Second");
            calc.AddNumbers();
            calc.PrintResult();*/

            /*PropertiesSample2 sample = new PropertiesSample2();
            sample.email = "test";
            Console.WriteLine($"{sample.email}");
            sample.email = " ";
            Console.WriteLine($"{sample.email}");*/

            DelegateLambda.Log($"{DelegateLambda.Today} is a good day.");
            //Console.ReadKey();
        }
    }

    class Calc {
        public static double Pythagorean(double a,double b){
            double cSquared = Pow(a,2)+Pow(b,2);
            return Sqrt(cSquared);
        }
    }
}