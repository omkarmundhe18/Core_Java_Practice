public class SwitchExample {
    public static void main(String[] args) {

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday is first day of week");
                break;

            case 2:
                System.out.println("Tuesday is second day of week");
                break;

            case 3:
                System.out.println("Wednesday is third day of week");
                break;

            case 4:
                System.out.println("Thursday is fourth day of week");
                break;

            case 5:
                System.out.println("Friday is fifth day of week");
                break;

            case 6:
                System.out.println("Saturday is sixth day of week");
                break;

            case 7:
                System.out.println("Sunday is seventh day of week");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}