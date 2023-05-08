package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static  String[] returnNextMonth(){
        //Create Date Object
        Date dNOW=new Date();
        //Create calender object for Gregorian Calneder
        Calendar calender=new GregorianCalendar();
        //Set calender object to current date
        calender.setTime(dNOW);

      //create object for SimpleDateFormat
        //Defining Date format to example(jan-2022)
        SimpleDateFormat sdf=new SimpleDateFormat("MMM-yyyy");
        //Increment the current month
        calender.add(Calendar.MONTH,1);
        //Generate the date base on the specified object
        String date=sdf.format(calender.getTime());
        //returning the value of month and year in an array
        return date.split("-");




    }


}
