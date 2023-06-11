package TimHorntonsUpdated;

import java.util.Objects;

public class HockeyCard extends BaseMercendise implements Mercendise{
    String features= "Nice hockey card";
    Double price = 10.0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HockeyCard that = (HockeyCard) o;
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
    public String toString() {
        return "HockeyCard{" +
                "features='" + features + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }

}
