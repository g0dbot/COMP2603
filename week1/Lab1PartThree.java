/**
 * @Ronel Ramtahal
 */

import java.util.Scanner;
// import for question 3
import java.util.Random;

public class Lab1PartThree
{
    public static void exercise1(){
        //1
        System.out.println("Question 1");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(String.format("A circle with radius %.2f has an area of %.2f units", radius, area));
        keyboard.close();
    }
    
    public static void exercise2(){
        //2
        System.out.println("Question 2");
        System.out.println("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int q1EvenMax = keyboard.nextInt();
        System.out.print("Even numbers from " + q1EvenMax + ": ");
        for (int i=1; i<q1EvenMax; i++){
            if (i%2 == 0){
                System.out.print(i + " ");
            }
        }
        
        keyboard.close();
    }
    
    public static void exercise3(){
        //3
        Random rand = new Random();
        int q2RanNumber1 =  rand.nextInt(10);
        int q2RanNumber2 =  rand.nextInt(10);
        System.out.println("What is the product of "+ q2RanNumber1 + "and" + q2RanNumber2);
        int q2Prod = q2RanNumber1 * q2RanNumber2;
        System.out.println("The answer is " + q2Prod);
    }
    
    public static void exercise4(){
        //4
        String[] greetings = new String[]{"hi","howdy-doo", "hey"};
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        int randomNumber;
        String input;
        
        do {
            input = keyboard.nextLine();
            System.out.println(greetings[Math.abs(rand.nextInt() % 2)]);
        } while (!(input.equals("bye")));
        
        //close the scanner to release resources
        keyboard.close();
    }
    
    public static void main(String[] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
}
