// Last updated: 11/08/2026, 14:14:14
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for (int x : nums1) s1.add(x);
        for (int x : nums2) s2.add(x);
        
        int n = nums1.length;
        int a = Math.min(s1.size() - (int) s1.stream().filter(s2::contains).count(), n / 2);
        int b = Math.min(s2.size() - (int) s2.stream().filter(s1::contains).count(), n / 2);
        int c = (int) s1.stream().filter(s2::contains).count();
        
        return Math.min(a + b + c, n);
    }
}
