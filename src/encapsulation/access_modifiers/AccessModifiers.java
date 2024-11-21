package encapsulation.access_modifiers;

public class AccessModifiers {

    public String title; // can be accessed everywhere

    private Long id; // cannot be accessed in different class without the use of getter and setter

    protected String email; // can be inherited by child class of same or different package but not an entirely different class

    String name; // can be accessed only in the classes of the same package

    public Long getId() { // Getter
        return id;
    }

    public void setId(Long id) { // Setter
        this.id = id;
    }
}
