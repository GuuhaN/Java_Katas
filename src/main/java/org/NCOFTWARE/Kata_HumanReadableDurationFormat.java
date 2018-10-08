package org.NCOFTWARE;

public class Kata_HumanReadableDurationFormat {

    public final static void main(String args[]){
        System.out.println(timeConversion(32723662 ));
    }

    private static String timeConversion(long totalSeconds) {

        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_A_MINUTE = 60;
        final int HOURS_IN_A_DAY = 24;
        final int DAYS_IN_A_YEAR = 365;

        long seconds = totalSeconds % SECONDS_IN_A_MINUTE;
        long totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
        long minutes = totalMinutes % MINUTES_IN_AN_HOUR;
        long totalHours = totalMinutes / MINUTES_IN_AN_HOUR;;
        long hours = totalHours % HOURS_IN_A_DAY;
        long totalDays = totalHours / HOURS_IN_A_DAY;
        long days = totalDays % DAYS_IN_A_YEAR;
        long years = totalDays / DAYS_IN_A_YEAR;

        StringBuilder timeToShow = new StringBuilder();
        int count = 0;

        if(totalSeconds == 0)
            return "now";

        if(years > 0)
        {
            if(years == 1)
                timeToShow.append(years + " year");
            else
                timeToShow.append(years + " years");
            count++;
        }

        if(days > 0)
        {
            if(count != 0)
                timeToShow.append(", ");
            if(days == 1)
                timeToShow.append(days + " day");
            else
                timeToShow.append(days + " days");
            count++;
        }

        if(hours > 0)
        {
            if(count != 0)
                timeToShow.append(", ");
            if(hours == 1)
                timeToShow.append(hours + " hour");
            else
                timeToShow.append(hours + " hours");
            count++;
        }

        if(minutes > 0)
        {
            if(count == 3)
                timeToShow.append(" and ");
            else
                timeToShow.append(", ");
            if(minutes == 1)
                timeToShow.append(minutes + " minute");
            else
                timeToShow.append(minutes + " minutes");
            count++;
        }

        if(seconds > 0 && count <= 3)
        {
            if(count != 0)
                timeToShow.append(" and ");
            if(seconds == 1)
                timeToShow.append(seconds + " second");
            else
                timeToShow.append(seconds + " seconds");
            count++;
        }

        return timeToShow.toString();
    }
}
