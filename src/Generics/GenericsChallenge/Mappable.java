package Generics.GenericsChallenge;

import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLocation(String location) {

        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable {
    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLocation(location);
    }

    @Override
    public void render() {
        System.out.println("Render" + this + "as POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}


abstract class Line implements Mappable {

    private double[][] location;

    public Line(String... location) {
        this.location = new double[location.length][];
        int index = 0;
        for (var line : location) {
            this.location[index++] = Mappable.stringToLocation(line);
        }
    }

    @Override
    public void render() {
        System.out.println("Render" + this + "as LINE (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(location);
    }
}






























