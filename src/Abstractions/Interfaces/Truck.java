package Abstractions.Interfaces;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates is recorded");

    }
}
