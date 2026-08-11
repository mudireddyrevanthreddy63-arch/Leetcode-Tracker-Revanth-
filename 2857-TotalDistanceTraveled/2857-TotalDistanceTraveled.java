// Last updated: 11/08/2026, 14:14:22
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalFuelUsed = 0;

        while (mainTank >= 5) {
            mainTank -= 5;
            totalFuelUsed += 5;

            if (additionalTank >= 1) {
                additionalTank -= 1;
                mainTank += 1;
            }
        }
        totalFuelUsed += mainTank;

        return totalFuelUsed * 10;
    }
}