package chapter3.exercise2;

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
}