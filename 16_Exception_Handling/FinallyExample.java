public class FinallyExample {

    public static void main(String[] args) {

        try {
            int num = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}