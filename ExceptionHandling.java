import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // ArithmeticException: Division by zero
            System.out.print("Enter numerator: ");
            int a = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.print("Enter array index (0 to 2): ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);

            // NumberFormatException
            scanner.nextLine();  // consume newline
            System.out.print("Enter a number as text: ");
            String text = scanner.nextLine();

            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}
