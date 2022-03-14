/*create: 2022 03 14
Owner: Nuwan Wijeweera */
//This file created to practice constructore classes.
public class Vehical {
    public static void main(String[] args){
        System.out.println("This car is for sale.");
        new Engine();
        new Tyer();
    }
    
}
 class Engine{
     Engine(){
         System.out.println("Engine is fine.");
     }
 }

 class Tyer{
     Tyer(){
         System.out.println("Tyers are new.");
     }
 }