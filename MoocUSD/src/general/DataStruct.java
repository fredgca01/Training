package general;

import java.util.Enumeration;
import java.util.Vector;


/*
 * https://openclassrooms.com/courses/apprenez-a-programmer-en-java/la-genericite-en-java
 */            
public class DataStruct<T> {
	T obj=null;
	
	public void  testgenerique(T obj){
		this.obj = obj;
		System.out.println(this.obj.getClass());
	}
	
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
	public void testEnum(Day dDay){
		Enumeration<String> enums;
		Vector data = new Vector();
		data.add("Lundi");
		data.add("Mardi");
		data.add("Mercredi");
		enums = data.elements();
		
		while (enums.hasMoreElements()) {
			System.out.println(enums.nextElement()); 
	    }
		
		if(dDay==Day.MONDAY){
			System.out.println("C'est Lundi");
		}
		else
			System.out.println("C'est pas Lundi");
	}
	
	@Deprecated
	public static void testDeprecated(){
		System.out.println("call to deprecated method without Warning");
	}
}
