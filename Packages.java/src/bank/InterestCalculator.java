package bank;
import java.util.*;


public class InterestCalculator {
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public double calculateCompoundInterest(double P, double R, double T) {
        return P * (Math.pow((1 + R/100), T)) - P;
    }
}

