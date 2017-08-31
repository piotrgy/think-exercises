package Ex;

import java.util.Scanner;

import static Ex.LuhnNumbers.getCharToDigit;

/**
 * Created by piotrg on 2017-08-24.
 */
public class Decoding {

    public enum ModeType {
        UPPERCASE,
        LOWERCASE,
        PUNCTUATION
    }

    private static ModeType mode = ModeType.UPPERCASE;

    public static ModeType getMode() {
        return mode;
    }


    public static int decodeNumber(int number) {
            switch (mode) {
                case UPPERCASE :
                    number = number % 27;
                    System.out.println("Modulo 27: "+number);
                    if (number == 0) {
                        System.out.println("Changing to lowercase mode.");
                        mode = ModeType.LOWERCASE;
                    }
                    break;
                case LOWERCASE :
                    number = number % 27;
                    System.out.println("Modulo 27: "+number);
                    if (number == 0) {
                        System.out.println("Changing to punctuation mode.");
                        mode = ModeType.PUNCTUATION;
                    }
                    break;
                case PUNCTUATION :
                    number = number % 9;
                    System.out.println("Modulo 9: "+number);
                    if (number == 0) {
                        System.out.println("Changing to uppercase mode.");
                        mode = ModeType.UPPERCASE;
                    }
                    break;
            }
            return number;
    }

    public static int decodeTwoDigitNumber() {
        return getCharToDigit() * 10 + getCharToDigit();
    }

    public static int decodeDigitsToIntNumber(){
        int number = 0;
        final int END = 20; //letter k
        final int SEPARATOR = -1; //punctuation mark

        /*int digit = getCharToDigit();
        number = digit * 100;

        digit = getCharToDigit();
        number += digit * 10;
        if (digit != END) {
            return number = number * 10 + digit;
        }else return number;*/


        int digit = getCharToDigit();
        number = digit;

        digit = getCharToDigit();
        while (digit != END) {
            number = number * 10 + digit;
            digit = getCharToDigit();
        }
        return number;

    }

    public static int getStringOfDigits() {
        int number;
        final int SEPARATOR = -1; //punctuation mark

        int digit = getCharToDigit();
            number = digit;

            digit = getCharToDigit();
            while (digit != SEPARATOR) {
                number = number * 10 + digit;
                digit = getCharToDigit();
            }
            System.out.print("Entered number: "+ number);
        return number;

    }


    public static char decodeLetter(int number, char theCase) {//range 1 to 26 , case A or a
        return (char)(number + theCase - 1);
    }

    public static char decodePunctuationMark() {//range 1 to 8
        Scanner s = new Scanner(System.in);
        int myInt = s.nextInt();
        char out;
        switch (myInt) {
            case 1 : out = '!'; break;
            case 2 : out = '?'; break;
            case 3 : out = ','; break;
            case 4 : out = '.'; break;
            case 5 : out = ' '; break;
            case 6 : out = ';'; break;
            case 7 : out = '"'; break;
            case 8 : out = '\''; break;
            default: out = '*';
        }
        return out;
    }
}
