package com.github.ghaskins.osclarity;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.getProperties().list(System.out);

        Clarify.process();
        
        System.getProperties().list(System.out);
    }
}
