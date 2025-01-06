package OOPPart2.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie =  Movie.getMovie("Advanture", "Star Wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("Advanture", "Star Wars");

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }



    }
}
