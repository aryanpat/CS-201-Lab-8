package lab8;

public class Optomized {

	public static void bubbleopt (int Array[]) {
		
		boolean bub = false;
		
		for (int a = 0; a < Array.length; a++) {
			
			bub = false;
		}
		
		for(int b = 0 ; b < Array.length-1; b++) {
				if (Array[b+1] < Array[b]) {
					
					int hold = Array[b];
					Array[b + 1] = hold;
					bub = true;
					
				}
		
			}
		}

}
