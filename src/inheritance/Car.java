package inheritance;

public class Car extends Vehicle{// Car class is the child class which is inheriting all the properties of Vehicle class which is parent class
    final String color = "Red"; // no one can update this value in future by using final keyword
    Car(){
        super(2);// invoking the constructor of  the parent class
    }
    // this is called method overriding
    @Override
    void moving() {// this method with the same name is there in the parent class, but it is specifically implemented in the child class so it will override the parent class method and gets executed
        super.moving();// it is used to refer to the instance of the immediate parent class
        System.out.println(color+" Car is moving ");
    }


    public static void main(String[] args){
        Car car = new Car();
        car.moving();// wheelcount is 2 because of calling the parameterized vehicle constructor by super keyword
        car.wheelCounts = 4;
        car.moving();
    }

}
