package ControlFlow;

public class Switch {
    public static void main(String[] args) {


        int switchValue = 1;

//        Old approach for the switch statement
        switch (switchValue) {
            case 1:
                System.out.println("Values was 1");
                break;
            case 2:
                System.out.println("Values was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

//        New approach for the switch statement
        switch (switchValue) {
            case 1 -> System.out.println("Values was 1");
            case 2 -> System.out.println("Values was 2");
            default -> System.out.println("Was not 1 or 2");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "Unknown";
        };
    }
}
