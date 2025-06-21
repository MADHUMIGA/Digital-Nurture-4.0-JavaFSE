package digital.nurture;

public class FinancialForecasting {

    // Recursive method
    public static double forecastValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;  // base case
        }
        return forecastValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000.0;   // ₹1000
        double growthRate = 0.08;        // 8% annual growth
        int years = 5;

        double futureValue = forecastValue(initialAmount, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
