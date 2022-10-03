import java.util.Scanner;
abstract class Car {
    public int noOfWheels;
    public Car(int noOfWheels){
        this.noOfWheels=noOfWheels;
    }
    public abstract void ignition();
    public void changeGear(){
        System.out.println("car gear changed");
    }
    
}
class Sedan extends Car{
    public Sedan(int noOfWheels){
        super(noOfWheels);
    }
    public void ignition(){
        System.out.println("number of wheels="+this.noOfWheels);
        System.out.println("ignition started");
    }
}
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of wheels");
        Sedan s=new Sedan(sc.nextInt());
        s.ignition();
        s.changeGear();
    }
}
