package Abstractions.Interfaces;


enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
}


interface FlightEnabled {
//    public abstract void takeOff(); // public and abstract modifiers are redundant;
//    abstract void land(); // abstract modifiers are redundant

    double MILES_TO_KILOMETERS = 1.609344;
    double KILOMETERS_TO_MILES = 0.621371;


    void takeOff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("Transition not implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

}

interface Trackable {

    void track();
}


public abstract class Animal {

    public abstract void move();
}
