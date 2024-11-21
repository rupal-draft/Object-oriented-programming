package encapsulation.datahiding_statickeyword;

public class Encapsulation {
    // It refers to the bundling of field and methods inside a class
    // It prevents outer class to access and change the fields of this class without permission
    // Data hiding
    private Long id; // Fields

    boolean getAccess = false; // permission to other classes to access and change the fields of this class

    public Long getId() { // Fields
        if(getAccess){
            return id;
        }
        return 0L;
    }

    public void setId(Long id) {
        if(getAccess){
            this.id = id;
        }
    }
}
