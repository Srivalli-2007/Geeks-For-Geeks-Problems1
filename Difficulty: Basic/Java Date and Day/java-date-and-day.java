class Solution {
    static String findDay(int Day, int Month, int Year) {
        java.util.Calendar cal = java.util.Calendar.getInstance();

        cal.set(Year, Month - 1, Day);

        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        return days[cal.get(java.util.Calendar.DAY_OF_WEEK) - 1];
    }
}