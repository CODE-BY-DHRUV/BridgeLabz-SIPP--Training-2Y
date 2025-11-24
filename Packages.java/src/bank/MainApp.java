package bank;

import static java.lang.Math.*;
import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();

        System.out.println(ic.calculateSimpleInterest(1000, 5, 2));
        System.out.println(ic.calculateCompoundInterest(1000, 5, 2));
    }
}
