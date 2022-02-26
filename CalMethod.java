/*create: 2022 02 27
Owner: Nuwan Wijeweera */
import java.util.Scanner;

public class CalMethod {
    static int add(int x1, int x2){
        return (x1+x2);
    }

    static int sub(int x1, int x2){
        return (x1-x2);
    }
    
    static int mul(int x1, int x2){
            return (x1*x2);
    }
    static int div(int x1, int x2){
        return (x1/x2);
    }

    public static void main(String[] args){
        Scanner value = new Scanner(System.in);

        int num1;
        int num2;
        String oper;

        System.out.print("Enter 1st number: ");
        num1 = value.nextInt();

        System.out.print("Enter 2nd Number: ");
        num2 = value.nextInt();

        System.out.print("Operation: ");
        oper = value.next();

        if (oper.equals("+"))
            System.out.println("Answer = " + add(num1,num2));

        else if (oper.equals("-"))
            System.out.println("Answer = " + sub(num1,num2));

        else if (oper.equals("*"))
            System.out.println("Answer = " + mul(num1,num2));

        else if (oper.equals("/"))
            System.out.println("Answer = " + div(num1,num2));

        else 
            System.out.println("Operation Invalied");
    
    }
}
