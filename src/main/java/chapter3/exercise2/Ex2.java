package chapter3.exercise2;

public class Ex2 {
    public static void main(String[] args) {
        final int NUM_AGENTS = 3;
        final int NUM_MONTHS = 12;

        Sale saleInCompany = new Sale(NUM_AGENTS, NUM_MONTHS);

        int[][] sales = new int[][]{{1856, 498, 30924, 87478, 328, 2653, 387, 3754, 387587, 2873, 276, 32},
                {5865, 5456, 3983, 6464, 9957, 4785, 3875, 3838, 4959, 1122, 7766, 2534},
                {23, 55, 67, 99, 265, 376, 232, 223, 4546, 564, 4544, 3434}};

        saleInCompany.setSales(sales);

        for (int agents = 0; agents < NUM_AGENTS; agents++) {
            double averageOfAgent = saleInCompany.arrayAverage(saleInCompany.getSales()[agents]);
            System.out.println("The average sale of " + (agents + 1) + " agent: " + averageOfAgent);
        }

        double highestAverage = saleInCompany.highestAverageOfAgents(saleInCompany.getSales());
        System.out.println("The highest average of " + NUM_AGENTS + " agents is: " + highestAverage);

        for (int agents = 0; agents < NUM_AGENTS; agents++) {
            double medianOfAgent = saleInCompany.arrayMedian(saleInCompany.getSales()[agents], NUM_MONTHS);
            System.out.println("The median sale of " + (agents + 1) + " agent: " + medianOfAgent);
        }

        double highestMedian = saleInCompany.highestMedianOfAgents(saleInCompany.getSales(), NUM_AGENTS, NUM_MONTHS);
        System.out.println("The highest median of " + NUM_AGENTS + " agents is: " + highestMedian);
    }
}