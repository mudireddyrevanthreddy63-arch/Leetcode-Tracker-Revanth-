// Last updated: 11/08/2026, 14:15:26
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int gained = empty / numExchange;
            totalDrunk += gained;
            empty = (empty % numExchange) + gained;
        }

        return totalDrunk;
    }
}