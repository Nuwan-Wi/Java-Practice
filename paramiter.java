/*create: 2022 02 27
Owner: Nuwan Wijeweera */
public class paramiter {
    /*public static void main(String[] args){
        concat("Net","Ball");
    }

    public static void concat(String s1, String s2){
        System.out.println("Result = "+ s1 + s2);
    }*/

    public static String concat(String s1, String s2){
        return s1+s2;
    }

    public static void main(String[] args){
        System.out.println("Result = " + concat("Net", "Ball"));
    }      

    
    // static int myMethod(int x,int y){
    //     return x+y;
    // }
    
    // public static void main(String[] args){
    //     System.out.println(myMethod(5,1));
    // }
      
}
