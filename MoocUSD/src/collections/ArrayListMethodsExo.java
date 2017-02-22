package collections;

//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

//Need help starting this question? In the lesson titled 
//"Starting points: Problem Set Questions", go to the
//problem titled "Problem Set 6 - Question 1" for some tips on 
//how to begin.

import java.util.ArrayList;

public class ArrayListMethodsExo
{
  ArrayList<String> list; //instance variable
  /**
   * Constructor for objects of class ArrayListMethods
   */
  public ArrayListMethodsExo(ArrayList<String> arrayList) {
      // initialise instance variables
      list = arrayList;
  }
  
  public static void testLoop(){
	  int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names = {"James", "Larry", "Tom", "Lacy"};

      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
  }
  

  /**
   * Determines if the array list is sorted (do not sort)
   * When Strings are sorted, they are in alphabetical order
   * Use the compareTo method to determine which string comes first
   * You can look at the String compareTo method in the Java API
   * @return true if the array list is sorted else false.
   */
  public boolean isSorted() {
      boolean sorted = true;

      for(int i=1; i<list.size(); i++){
    	  if(list.get(i).compareTo(list.get(i-1))<0){
    		  sorted=false;
    		  break;
    	  }
      }
      return sorted;
  }

  /**
   * Replaces all but the first and last elements with the larger of its two neighbors
   * You can use the compareTo() method to determine which string is larger (larger in alphabetical
   * order).
   * Example: if the list is originally
   *    ["cat", "ape", "dog", "horse", "zebra"]
   * after this method it should be: 
   *    ["cat", "dog", "horse", "zebra", "zebra"]
   */
  public void replaceWithLargerNeighbor() {
	  for(int i=1; i<list.size()-1; i++){
    	  if(list.get(i-1).compareTo(list.get(i+1))<0){
    		  list.set(i, list.get(i+1));
    	  }
    	  else {
    		  list.set(i, list.get(i-1));
    	  }
	  }
  }

  /**
   * Gets the number of duplicates in the list.
   * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
   * Get the next word. It is at index i. (Does it match any of the words with index > i?)
   * @return the number of duplicate words in the list
   */
  public int countDuplicates() {
      int duplicates = 0;
      
      for (int i =0; i<list.size();i++) {
    	  for (int j=i+1; j<list.size();j++){
    		  if (list.get(i).compareTo(list.get(j))==0)
    			  duplicates++;
    	  }
      }
      return duplicates;
  }

   /**
   * Moves any word that starts with x, y, or z to the front of the ArrayList, but
   * otherwise preserves the order
   * Example: if the list is orginially
   *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
   * after this method is called it should be
   *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
   */
  public void xyzToFront()
  {
      int insertAt = 0;
      
      for (int i=0;i<list.size();i++){
    	  String tmp = list.get(i);
    	  if(tmp.startsWith("x")||tmp.startsWith("y")||tmp.startsWith("z")){
    		  for (int j=insertAt; j<i; j++){
    			  tmp=list.get(j);
    			  list.set(j,list.get(i));
    			  list.set(i,tmp);
    		  }
    		  insertAt++;
    	  }
      }
  }

  /**
   * gets the string representation of this array list
   * @returns the string representation of this array list in
   * standard collection format
   */
  public String toString()
  {
      return list.toString();
  }
}

