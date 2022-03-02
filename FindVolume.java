
import java.util.Scanner;

public class FindVolume {
    // public static void main(String[] args){
    //     Scanner Input =new Scanner(System.in);

    //     System.out.print("Enter Hight: ");
    //     int hight = Input.nextInt();

    //     System.out.print("Enter Radias: ");
    //     int radias = Input.nextInt();

    //     volume(hight,radias);
    // }

    // static void volume(int r, int h){
    //     double volume =Math.PI*r*r*h;
    //     dispvolume(volume);
    // }
    // static void dispvolume(double v){
    //     System.out.println("The volume of the cone : " +v);
    //     System.out.printf("The volume of the cone :%.2f %s" ,v ,"unit");

    // }

    int lenth, hight;
    FindVolume(int x, int y){
        lenth = x;
        hight = y;
        area(lenth, hight);
    }
    static void area(int len, int hig){
        System.out.println("Area = "+ (len*hig));
    }
    public static void main(String[] args) {
        new FindVolume(3, 5);
    }


}
