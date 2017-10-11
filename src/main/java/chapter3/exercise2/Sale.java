package chapter3.exercise2;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.util.Arrays.copyOf;

public class Sale {
    private int[][] sales;

    public int[][] getSales() {
        return sales;
    }

    public void setSales(int[][] sales) {
        this.sales = sales;
    }

    public double arrayAverage(int[] intArray) {
        int arraySize = intArray.length;
        double sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum += intArray[i];
        }
        double average = sum / arraySize;
        return average;
    }

    public double highestAverageOfAgents(int[][] intArray) {
        double highestAverage = arrayAverage(intArray[0]);
        for (int agent = 1; agent < intArray.length; agent++) {
            double agentAverage = arrayAverage(intArray[agent]);
            if (agentAverage > highestAverage)
                highestAverage = agentAverage;
        }
        return highestAverage;
    }

    public double arrayMedian(int[] intArray) {
        int arraySize = intArray.length;
        int[] tempArray = copyOf(intArray, arraySize);
        Arrays.sort(tempArray);

        double median;
        if (arraySize % 2 == 0) {
            median = (tempArray[(arraySize / 2) - 1] + tempArray[arraySize / 2]) / 2;
            return median;
        }

        median = tempArray[round(arraySize / 2)];
        return median;
    }

    public double highestMedianOfAgents(int[][] intArray) {
        double highestMedian = arrayMedian(intArray[0]);
        for (int agent = 1; agent < intArray.length; agent++) {
            double agentMedian = arrayMedian(intArray[agent]);
            if (agentMedian > highestMedian)
                highestMedian = agentMedian;
        }
        return highestMedian;
    }
}