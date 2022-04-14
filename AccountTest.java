import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.print("Pleace enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.printf("Name in  object myAccount is %s.", myAccount.getName());

    }
}
