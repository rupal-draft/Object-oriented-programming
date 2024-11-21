package encapsulation.access_modifiers;

public class Access extends AccessModifiers{

    public static void main(String [] args){

        Access access = new Access();

        access.title = "Rupal"; // accessing public field
        access.email = "rupalpaulgspr@gmail.com"; // accessing the protected field in child class;
        access.name = "Rupal Paul"; // accessing the default field from the same package
        access.setId(1L); // accessing and setting the private field by Getters and setters

        PrintObject printObject = new PrintObject();
        printObject.print(access);
    }
}

class PrintObject{
    void print(Access access){
        System.out.println(access.email + " " + access.name + " " + access.title + " " + access.getId());
    }
}