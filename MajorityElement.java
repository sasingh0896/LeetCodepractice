// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

// You may assume that the array is non-empty and the majority element always exist in the array.

// Example 1:

// Input: [3,2,3]
// Output: 3
// Example 2:

// Input: [2,2,1,1,1,2,2]
// Output: 2


import java.util.*;
import java.util.Iterator;
class MajorityElement {
    public int majorityElement(int[] arra1) {
		int n = arra1.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
		{
			if (map.get(arra1[i]) == null)
				map.put(arra1[i], 0);
			
			map.put(arra1[i], map.get(arra1[i]) + 1);
		}
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry pair = (Map.Entry)it.next();
			if ((int)pair.getValue() > n/2)
				return (int)pair.getKey();

			it.remove(); 
		}
		return -1;
	}
    }