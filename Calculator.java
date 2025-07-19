import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;

    void add() {
        int result = num1 + num2;
        System.out.println("Addition: " + result);
    }

    void sub() {
        int result = num1 - num2;
        System.out.println("Subtraction: " + result);
    }

    void mul() {
        int result = num1 * num2;
        System.out.println("Multiplication: " + result);
    }

    void div() {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        while (true) {
            System.out.println("\nSelect operation to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int op = sc.nextInt();

            if (op == 5) {
                System.out.println("Exiting calculator!");
                break;
            }

            // Ask for numbers only if a valid operation is chosen
            System.out.println("Enter two numbers:");
            obj.num1 = sc.nextInt();
            obj.num2 = sc.nextInt();

            switch (op) {
                case 1: obj.add(); break;
                case 2: obj.sub(); break;
                case 3: obj.mul(); break;
                case 4: obj.div(); break;
                default:
                    System.out.println("Invalid input! Choose between 1 and 5.");
            }
        }

        sc.close();
    }
}
