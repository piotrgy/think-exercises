package chapter3;


public class Sorting {
    public static int[] instertSorting(int[] intsArray) {
        int[] outputArray = Sorting.copyArray(intsArray);
        final int ARRAY_SIZE = outputArray.length;

        int start = 0;
        int end = ARRAY_SIZE - 1;

        for (int i = start + 1; i <= end; i++) {
            for (int j = i; j > start && outputArray[j - 1] > outputArray[j]; j--) {
                int temp = outputArray[j - 1];
                outputArray[j - 1] = outputArray[j];
                outputArray[j] = temp;
            }
        }
        return outputArray;
    }

    public static int[] copyArray(int[] sourceIntegerArray) {
        int arrayLength = sourceIntegerArray.length;
        int[] copiedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            copiedArray[i] = sourceIntegerArray[i];
        }
        return copiedArray;
    }
}
