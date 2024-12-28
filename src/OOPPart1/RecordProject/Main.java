package OOPPart1.RecordProject;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Jane";
                        case 4 -> "Bob";
                        case 5 -> "Lisa";
                        default -> "Unknown";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
