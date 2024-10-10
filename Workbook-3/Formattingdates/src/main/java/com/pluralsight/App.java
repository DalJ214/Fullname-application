package com.pluralsight;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args){


        TimeZone timeZone = TimeZone.getTimeZone("US/Central");

        LocalDateTime today = LocalDateTime.now();
        // Specify the date/time format you will want to use
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy  ");
        String formattedDate = today.format(fmt);
        System.out.println( formattedDate);
    }
    }

