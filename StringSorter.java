import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {

    // Method to sort an array of strings
    public static String[] sortStrings(String[] strArray) {
        Arrays.sort(strArray);
        return strArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a list of strings (comma separated): ");
        String input = scanner.nextLine();
        String[] strArray = input.split(",");

        // Sort the strings
        String[] sortedStrings = sortStrings(strArray);

        // Output the sorted strings
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));

        scanner.close();
    }
}