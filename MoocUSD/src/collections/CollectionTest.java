package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public void testList() {
		ArrayList<String> array = new ArrayList<String>();
		array.add("un");
		array.add("deux");
		
		Collection<String> arrayb = new ArrayList<String>();
		arrayb.add("trois");
		arrayb.add("quatre");
		
		for (String txt : array) {
			System.out.println(txt);
		}
		
		for (String txt : arrayb) {
			System.out.println(txt);
		}
		
		
		LinkedList<String> listB = new LinkedList<String>();
		listB.addLast("AAAA");
		listB.addLast("BBBB");
		String result = listB.peek();
		System.out.println(result);
		result = listB.peek();
		System.out.println(result);
		
		Vector<String> listC = new Vector<String>();
		listC.addElement("Bof");
		
		Stack<String> listD = new Stack<String>();
		listD.push("Test");
		result = listD.peek();
		
		System.out.println(result);
	}
	
	public void testSet() {

		Set setB = new HashSet();
		Set setC = new LinkedHashSet();
		Set setD = new TreeSet();
	}
}
