import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value: ");
        Double value = input.nextDouble();
        System.out.println("Sqare root of the value is : "+ Math.sqrt(value));
    }   
    
}
