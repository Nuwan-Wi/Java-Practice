/*create: 2022 02 22
Owner: Nuwan Wijeweera */
public class MyChild {
    void mySon(){       //only need to get output so void use      
        System.out.println("Hello my son.");
    }

    void myDoughter(){
        System.out.println("Heloow my doughter.");
    }

    public static void main(String[] args){
        MyChild massage1 = new MyChild();       //create object
        massage1.mySon();                       //call the method using object
        MyChild massage2 = new MyChild();
        massage2.myDoughter();  
    }
}
