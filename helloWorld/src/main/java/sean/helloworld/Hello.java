package sean.helloworld;

import java.util.*;

/**
 *
 * @author Sean Nethercot
 */

public class Hello {
    public static void main (String[] args){
        System.out.println("Hello, World!");
        
        Scanner myScanner = new Scanner(System.in);
        Integer input = 0;
        
        System.out.println("Please enter a number!");
        
        input = myScanner.nextInt();
        
        System.out.println("You wrote " + input);
    }
}
