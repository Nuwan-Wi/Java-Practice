
/*create: 2022 04 14
Owner: Nuwan Wijeweera */
import java.util.Scanner; //import scanner class

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create object to use scanner class

        /**
         Account myAccount = new Account(); // create object to use Account class in Account.java (both in same pacage.
                                           // so didn't want to import.)

        System.out.print("Pleace enter the name: "); // get the name as input
        String theName = input.nextLine(); // asign input into variable
        myAccount.setName(theName); // set the paramiter into object

        System.out.printf("Name in object myAccount is %s.%n", myAccount.getName()); // get output
        */

        // Create two object that provide paramiters
        Account account1 = new Account("Nuwi wijeweera");
        Account account2 = new Account("Nuwanya rathnashsri");

        System.out.printf("Name in object Account is %s.%n", account1.getName());
        System.out.printf("Name in object mAccount is %s.%n", account2.getName());

        input.close(); // close clanner object

    }
}
