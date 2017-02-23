package collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import collections.EnumClass.Day;

public class MainClass {
	
	//public class AirportComparator implements Comparator<Airport> {
	  //  public int compare(Airport emp1, Airport emp2){
	    //   return emp1.getShortName().compareTo(emp2.getShortName());
	    //}
	//}

	public static void main(String[] args) {
		testCollection();
	}
	
	public static void testSortingExo() {
		// TODO Auto-generated method stub
		try {
			List<Airport> data = fileParsing();
			
			//using collections
			//Collections.sort(data,new MainClass().new AirportComparator());
			
			//using lambda
			Collections.sort(data,(x,y) -> x.getShortName().compareTo(y.getShortName()));
			
			//tri dans l'ordre
			Airport [] sortedData = SortingClass.selectionSort(data.toArray(new Airport[0]));
			
			long begin = System.currentTimeMillis();
			//Recherche
			//SearchingClass.linearSearch("Paris",data);
			SearchingClass.binarySearch("Paris", sortedData); 
			
			long end = System.currentTimeMillis();
			System.out.println("Time spent in ms: "+ (end-begin));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List fileParsing() throws IOException {
		String datafile = "data/airports.dat";
		List<Airport> data = new ArrayList<Airport>();
		
		FileInputStream fis = new FileInputStream(datafile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		while ((line = br.readLine()) != null) {
			//
			String[] result = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			for (int i = 0; i < result.length; i++) {
				result[i] = result[i].replace("\"", "");
			}
			Airport place = new Airport();
			place.setName(result[1]);
			place.setShortName(result[2]);
			place.setCountry(result[3]);
			place.setCode1(result[4]);
			place.setCode2(result[5]);
			place.setLatitude(Double.parseDouble(result[6]));
			place.setLongitude(Double.parseDouble(result[7]));
			place.setAltitude(Integer.parseInt(result[8]));
			place.setTimezone(Float.parseFloat(result[9]));
			place.setDst(result[10].charAt(0));
			place.setDbTimezone(result[11]);
			data.add(place);
		}
		return data;
	}
	
	public static void ArrayListMethodTester() {
		//set up
        ArrayList<String> animals = new ArrayList<String>();
        ArrayListMethodsExo zoo = new ArrayListMethodsExo(animals); 
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("zebra");
        
        //test isSorted
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: true");
        
        zoo.list.add("cat");
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: false");
        
        zoo.list.remove("cat");
        zoo.list.add(0,"cat");
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: false");
        
        
        
        zoo.list.add(3,"horse");
        
        //test replaceWithLargerNeighbor
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("replaceWithLargerNeighbor, Expected: [cat, dog, horse, zebra, zebra]");
        
        zoo.list.add(0,"cat");
        
        //test count duplicates;
        System.out.println(zoo.countDuplicates());
        System.out.println("countDuplicates, Expected: 2");
        zoo.list.add(4,"dog");
        System.out.println(zoo.countDuplicates());
        System.out.println("countDuplicates, Expected: 3");
        
        
        //start with fresh array list
        animals = new ArrayList<String>();
        zoo = new ArrayListMethodsExo(animals); 
        
        //does empty array list work?
         System.out.println(zoo.isSorted());
         System.out.println("isSorted, Expected: true");
         zoo.replaceWithLargerNeighbor();
         System.out.println(zoo.toString());
         System.out.println("replaceWithLargerNeighbor, Expected: []");
         System.out.println(zoo.countDuplicates());
         System.out.println("countDuplicates, Expected: 0");
        
        //test xyzToFront
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("xantus");
        zoo.list.add("zebra");
        zoo.list.add("cat");
        zoo.list.add("yak");
        
        zoo.xyzToFront();
        System.out.println(zoo.toString());
        System.out.println("Expected: [xantus, zebra, yak, ape, dog, cat]");
	}
	
	public static void testCollection () {
		CollectionTest testArrayList = new CollectionTest();
		//testArrayList.testSet();
		//testArrayList.testNavigableSet();
		//testArrayList.testMap();
		//testArrayList.testNavigableMap();
		//testArrayList.testQueues();
		testArrayList.testStacks();
	}
	
	public static void testDataStruct(){
		EnumClass<String> test = new EnumClass<String>();
		test.testgenerique("Coucou");
		EnumClass<List> test2 = new EnumClass<List>();
		test2.testgenerique(new ArrayList<>());
		
		test2.testEnum(Day.FRIDAY);
	}

}
