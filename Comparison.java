/*create: 2022 02 20
Owner: Nuwan Wijeweera */
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args){
        java.util.Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter 1st Number: ");
        num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        num2 = input.nextInt();

        if (num1 == num2)
            System.out.printf("%d == %d%n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d%n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d%n", num1, num2);        
    }
}
