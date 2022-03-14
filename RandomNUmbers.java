/*create: 2022 03 14
Owner: Nuwan Wijeweera */
import java.util.Random;

public class RandomNUmbers {
    public static void main(String[] args) {
        Random Randnum = new Random();
        int maxnum = 100;

        // int num1 = Randnum.nextInt(100);
        // int num2 = Randnum.nextInt(100);

        // // System.out.printf("Two Random Generated numbers are %d and %d\nSummation = %d", num1, num2, (num1+num2));
        // System.out.printf("Generate numbers are %d & %d.\n", num1 ,num2);
        // if (num1>=num2)
        //     System.out.printf("The largest generate number is %d", num1);
        // if (num1<num2)
        //     System.out.printf("The largest generate number is %d", num2);

        int [] number = new int[10];
        for (int i=0; i<number.length; i++){
            int num = Randnum.nextInt(89)+10;
            number[i] = num;
        }

        for (int j=0; j<number.length; j++){
            System.out.println(number[j]);
            if (maxnum>number[j])
                maxnum = number[j];        

        }
        System.out.println("maximum number = "+maxnum);
    }

}
