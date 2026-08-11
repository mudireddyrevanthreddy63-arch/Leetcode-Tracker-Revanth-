// Last updated: 11/08/2026, 14:15:58
import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();
        
        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            losses.putIfAbsent(winner, 0); // winner must be tracked
            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }
        
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        
        
        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
            if (entry.getValue() == 0) zero.add(entry.getKey());
            else if (entry.getValue() == 1) one.add(entry.getKey());
        }
        
        Collections.sort(zero);
        Collections.sort(one);
        
        return Arrays.asList(zero, one);
    }
}
