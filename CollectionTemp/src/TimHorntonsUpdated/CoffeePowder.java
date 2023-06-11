package TimHorntonsUpdated;

import java.util.Objects;

public class CoffeePowder extends BaseMercendise implements Mercendise{
    String features= "Jordar Coffee, ek var pivo, pita rai jav";
    Double price = 1.79;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeePowder that = (CoffeePowder) o;
        return Objects.equals(features, that.features) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features, price);
    }

    @Override
    public String getFeatures() {
        return features;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "features='" + features + '\'' +
                ", price=" + price ;
    }
}
