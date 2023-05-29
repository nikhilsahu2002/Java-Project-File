import java.util.Calendar;

class Result {

    public static void main(String[] args) {
        int day = 17;
        int month = 5;
        int year = 2023;
        
        // Create a Calendar instance and set the day, month, and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Note: month is zero-based
        
        // Get the day of the week (Sunday = 1, Monday = 2, ..., Saturday = 7)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Map the day of the week to a string representation
        String dayOfWeekString = getDayOfWeekString(dayOfWeek);
        
        System.out.println("Day of the week: " + dayOfWeekString);
    }
    
    public static String getDayOfWeekString(int dayOfWeek) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return daysOfWeek[dayOfWeek - 1];
    }
}
