package TimHorntonsUpdated;

import java.util.Objects;

public class Mug extends BaseMercendise implements Mercendise{
    String features= "Mug is amazing ";
    Double price = 4.99;

    @Override
    public String getFeatures() {
        return features;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mug mug = (Mug) o;
        return Objects.equals(features, mug.features) && Objects.equals(price, mug.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features, price);
    }

    @Override
    public String toString() {
        return "Mug{" +
                "features='" + features + '\'' +
                ", price=" + price +
                '}';
    }
}

