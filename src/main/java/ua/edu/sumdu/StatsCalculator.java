package ua.edu.sumdu;

public class StatsCalculator {
    private static StatsCalculator instance;

    private static double meanAge;
    private static int maxAge;
    private static int minAge;
    private static String popularMail;

    private StatsCalculator (){

    }

    public static StatsCalculator getInstance() {
        if (instance == null) {instance = new StatsCalculator();
        }
        return instance;
    }

    public double getMeanAge() {
        return meanAge;
    }

    public void setMeanAge(double meanAge) {
        StatsCalculator.meanAge = meanAge;
    }

    public void setPopularMail(String popularMail) {
        StatsCalculator.popularMail = popularMail;
    }
}
