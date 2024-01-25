/**
 * @Ronel Ramtahal
 */

//4.1 import
import java.util.Scanner;

public class Lab1PartTwo
{
    public static void main(String[] args)
    {
        //1
        System.out.println("Question 1");
        System.out.println("My name is Englebert");
        System.out.println("\n");
        
        //2
        System.out.println("Question 2");
        String q2FirstName = "Englebert";
        String q2LastName = "Humperdinck";
        System.out.println("My name is Englebert " + q2LastName);
        System.out.println("My name is Englebert Humperdinck");
        System.out.println("My name is Englebert" + " Humperdinck");
        System.out.println("\n");
        
        //3
        System.out.println("Question 3");
        String q3FirstName = "Ronel";
        String q3LastName = "Ramtahal";
        System.out.println("First Name: " + q3FirstName);
        System.out.println("Last Name : " + q3LastName);
        System.out.println("\n");
        
        //4
        System.out.println("Question 4");
        System.out.println("Enter your name");
        //4.2
        Scanner keyboard = new Scanner(System.in);
        String q4FirstName = keyboard.nextLine();
        System.out.println("My name is " + q4FirstName);
        System.out.println("\n");
        
        //5
        System.out.println("Question 5");
        System.out.println("Hi what's your name");
        String q5FirstName = keyboard.nextLine();
        System.out.println("Nice to meet you " + q5FirstName);
        System.out.println("\n");
        
        //6
        System.out.println("Question 6");
        System.out.println("Hi what's your name");
        String q6Response = keyboard.nextLine();
        //simulated response
        //My name is Englebert
        String q6FirstName = q6Response.substring(10,20);
        System.out.println("Nice to meet you" + q6FirstName);
        System.out.println("\n");
        
        //close the scanner to release resources
        keyboard.close();
    }
}
