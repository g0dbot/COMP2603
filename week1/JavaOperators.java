/**
 * @Ronel Ramtahal
 */

public class JavaOperators
{
    public static void main(String args[]){
        int expr = 0;
        int num = 0;
        System.out.println("POSTFIX");
        System.out.println("\n");
        System.out.println("expr++ (post-increment)");
        System.out.println("number before expr++: " + expr);
        expr++;//increment
        System.out.println("number after expr++: " + expr);
        System.out.println("\n");
        
        System.out.println("expr-- (post-decrement)");
        System.out.println("number before expr--: " + expr);
        expr--;//decrement
        System.out.println("number after expr--: " + expr);
        System.out.println("\n");
        
        System.out.println("UNARY");
        System.out.println("\n");
        expr = -5;
        
        System.out.println("+expr not commonly used as it doesn't change sign");
        System.out.println("expr before +expr: " + expr);
        System.out.println("num before +expr: " + num);
        num = +expr;
        System.out.println("expr after +expr: " + expr);
        System.out.println("num after +expr: " + num);
        System.out.println("\n");
        
        System.out.println("-expr");
        System.out.println("expr before -expr: " + expr);
        System.out.println("num before -expr: " + num);
        num = -expr;
        System.out.println("expr after -expr: " + expr);
        System.out.println("num after -expr: " + num);
        System.out.println("\n");
        
        System.out.println("++expr");
        System.out.println("expr before ++expr: " + expr);
        System.out.println("num before ++expr: " + num);
        num = ++expr;
        System.out.println("expr after ++expr: " + expr);
        System.out.println("num after ++expr: " + num);
        System.out.println("\n");
        
        System.out.println("--expr");
        System.out.println("expr before --expr: " + expr);
        System.out.println("num before --expr: " + num);
        num = ++expr;
        System.out.println("expr after --expr: " + expr);
        System.out.println("num after --expr: " + num);
        System.out.println("\n");
        
        System.out.println("~expr bitwise NOT");
        System.out.println("expr before ~expr: " + expr);
        System.out.println("num before ~expr: " + num);
        num = ~expr;
        System.out.println("expr after ~expr: " + expr);
        System.out.println("num after ~expr: " + num);
        System.out.println("\n");
        
        System.out.println("! logical NOT");
        boolean isNot = true;
        System.out.println("isNot before Logical NOT: " + isNot);
        System.out.println("isNot after Logical NOT : " + !isNot);
    }
}