package chapter3.exercise2;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.util.Arrays.copyOf;

public class Sale {
    private int[][] sales;

    public Sale(int agents, int months) {
        this.sales = new int[agents][months];
    }

    public int[][] getSales() {
        return sales;
    }

    public void setSales(int[][] sales) {
        this.sales = sales;
    }

    public double arrayAverage(int[] intArray, int months) {
        double sum = 0;
        for (int i = 0; i < months; i++) {
            sum += intArray[i];
        }
        double average = sum / months;
        return average;
    }

    public double highestAverageOfAgents(int[][] intArray, int agents, int months) {
        double highestAverage = arrayAverage(intArray[0], months);
        for (int agent = 1; agent < agents; agent++) {
            double agentAverage = arrayAverage(intArray[agent], months);
            if (agentAverage > highestAverage)
                highestAverage = agentAverage;
        }
        return highestAverage;
    }

    public double arrayMedian(int[] intArray, int months) {
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

    public double highestMedianOfAgents(int[][] intArray, int agents, int months) {
        double highestMedian = arrayMedian(intArray[0], months);
        for (int agent = 1; agent < agents; agent++) {
            double agentMedian = arrayMedian(intArray[agent], months);
            if (agentMedian > highestMedian)
                highestMedian = agentMedian;
        }
        return highestMedian;
    }
}