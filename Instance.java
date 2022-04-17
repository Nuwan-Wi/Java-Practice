/*create: 2022 02 27
Owner: Nuwan Wijeweera */
public class Instance {
    private String myName;
    
    public void setValue(String myName){
        this.myName = myName;
    }

    public String getValue(){
        return myName;
    }
    public static void main(String[] args){
        Instance obj = new Instance();
        obj.setValue("Nuwan");
        System.out.println("My Name = "+ obj.getValue());
    }
}
