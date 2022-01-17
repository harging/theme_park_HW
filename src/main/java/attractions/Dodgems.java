package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice = 4.50;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return defaultPrice / 2;
        }
        else {
            return defaultPrice;
        }
    }
}
