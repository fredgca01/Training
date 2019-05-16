using System;


namespace csharpsuccintly {
    public class PropertiesSample {
        public string email{get; set;}
    }
    public class PropertiesSample2 {
        public string email{
            get => identifier; 
            set => identifier= (!string.IsNullOrWhiteSpace(value))
                ? value : throw new ArgumentException("Bad format");
        }
        private string identifier=string.Empty;
    }
}