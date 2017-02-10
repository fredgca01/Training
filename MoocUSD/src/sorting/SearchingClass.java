package sorting;

import java.util.List;

public class SearchingClass {
	
	public static Airport linearSearch(String shortName, List<Airport> data) {
		for (int i=0;i<data.size();i++){
			if (data.get(i).getShortName().equals(shortName)){
					return(data.get(i));
			}
		}
		return null;
	}
	
	public static Airport binarySearch(String shortName, Airport [] data) {
		int length = data.length;
		int startIndex=0;
		int stopIndex=length-1;
		int midIndex=(stopIndex-startIndex)/2;
		
		while (startIndex<=stopIndex){
			if(data[midIndex].getShortName().compareToIgnoreCase(shortName)>0){//plus grand que mon shortName
				stopIndex=midIndex-1;
				midIndex=stopIndex-(stopIndex-startIndex)/2;
			}
			else if(data[midIndex].getShortName().compareToIgnoreCase(shortName)<0){//plus petit
				startIndex=midIndex+1;
				midIndex=startIndex+(stopIndex-startIndex)/2;
			}
			else if(data[midIndex].getShortName().compareToIgnoreCase(shortName)==0) {
				return(data[midIndex]);
			}
		}
		return null;
	}
}
