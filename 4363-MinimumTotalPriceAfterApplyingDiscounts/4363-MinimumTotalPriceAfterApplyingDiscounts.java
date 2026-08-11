// Last updated: 11/08/2026, 14:13:41
import java.util.*;
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);

        Arrays.sort(discounts);

        double total = 0;
        int p = prices.length - 1;
        int d = discounts.length - 1;

        while(p >= 0) {
            if(d >= 0) {
                total += (double) prices[p] * (100 - discounts[d] ) / 100.0;
                d--;
            }else {
                total += prices[p];
            }
            p--;
        }

        return total;
    }
}