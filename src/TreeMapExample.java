import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {
	public static void main(String[] args) {
		
		int targetSize = 6;
		
		/* create arrays for manipulation */
		String[] ones = new String[targetSize];
		String[] twos = new String[targetSize];
		String[] threes = new String[targetSize];
		
		for(int i = 0; i < targetSize; i++) {
			ones[i] = Integer.toString((int)Math.pow(10,targetSize-i-1));
			twos[i] = Integer.toString(2*(int)Math.pow(10,targetSize-i-1));
			threes[i] = Integer.toString(3*(int)Math.pow(10,targetSize-i-1));
		}
		
		System.out.println("Arrays created: \n"+Arrays.toString(ones));
		System.out.println(Arrays.toString(twos));
		System.out.println(Arrays.toString(threes) + "\n");
		
		/* create treeMaps */
		Map<String, Set<String>> numList = new TreeMap<>();
	    Set<String> oneDigit = new TreeSet<>();
	    Set<String> twoDigit = new TreeSet<>();
	    Set<String> threeDigit = new TreeSet<>();
	    
	    for(int i = 0; i < targetSize; i++) {
	    	oneDigit.add(ones[i]);
	    	twoDigit.add(twos[i]);
	    	threeDigit.add(threes[i]);
	    }

	    numList.put("1", oneDigit);
	    numList.put("2", twoDigit);
	    numList.put("3", threeDigit);

	    System.out.println("TreeMap auto-sorting: \n" + numList);
	}
}
