import java.util.Scanner;

public class SignValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Value: ");
        Double value = input.nextDouble();

        if (value >= 0)
            System.out.println("Value is a possitive number");
        else
            System.out.println("Value is negetive number");

        input.close();
    }    
}
