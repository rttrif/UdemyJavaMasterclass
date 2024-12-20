package ControlFlow;

public class ForSatement {
    public static void main(String[] args) {
        int counter;

        for (counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(1000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double i = 7.5; i <= 10; i += 0.25) {

            double interestAmount = calculateInterest(1000, i);
            System.out.println("10,000 at " + i + "% interest = " + interestAmount);

            if (interestAmount > 8.5) {
                System.out.println("Interest amount more then 8.5%!!!");
                break;

            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
