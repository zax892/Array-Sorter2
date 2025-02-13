import java.util.Arrays;
import java.util.Scanner;

public class IntegerSorter {

    // Method to sort an array of integers
    public static int[] sortIntegers(int[] intArray) {
        Arrays.sort(intArray);
        return intArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a list of integers (comma separated): ");
        String input = scanner.nextLine();
        String[] inputStrings = input.split(",");
        int[] intArray = new int[inputStrings.length];

        // Convert input strings to integers
        for (int i = 0; i < inputStrings.length; i++) {
            intArray[i] = Integer.parseInt(inputStrings[i].trim());
        }

        // Sort the integers
        int[] sortedIntegers = sortIntegers(intArray);

        // Output the sorted integers
        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));

        scanner.close();
    }
}
