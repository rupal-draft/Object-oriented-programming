package inheritance;

public class Vehicle {

    int wheelCounts;

    Vehicle(int count){
        System.out.println("Vehicle instance is created!!");
        this.wheelCounts = count;
    }

    void moving(){
        System.out.println("Vehicle is starting!!");
        System.out.println("Car is moving with number of wheels "+wheelCounts);
    }
}
