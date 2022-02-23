/*create: 2022 02 22
Owner: Nuwan Wijeweera */
public class StringBase {
    public static void main(String[] args){
        String str = "671";  //asign local variable

        int num1 = Integer.valueOf(str, 8);  //convert value to base 8

        System.out.println(num1);
    }
    
}
