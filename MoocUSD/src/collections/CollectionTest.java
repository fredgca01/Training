package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	// the addition order is kept
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
		
		Vector<String> listC = new Vector<String>();
		listC.addElement("Bof");
	}
	
	
	//Each element can exist only once
	public void testSet() {

		Set<String> setB = new HashSet<String>();
		
		setB.add("deux");
		setB.add("un");
		setB.add("un");
		
		//no guarantee on the order
		System.out.println("\nHashSet");
		for (String item : setB){
			System.out.println(item);
		}
		
		Set<String> setC = new LinkedHashSet<String>();
		
		setC.add("deux");
		setC.add("un");
		setC.add("un");
		
		//order guarantee
		System.out.println("\nLinkedHashSet");
		for (String item : setC){
			System.out.println(item);
		}
	}
	
	//Each element can exist only once and order guarantee regarding sorting comparator
	public void testNavigableSet() {
		//Sort using lambda
		Comparator<String> stringComparator = (String x, String y) ->  {if (x.length()>y.length()) return 1; else if(x.length()==y.length()) return 0; else return -1;};
		TreeSet<String> setD = new TreeSet<String>(stringComparator);
		
		setD.add("deux");
		setD.add("un");
		setD.add("trois");
		setD.add("trois");
		
		//sorting order
		System.out.println("\nSet");
		for (String item : setD){
			System.out.println(item);
		}
		
		Iterator ite = setD.descendingIterator();
		System.out.println("\ndescendingIterator");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		ite = setD.iterator();
		
		System.out.println("\niterator");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println(setD.pollFirst());
	}
	
	// mapping between a key and a value
	public void testMap() {
		Map<String,String> mapA = new HashMap<String,String>();

		mapA.put("key1", "element 1");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");
		
		for(String key : mapA.keySet()) {
			String value = mapA.get(key);
			System.out.println(value);
		}
	}
	
	public void testNavigableMap() {

		Comparator<String> comparatorString = (String x, String y) ->  {if (x.length()>y.length()) return 1; else if(x.length()==y.length()) return 0; else return -1;};
		// sur les clés !!
		SortedMap<String,String> mapA = new TreeMap<String,String>(comparatorString);

		mapA.put("key1bbb", "element 1bbb");
		mapA.put("key2bb", "element 2bb");
		mapA.put("key3b", "element 3b");
		
		for(String key : mapA.keySet()) {
			String value = mapA.get(key);
			System.out.println(value);
		}
	}
	
	//FIFO : designed to have elements inserted at the end of the queue, and elements removed from the beginning of the queue
	public void testQueues() {
		Queue<String> queueA = new LinkedList<String>();

		queueA.add("element 0");
		queueA.add("element 1");
		queueA.add("element 2");

		//access via new for-loop
		for(String object : queueA) {
		    System.out.println(object);
		}
		
		Object firstElement = queueA.element();
		 System.out.println("first element "+firstElement);
	}
	
	//LIFO : add elements to the "top" of the stack, and also remove elements from the top again.
	public void testStacks() {
		Stack<String> queueA = new Stack<String>();

		queueA.push("element 0");
		queueA.push("element 1");
		queueA.push("element 2");

		//access via new for-loop
		for(String object : queueA) {
		    System.out.println(object);
		}
		
		Object firstElement = queueA.pop();
		 System.out.println("first element "+firstElement);
	}
}
