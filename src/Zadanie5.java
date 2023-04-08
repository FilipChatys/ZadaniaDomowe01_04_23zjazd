import java.util.Scanner;

//Napisz program w którym zdefiniowana jest zmienna n. Program ma wyświetlać n elementów ciągu Fibonacciego.
// Co to jest ciąg Fibonacciego znajdziecie na wikipedii
public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Wprowadz ilosc elementow ciagu do pokazania ");
        int n = scanner.nextInt();

        // Declare variables for the first two elements of the sequence
        int first = 0, second = 1;

        // Print the first n elements of the Fibonacci sequence
        System.out.print("Oto twoj Ciag Fibonacciego: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next element in the sequence
            int next = first + second;

            // Update the values of first and second for the next iteration
            first = second;
            second = next;

        }
    }
}
