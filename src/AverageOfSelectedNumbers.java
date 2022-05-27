import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            inputs.add(number);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("n")) {
            double negativeAv = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + negativeAv);
        }

        if (ans.equalsIgnoreCase("p")) {
            double positiveAv = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + positiveAv);
        }
    }
}
