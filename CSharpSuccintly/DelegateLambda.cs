using System;

namespace csharpsuccintly {
    class 
    DelegateLambda {
        public static string Today => DateTime.Now.ToShortDateString();
        public static void Log(string message) => Console.WriteLine(message);
    }
}