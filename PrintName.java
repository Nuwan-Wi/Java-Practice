import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.printf("Your name is %s.", name);

        input.close();
    }
}
