package encapsulation.datahiding_statickeyword;

public class MainInEncapsulation {

    public static void main(String[] args){

        Encapsulation encapsulation = new Encapsulation();

        encapsulation.setId(1L);

        System.out.println(encapsulation.getId());

        //Both of this statements will return 0 as we have not given the permission to access the id field of the encapsulation class

        StaticKeyword.count = 20;// we do not have to create the instance of the StaticKeyword class, we can access it by their class name;
        StaticKeyword.print();// output: 20

        StaticKeyword staticKeyword = new StaticKeyword();

        staticKeyword.count = 10;

        StaticKeyword staticKeyword1 = new StaticKeyword();

        staticKeyword1.print();// as the count variable is modified by the first object so it will be reflected in this object also
        // output: 10
    }
}
