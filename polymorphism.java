class Calculator{

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 and 3 (int): " + calc.add(2, 3));
        System.out.println("Addition of 1, 4, and 5 (int): " + calc.add(1, 4, 5));
        System.out.println("Addition of 2.5 and 3.7 (double): " + calc.add(2.5, 3.7));
    }
}
