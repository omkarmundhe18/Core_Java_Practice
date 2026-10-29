public class Weapper{
    public static void main(String[] args) {

        int num = 100;

        // Wrapper Class
        Integer wnum = Integer.valueOf(num);

        // String to int conversion
        String age = "100";
        int res = Integer.parseInt(age);

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + wnum);
        System.out.println("Parsed integer: " + res);
    }
}