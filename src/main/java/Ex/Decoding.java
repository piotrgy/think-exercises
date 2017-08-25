package Ex;

import java.util.Scanner;

import static Ex.LuhnNumbers.getCharToDigit;

/**
 * Created by piotrg on 2017-08-24.
 */
public class Decoding {
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

    public static void getStringOfDigits() {
        int number;
        final int END = 20; //letter k
        final int SEPARATOR = -1; //punctuation mark

        int digit;
        do {
            digit = getCharToDigit();
            number = digit;

            digit = getCharToDigit();
            while (digit != END && digit != SEPARATOR) {
                number = number * 10 + digit;
                digit = getCharToDigit();
            }
            System.out.print("Entered number: "+ number);
        }while (digit != END);

    }

    public static char decodeBigLetter() {//range 1 to 26
        Scanner s = new Scanner(System.in);
        int myInt = s.nextInt();
        return (char)(myInt + 'A' - 1);
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
