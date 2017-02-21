package lambda;

public class MainClass {

	/*
	 * http://www.supinfo.com/articles/single/1467-introduction-java-8-expressions-lambda-interface-fonctionnelle
	 */
	public static void main(String[] args) {
		Integer result;
		result = calculate(10, 11, new Addition());
		System.out.println(result);
		result = calculate(10, 11, new Multiplication());
		System.out.println(result);
		result = calculate(10, 11, new Soustraction());
		System.out.println(result);
		
		//Definition d'une lambda expression. Pas de creation d'objet
		Operation division = (x,y) -> x/y;
		
		result = calculate(4, 2, division);
		System.out.println("Division via Lambda :" + result);
		
		
	}

	public static Integer calculate (Integer x, Integer y, Operation ope){
		return ope.calculer(x, y);
	}
}
