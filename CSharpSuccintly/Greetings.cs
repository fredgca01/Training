using System;
using static System.Math;


namespace csharpsuccintly {   
    class Greetings {
        static void Main(){
            Console.WriteLine("Greetings !: "+Calc.Pythagorean(2,54));
            StringAndOperator.write();
            ArrayAndList.write();
        }
    }

    class Calc {
        public static double Pythagorean(double a,double b){
            double cSquared = Pow(a,2)+Pow(b,2);
            return Sqrt(cSquared);
        }
    }
}