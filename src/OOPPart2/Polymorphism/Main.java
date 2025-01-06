package OOPPart2.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

        Movie theMovie2 = new ScienceFiction("Star Wars");
        theMovie2.watchMovie();

        Movie theMovie3 =  Movie.getMovie("Advanture", "Star Wars");
        theMovie3.watchMovie();


    }
}
