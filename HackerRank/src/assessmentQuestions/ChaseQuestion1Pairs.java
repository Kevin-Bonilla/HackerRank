package assessmentQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Determine the max amount of pairs given two arrays A & B. To become a valid pair a[i] > b[j]. 
 * Elements cannot be used in more than one pair.
 * 
 * Input: N = 3, arr1[] = {3, 2, 1}, M = 4, arr2[] = {3, 4, 2, 1}
 * Output: 2
 */

class MySolution{
	
	public static int maxPairsMyWay(ArrayList<Integer> A, ArrayList<Integer> B) {
		int maxPairs = 0;
		
		// Natural sorting order least to greatest
		Collections.sort(A);
		// reverse so greatest numbers are in the front (not the case as we will have the biggest amount of gap between the two numbers)
		//Collections.reverse(A);
		
		// we want smallest numbers in front so we keep natural sorting order for arraylist B
		Collections.sort(B);
		
		// use variables so we can resize them
		int aSize = A.size();
		int bSize = B.size();
		
		for (int i = 0; i < aSize; ) {
			for (int j = 0; j < bSize;) {
				// comparing (a[i],b[j])
				int ai = A.get(i);
				int bj = B.get(j);
				
				System.out.println("Current Array A: " + A);
				System.out.println("Current Array B: " + B);
				System.out.println("Currently Checking i= "+ i + " j = " + j + "(" + ai + "," + bj +")");
				
				// if statement if pair qualifications are met
				if (ai > bj) {
					
					maxPairs++;
					
					System.out.println("Pair found and taken out (" + ai + "," + bj + ")");
					
					// removes pair and resizes for loops
					A.remove(i);
					B.remove(j);
					aSize = A.size();
					bSize = B.size();
					
					// stops index problem
					if (i == aSize) {
						i = aSize - 1;
					}
					if (j == bSize) {
						j = bSize - 1;
					}
					
					// skips j++
					continue;
				}
				j++;
			}
			i++;
		}
		return maxPairs;
	}
	
	public int maxPairsGreedy(ArrayList<Integer> A, ArrayList<Integer> B) {
		int maxPairs = 0;
		
		return maxPairs;
	}
}
	


public class ChaseQuestion1Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		 
        // Inserting some Integer values in ArrayList
        listA.add(3);
        listA.add(2);
        listA.add(1);
        
        listB.add(3);
        listB.add(4);
        listB.add(2);
        listB.add(1);
        
        int maxPair = MySolution.maxPairsMyWay(listA, listB);
        System.out.println();
        System.out.println("MaxPairs =" + maxPair);
	}

}
