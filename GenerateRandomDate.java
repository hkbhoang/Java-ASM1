/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author HKbhoang
 */
public class GenerateRandomDate {
    public static String generateRandomDate(String Format,String startDate,String endDate) throws ParseException
  {
   DateFormat formatter = new SimpleDateFormat(Format);
   Calendar cal=Calendar.getInstance();
   cal.setTime(formatter.parse(startDate));
   Long value1 = cal.getTimeInMillis();

   cal.setTime(formatter.parse(endDate));
   Long value2 = cal.getTimeInMillis();

   long value3 = (long)(value1 + Math.random()*(value2 - value1));
   cal.setTimeInMillis(value3);
   return formatter.format(cal.getTime());
     }
}
