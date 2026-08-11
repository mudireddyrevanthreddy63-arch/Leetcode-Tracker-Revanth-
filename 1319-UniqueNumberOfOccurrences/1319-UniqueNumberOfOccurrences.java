// Last updated: 11/08/2026, 14:16:08
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> freqSet = new HashSet<>(freqMap.values());
        return freqMap.size() == freqSet.size();
    }
}
