package lambda;

import java.util.Arrays;
import java.util.List;

public class PrintNames {

	//one method only  per interface
	@FunctionalInterface
	public interface Condition <T> {
		public boolean toPrint (T element);
		//public boolean toDisplay (T element);
	}
	
	// Without Lambda
	/*public class ConditionImpl implements Condition<String> {
		@Override
		public boolean toPrint (String element) {
			// La seule ligne reellement utile !
            return element.length() <= 5;
		}
	}*/
	
	public static void main(String[] args) {

        List<String> names = Arrays.asList("un", "deux", "trois", "quatre");
        
        //without Lambda
        /*PrintNames.ConditionImpl isShortName  = new PrintNames().new ConditionImpl();
        for (String element : names) {
        	if (isShortName.toPrint(element))
        		System.out.println(element);
        }*/
        
        //lambda
        Condition<String> conditionString = (x) -> x.length() <= 5;
        
        for (String element : names) {
        	if (conditionString.toPrint(element))
        		System.out.println(element);
        }

	}
}
