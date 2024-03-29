import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break; 
            }

            try {
                int n = Integer.parseInt(input);
                numbers.add(n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }

        System.out.println("Unsorted ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
    }
}
