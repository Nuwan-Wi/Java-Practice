/*create: 2022 02 20
Owner: Nuwan Wijeweera */
import java.util.Scanner; // import scanner class

public class Addition {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);     //declar variable for get inputs

    //declare veriables to numbers & summation
    int num1;
    int num2;
    int sum;

    System.out.print("Enter the 1st Number: ");
    num1 = input.nextInt(); //asigning enterd values

    System.out.print("Enter the 2nd Number: ");
    num2 = input.nextInt();

    sum = num1 + num2; //calculate sum

    System.out.println(num1 + "+" + num2 + "=" + sum);  //concatinate print
    System.out.printf("%d + %d = %d", num1, num2, sum); //print in formated way
}
    
}
