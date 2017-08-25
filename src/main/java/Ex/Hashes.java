package Ex;

/**
 * Hello world!
 *
 */
public class Hashes
{

    public static void polKwadratu(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5-i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void dwaTrojkaty(){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 4-(Math.abs(3-i)) ; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
