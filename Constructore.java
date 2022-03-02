public class Constructore {
    Constructore(){
        System.out.println("This is my Constructore");
    }
    Constructore(int x){
        System.out.println("This is my Constructore "+ x);
    }
    Constructore(int x, int y){
        System.out.println("This is my Constructore "+ (x+y));
    }
    
    public static void main(String[] args) {
            new Constructore();
            new Constructore(2);
            new Constructore(2, 1);
            new Lunch();
            new Dull();
            new Noodles();
    }
}
class Lunch{
    Lunch(){
        System.out.println("My lunch.");
    }
}
class Dull{
    Dull(){
        System.out.println("It has Dull.");
    }
}

class Noodles{
    Noodles(){
        System.out.println("It has Noodles.");
    }
}