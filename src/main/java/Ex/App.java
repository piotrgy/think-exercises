package Ex;

import java.io.IOException;

import static Ex.Hashes.lozenge;
import static Ex.Hashes.revertedTrapezoid;
import static chapter3.Sorting.instertSorting;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        //drukowanie wzoru z hashy
        /*System.out.println( "Hello World!" );
        polKwadratu();
        dwaTrojkaty();*/
        //revertedTrapezoid();
        //lozenge();
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
        /*System.out.println("Enter a digits for number (k - if end):"); //two digit number:");
        *//*int number =*/ //getStringOfDigits();//decodeDigitsToIntNumber(); //decodeTwoDigitNumber();
        //System.out.println("The number of these digits is: "+number);

        /*System.out.println("Enter a number from 1 to 8");
        char c = decodePunctuationMark();
        System.out.println("You've entered "+c);*/

        //decodeNumber(54);
        //decodeNumber(41);
        //2 1 0 52 53 54 55 6 7 8 9 10 -1

        //letter's decoding
        /*final char UPPER = 'A';
        final char LOWER = 'a';
        System.out.println(decodeLetter(5, UPPER));
        System.out.println(decodeLetter(6, LOWER));*/

        /*List<Character> letters = new ArrayList<Character>();
        System.out.println("Enter a digits, end by comma mark.");
        for (int i = 0; i<5;i++) {
            int inputNumber = getStringOfDigits();
            int outputNumber = decodeNumber(inputNumber);

            if (outputNumber != 0) {
                final char UPPER = 'A';
                final char LOWER = 'a';

                switch (getMode()) {
                    case UPPERCASE :
                        letters.add(decodeLetter(outputNumber, UPPER));
                        break;
                    case LOWERCASE :
                        letters.add(decodeLetter(outputNumber, LOWER));
                        break;
                    case PUNCTUATION :
                        letters.add(decodePunctuationMark());
                        break;
                }
            }
        }
        System.out.println("Decoded message is:");
        for (Character letter : letters) {
            System.out.print(letter);
        }*/


        //6	0	2	5	1	4	8	5
        //5	3	8	2	7	1	8

//Chapter 3
        int[] someArray = {10, 98, 12, 76, 34, 24, 74, 12, 89, 34, 12,};
        int [] copiedSortedArray = instertSorting(someArray);
        displayIntArray(someArray);
        displayIntArray(copiedSortedArray);

    }

    private static void displayIntArray(int[] displayedArray) {
        for (int value : displayedArray) {
            System.out.print(value + ", ");
        }
        System.out.println("");
    }
}
