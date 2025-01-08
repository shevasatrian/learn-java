package Day02;

public class App {
    public static void main(String[] args) {
        Object variableObject = 1;
        System.out.println(variableObject);
        variableObject = "satu";
        System.out.println(variableObject);

        Vehicle motor = new Vehicle();
        motor.setName("Motor");
        motor.setBrand("Kawasaki");
        motor.setModel("ZX 250");
        motor.setEngineType("4 cylinders");
        motor.setEngineCapacity(250);
        motor.setWheels(2);

        motor.start();
        motor.accelerate(20);
        motor.accelerate(20);
        motor.stop();
        motor.turnOff();

        Car myCar = new Car();
        myCar.rev();

        Motorbike myBike = new Motorbike();
        myBike.rev();
        
    }
}
