package Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{

    static final double COFFEE_MILLILITERS = 50;
    static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    double caffeine;

    public Coffee(String name) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
