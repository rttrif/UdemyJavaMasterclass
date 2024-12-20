package ControlFlow;

public class WhileAndDoWhileStatement {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int number = 0;
        while (number < 50) {
            number += 5;

            if (number % 25 == 0) {
                continue;
            }

            System.out.print(number + "_");
        }



        int num = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (num <= finishNumber) {
            num++;
            if (!isEvenNumber(num)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + num);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int num) {

        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}



