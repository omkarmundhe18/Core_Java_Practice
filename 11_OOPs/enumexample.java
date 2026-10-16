enum Season {
    SUMMER, RAINY, WINTER
}

public class enumexample {
    public static void main(String[] args) {

        Season s = Season.WINTER;

        switch (s) {
            case SUMMER:
                System.out.println("It is Summer");
                break;

            case RAINY:
                System.out.println("It is Rainy Season");
                break;

            case WINTER:
                System.out.println("It is Winter");
                break;

            default:
                System.out.println("Invalid Season");
        }
    }
}