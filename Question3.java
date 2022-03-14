public class Question3 {
    public int getSqare(int x){
        return x*x;
    }
    public String getSign(int x){
        if (x>=0)
            return "+";
        else
            return "-";
    }
    public int getPruduct(int x, int y, int z){
        return x*y*z;
    }
    public void getLargest(int x, int y){
        if (x>=y)
            System.out.printf("The Largest Number is %d\n.",x);
        else
            System.out.printf("The largest Number is %d\n",y);
    }
    public static void main(String[] args) {
        Question3 obj = new Question3();
        System.out.println("Sqare of the number ="+obj.getSqare(5));
        System.out.println("Sign of the number is "+obj.getSign(-8));
        System.out.println("Prduct of the numbers is= "+ obj.getPruduct(4, 5, 6));
        obj.getLargest(7, 9);     
    }
    
}
