package lab8;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) throws IOException {
		
		//The time complexity of Selection Sort is N^2 which is different from Quick Sort which is (n*log(n)). Quick sort is much faster than Selection Sort. This is different from Lab 7 results
		//as in Lab 7 linear search had just linear complexity while binary search had log(n) which is different from the complexity of both sorting techniques used. Overall Selection Sorting took
		//much longer than Quick Sort. Roughly 3 mins vs 2 seconds.
		
		long start = System.currentTimeMillis();
		
		BufferedReader bf = new BufferedReader(new FileReader("/Users/aryanpat/Desktop/12206994.txt"));
		ArrayList<String> listOfInts = new ArrayList<String>();
		
		String line = bf.readLine();
		 
		while (line != null) {
			listOfInts.add(line);
            line = bf.readLine();
        }
		
		bf.close();
		
		String[] array = listOfInts.toArray(new String[0]);
		
		int[] arraySort = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
		   
		 arraySort[i] = Integer.parseInt(array[i]);
		  
		}
		
		
		sortData(arraySort, 0, arraySort.length - 1);
		
		System.out.println("The 500000th number is: " + arraySort[500000]);
		
		long end = System.currentTimeMillis();
		
		System.out.println("The total run time for Selection Sort is " + (end - start) + "ms.");
		
	}
	
		public static void sortData(int[] array, int low, int high) {
			
			if(low >= high) {
				
				return;
				
			}
			
			int test = array[high];
			
			int start = low;
			int end = high;
			
			while(start < end) {
				
				while(array[start] <= test && start < end){
					start++;
				}
				
				while(array[end] >= test && start < end) {
					end--;
				}
				
				swapTest(array, start, end);
				
			}
			
			swapTest(array, start, high);
			
			sortData(array, low, start-1);
			sortData(array, start+1, high);
			
			
		}
		
		public static void swapTest(int[] array, int ind1, int ind2) {
			
			int holder = array[ind1];
			array[ind1] = array[ind2];
			array[ind2] = holder;
			
		}

}
