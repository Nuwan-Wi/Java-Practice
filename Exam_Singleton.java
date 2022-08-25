public class Exam_Singleton {
    private static Exam_Singleton obj = null;

    private Exam_Singleton(){

    }

    public static Exam_Singleton singletonClass() {
        if (obj == null){
            obj = new Exam_Singleton();
        }
        return obj;

    }

    public void display(){
        System.out.println("This is singleton");
    }

    
}

