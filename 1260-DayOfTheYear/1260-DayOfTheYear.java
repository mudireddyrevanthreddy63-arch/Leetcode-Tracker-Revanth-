// Last updated: 11/08/2026, 14:16:10
class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        if (month > 2 && isLeap(year)) result += 1;
        return result;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
