package testingPpt.jenkinsTest;

import java.io.FileNotFoundException;
import java.io.PrintStream;
 /**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	final String a ="Hello World";
    	System.setOut(new PrintStream(a));
        System.out.println( "Hello World!" );
		System.out.println( "Hello World1!" );
    }
    
    public static String calculate()
    {
    	return "Hello World";
    }
}