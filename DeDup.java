import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34,
			86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17,
			16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17,
			10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) throws Exception {
		DeDup dup = new DeDup();
		dup.filterDuplicates();
		dup.filterDuplicatesRetainingOrder();
		dup.filterDuplicatesAndSortElements();
	}
	
	public int[] filterDuplicates () throws Exception {
		Set<Integer> hashSet = new HashSet<Integer>();
		for(int random : randomIntegers) {
			hashSet.add(random);
		}
		return convertSetToArray(hashSet);
	}
	
	public int[] filterDuplicatesAndSortElements() throws Exception {
		Set<Integer> treeSet = new TreeSet<Integer>();
		for(int random : randomIntegers) {
			treeSet.add(random);
		}
		return convertSetToArray(treeSet);
	}
	
	public int[] filterDuplicatesRetainingOrder() throws Exception {
		Set<Integer> linkedSet = new LinkedHashSet<Integer>();
		for(int random : randomIntegers) {
			linkedSet.add(random);
		}
		return convertSetToArray(linkedSet);
	}

	private int[] convertSetToArray(Set<Integer> noDupSet) {
		if(noDupSet != null) {
			int[] ret = new int[noDupSet.size()];
			Iterator<Integer> it = noDupSet.iterator();
			int i=0;
			while(it.hasNext()) {
				ret[i++] = it.next();
			}
			return ret;
		}
		return null;
	}
}
