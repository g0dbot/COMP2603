/**
 * @Ronel Ramtahal
 */

public class MathDemo
{
    public static void main(String args[]){
        int operator1 = 200;
        int operator2 = 2000;
        String output = "";
        
        //Expression
        int result = (operator2 - operator1)/100;
        //Avoid: int result = operator2 - operator1/100
        output = "The result is: " + result;
        System.out.println(output);
        
        //control flow statemts example
        if (result%2 == 0){
            output += " even";
        }
        
        else {
            output += " odd";
        }
        
        System.out.println(output);
    }
}