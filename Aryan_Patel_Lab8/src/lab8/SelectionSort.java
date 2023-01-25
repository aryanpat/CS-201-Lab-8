package lab8;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) throws IOException {
		
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
		
		
		sortData(arraySort);
		
		System.out.println("The 500000th number is: " + arraySort[500000]);
		
		long end = System.currentTimeMillis();
		
		System.out.println("The total run time for Selection Sort is " + (end - start) + "ms.");
		
	}
		
	public static int[] sortData (int[] A) {
			
		for(int i = 0; i < A.length - 1; i++) {
			
			int minIndex = i;
			
			for(int j = i + 1; j < A.length; j++) {
				
				if(A[j] < A[minIndex]) {
					
					minIndex = j;
					
				}
				
			}
			
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
			
		}
		
		return A;
		
	}
}
