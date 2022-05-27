import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter some numbers. Enter a negative number to stop.");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Here are your numbers between 1 and 5: ");
        inputs.stream()
                .filter(num -> num > 0 && num < 6)
                .forEach(num -> System.out.println(num));

        scanner.close();
    }
}
