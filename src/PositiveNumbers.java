import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Insert numbers. \"end\" to stop.");
        while(true){
            String numbers = scanner.nextLine();
            if(numbers.equals("end")){
                break;
            }
            list.add(Integer.valueOf(numbers));
        }
        List<Integer> positiveNums =  positive(list);
        System.out.println(positiveNums);
    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> pos = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return pos;
    }
}
