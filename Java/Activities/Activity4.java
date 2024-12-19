import java.util.Arrays;

public class Activity4 {
//note: for each use to traverse collection automatic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unsorted[]= {4,3,2,10,12,1,5,6};
		 int size = unsorted.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = unsorted[i];
	           int j ;
	            for ( j = i - 1; j >= 0 && key < unsorted[j];--j) {
	            	unsorted[j + 1] = unsorted[j];
	            }
	            unsorted[j + 1] = key;
	        }
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(unsorted)); 
	    }
	    
	}




