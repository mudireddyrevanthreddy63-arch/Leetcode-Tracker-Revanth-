// Last updated: 11/08/2026, 14:14:33
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // Take as many 1s as possible
        int onesTaken = Math.min(k, numOnes);
        
        // Remaining picks after taking ones
        int remaining = k - onesTaken;
        
        // Take as many 0s as possible
        int zerosTaken = Math.min(remaining, numZeros);
        remaining -= zerosTaken;
        
        // Whatever is left must be -1s
        int negOnesTaken = remaining;
        
        // Final sum = onesTaken - negOnesTaken
        return onesTaken - negOnesTaken;
    }
}