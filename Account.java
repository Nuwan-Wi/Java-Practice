/*create: 2022 04 14
Owner: Nuwan Wijeweera */
public class Account {
    private String name;       //declared a instance variable

    //this constructor class use only when need to pass paramiters directly
    public Account (String name){   //this class useless if paramiters get from input statements.
        this.name = name;
    }
    public void setName(String name){   //set method
        this.name = name;
    }
    public String getName(){    //get method
        return name;
    }
    
}
