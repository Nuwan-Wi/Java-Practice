import java.util.Scanner;

public class AvarageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter The 2nd Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter The 3rd Number: ");
        int num3 = input.nextInt();

        int Avg = (num1+num2+num3)/3;

        System.out.printf("Avarage is = %d", Avg);
        
        input.close();
    }
}
