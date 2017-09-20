package chapter3;


import static chapter3.Sorting.instertSorting;

public class Mode { //dominating value

    static public int[] calculateMode(int[] intsArray) {
        final int[] copiedSortedArray = instertSorting(intsArray);

        final int ARRAY_SIZE = copiedSortedArray.length;
        int mostFrequent = copiedSortedArray[0];
        int highestFrequency = 0;
        int currentFrequency = 0;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            currentFrequency++;
            // if (surveyData[i] IS THE LAST OCCUR OF VALUE)
            if (i == ARRAY_SIZE - 1 || copiedSortedArray[i] != copiedSortedArray[i + 1]) {
                if (currentFrequency > highestFrequency) {
                    highestFrequency = currentFrequency;
                    mostFrequent = copiedSortedArray[i];
                }
                currentFrequency = 0;
            }
        }
        int[] result = new int[2];
        result[0] = mostFrequent;
        result[1] = highestFrequency;
        return result;
    }

}
