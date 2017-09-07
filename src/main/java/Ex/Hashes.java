package Ex;

/**
 * Hello world!
 */
public class Hashes {

    public static void polKwadratu() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void dwaTrojkaty() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4 - (Math.abs(3 - i)); j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void revertedTrapezoid() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (j >= 0 && j <= i) {
                    System.out.print(" ");
                } else System.out.print("#");
            }
            System.out.println("");
        }

    }
}
