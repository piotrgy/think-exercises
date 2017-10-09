package chapter3.exercise2;

public class Ex2 {
    public static void main(String[] args) {
        Sale saleInCompany = new Sale();

        final int MONTHS = 12;
        double averageOfAgent = saleInCompany.arrayAverage(saleInCompany.getSales()[0], MONTHS);
        System.out.println("The average sale of first agent: " + averageOfAgent);
    }
}