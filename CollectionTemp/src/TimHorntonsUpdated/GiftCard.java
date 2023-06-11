package TimHorntonsUpdated;

import java.util.Objects;

public class GiftCard extends BaseMercendise implements Mercendise{
    String features= "Nice gift card";
    Double price = 25.0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCard giftCard = (GiftCard) o;
        return Objects.equals(features, giftCard.features) && Objects.equals(price, giftCard.price);
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
        return "GiftCard{" +
                "features='" + features + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }
}
