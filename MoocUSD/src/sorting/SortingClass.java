package sorting;

public class SortingClass {

	public static Airport[] selectionSort(Airport[] data){
		for (int i=0; i<data.length;i++){
			for (int j=i+1; j<data.length-1;j++){
				if(data[i].compareTo(data[j])>0) {
					Airport tmp = data[i];
					data[i]=data[j];
					data[j]=tmp;
					break;
				}
			}
			
		}
		return data;
	}
	
}
