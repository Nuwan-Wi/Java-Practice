/*create: 2022 02 22
Owner: Nuwan Wijeweera */
public class Variable {
    static int age = 24;  //this is a static variable
    int milf = 35;

    public void nextAge(){
        milf+=1;
    }

    public static void main(String[] args){
        Variable obj = new Variable();
        obj.nextAge();

        System.out.println("Age = " + obj);
        System.out.printf("Milf Age = %d\n", Variable.age);
    }
    
}
