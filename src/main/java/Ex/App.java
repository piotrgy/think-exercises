package Ex;

import java.io.IOException;

import static Ex.Decoding.decodeDigitsToIntNumber;
import static Ex.Decoding.getStringOfDigits;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //drukowanie wzoru z hashy
        /*System.out.println( "Hello World!" );
        polKwadratu();
        dwaTrojkaty();*/
        //*********************************************************************

        //sprawdzanie poprawności metodą Luhna
        //int sum, digit;

        /*InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);*/

        /*digit = getCharToDigit(br);

        System.out.println("liczba "+digit);*/

        /*System.out.println("Wprowadź pojedynczą cyfrę od 0 do 9: ");
        digit = getCharToDigit();
        System.out.println("wartość cyfrowa "+digit);
        sum = sumDoubleDigit(digit);
        System.out.println("Suma cyfr w podwojonej liczbie: "+sum);*/

        /*System.out.println("Wpisz liczbę parzystą, k jeśli koniec"); // parzystą 6 cyfrową
        if (isValidNumber()) { //isValidSixDigitNumber() isValidEvenDigitNumber()
            System.out.println("Suma kontrolna jest podzielna przez 10. Wynik poprawny.");
        } else {
            System.out.println("Suma kontrolna nie jest podzielna przez 10. Wynik niepoprawny.");
        }*/
        //*********************************************************************************

        //dekodowanie1
        System.out.println("Enter a digits for number (k - if end):"); //two digit number:");
        /*int number =*/ getStringOfDigits();//decodeDigitsToIntNumber(); //decodeTwoDigitNumber();
        //System.out.println("The number of these digits is: "+number);







        //6	0	2	5	1	4	8	5
        //5	3	8	2	7	1	8









    }
}
