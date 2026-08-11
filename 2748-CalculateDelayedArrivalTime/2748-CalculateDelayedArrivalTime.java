// Last updated: 11/08/2026, 14:14:28
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}