package OOPPart1;


public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;


    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                model + " " +
                make + " " +
                (convertible ? "Convertible" : "")
        );
    }


    public void setMake(String make) {
        if (make == null) make = "Unknown";

        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "bmw", "holden", "tesla" -> this.make = "BMW";
            default -> this.make = "Unsupported";
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }
}
