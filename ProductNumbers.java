import java.util.Scanner;

public class ProductNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter The 2nd Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter The 3rd Number: ");
        int num3 = input.nextInt();

        int Pruduct = num1*num2*num3;

        System.out.printf("Pruduct of the numbers is = %d\n", Pruduct);
    }
    
    
}