package OOPPart1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Blue");

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());

        car.describeCar();

    }

}
