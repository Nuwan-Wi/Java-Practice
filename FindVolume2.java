import java.util.Scanner;

public class FindVolume2 {
    
    private Double radius;

    public FindVolume2(){
        radius = 1.0;
    }

    public FindVolume2(Double radius){
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return Math.PI * radius * radius;
    }

    public Double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        Double doni = input.nextDouble();

        FindVolume2 obj = new FindVolume2(doni);
        System.out.println(obj.getArea());
        System.out.println(obj.getCircumference());
        input.close();
    }
}
