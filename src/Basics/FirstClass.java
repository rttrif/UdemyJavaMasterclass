package Basics;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It's not alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both  of the conditions are true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This is a domestic car");
        }

        String s =  (isDomestic) ? "This car is domestic" : "This isn't a domestic";
        System.out.println(s);

    }
}
