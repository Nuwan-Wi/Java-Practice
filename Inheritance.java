
class Inherit{ 
    public void getPrint(){
        System.out.println("I am parent.");
    }    
}

public class  Inheritance extends Inherit {
    public void getValue(){
        System.out.println("I am child.");
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.getPrint();
        obj.getValue();
    }
}