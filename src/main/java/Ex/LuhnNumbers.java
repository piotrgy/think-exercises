package Ex;

import java.util.Scanner;

public class LuhnNumbers {

    public static int getCharToDigit() {

        Scanner s = new Scanner(System.in);
        char x = s.next().charAt(0);
        return Character.getNumericValue(x);
    }

    public static int sumDoubleDigit(int digit) {
        int doubledDigit = digit * 2;
        int sum;
        if (doubledDigit >= 10) {
            sum = (1 + (doubledDigit % 10));
        } else sum = doubledDigit;
        return sum;
    }

    public static boolean isValidSixDigitNumber() {
        int checksum = 0;

        for (int position = 1; position <= 6; position++) {
            if (position % 2 == 0) {
                checksum += getCharToDigit();
            } else {
                checksum += sumDoubleDigit(getCharToDigit());
            }
        }
        return checksum % 10 == 0;

    }
    public static boolean isValidEvenDigitNumber(){
        int checksum = 0;
        int position = 1;
        final int END = 20; //litera k

        int digit = getCharToDigit();

        while(digit != END) {
            if (position % 2 == 0) {
                checksum += digit;
            } else {
                checksum += sumDoubleDigit(digit);
            }
            position++;
            digit = getCharToDigit();
        }

        return (checksum > 0)&& (checksum % 10 == 0);
    }

    public static boolean isValidNumber(){
        int oddLengthChecksum = 0;
        int evenLengthChecksum = 0;
        int position = 1;
        final int END = 20; //litera k

        int digit = getCharToDigit();

        while(digit != END) {
            if (position % 2 == 0) {
                oddLengthChecksum += sumDoubleDigit(digit);
                evenLengthChecksum += digit;
            } else {
                oddLengthChecksum += digit;
                evenLengthChecksum += sumDoubleDigit(digit);
            }
            position++;
            digit = getCharToDigit();
        }
        int checksum;
        if ((position - 1) % 2 == 0) {
            checksum = evenLengthChecksum;
        } else {
            checksum = oddLengthChecksum;
        }
        return (checksum > 0)&& (checksum % 10 == 0);
    }
}
