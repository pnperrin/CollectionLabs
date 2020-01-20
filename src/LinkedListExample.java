import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListExample {
	public static void main(String[] args) {
		
		//create structures (ArrayList to compare runtime)
		LinkedList<Integer> numsLL = new LinkedList<Integer>();
		ArrayList<Integer> numsAL = new ArrayList<Integer>();
		
		Random random = new Random();
		int nextItem;
		for(int i = 0; i < 1000; i++) {
			nextItem = random.nextInt(10) + 1;
			numsLL.add(nextItem);
			numsAL.add(nextItem);
		}
		
		//LinkedLists are useful to remove and add items quickly
		long startTimeLL = System.nanoTime();
		
		for(int i = 0; i < numsLL.size(); i++) {
			if(numsLL.get(i) == 4) 
				numsLL.remove(i);
		}
		long endTimeLL = System.nanoTime();
		
		System.out.println("LinkedList time: " + (endTimeLL - startTimeLL));
		
		//ArrayList for comparison
		long startTimeAL = System.nanoTime();
		
		for(int i = 0; i < numsAL.size(); i++) {
			if(numsAL.get(i) == 4)
				numsAL.remove(i);
		}
		long endTimeAL = System.nanoTime();
		
		System.out.println("ArrayList Time: " + (endTimeAL - startTimeLL));
	}
}
