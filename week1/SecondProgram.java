/**
 * @Ronel Ramtahal
 */

import java.util.Scanner;

public class SecondProgram
{
    public static void main(String args[]){
        Scanner screen = new Scanner(System.in);
        String name = screen.next();
        System.out.print("Hello ");
        System.out.print(name);
        System.out.print("Hello " + name);
    }
}