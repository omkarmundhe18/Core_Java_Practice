public class TryCatchExample {

    public static void main(String[] args) {

        // Try block
        try {
            int a = 10;
            int b = 0;

            // Arithmetic exception
            int result = a / b;

            System.out.println(result);
        }

        // Catch block
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}