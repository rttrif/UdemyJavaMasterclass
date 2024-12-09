package FirstSteps;

public class FirstSteps {
    public static void main(String[] args) {
        int myFirstNumber = 5;

        int mySecondNumber = (10+ 5) + (2 * 500);

        int myThirdNumber = 99;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

//        Try to re-declaring a variable and get an error
//        int myFirstNumber = 100;

        System.out.println("myFirstNumber value = " + myFirstNumber);
        System.out.println("Hello World");
        System.out.println("mySecondNumber value = " + mySecondNumber);
        System.out.println("TOTAL VALUE: "  + myTotal);

        System.out.println("LAST VALUE: "  + myLastOne);

//      Primitive Types

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer min values: " + myMinIntValue);
        System.out.println("Integer max values: " + myMaxIntValue);
        System.out.println("Integer values range from " + myMaxIntValue + " to " + myMinIntValue);

//      java: integer number too large
//      int test = 2147483648;
//      System.out.println(test)

        byte myByteValue = 2;
        short myShortValue = 300;
        int myIntValue = 200;
        long myLongValue = 50_000L + (myByteValue + myShortValue + myIntValue) * 10L;

        short castingDataTyepValue = (short) (1000 + (myByteValue + myShortValue + myIntValue) * 10);
        System.out.println(myLongValue);
        System.out.println(castingDataTyepValue);

    }
}
