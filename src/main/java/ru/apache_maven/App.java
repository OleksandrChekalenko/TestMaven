package ru.apache_maven;

import org.joda.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Now is " + new LocalDateTime() + ".");
        System.out.println( "Now is " + new LocalDateTime().getDayOfYear()+ " day of year.");


    }
}
