package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    private double defaultPrice = 8.40;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return defaultPrice * 2;
        }
        else {
            return defaultPrice;
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        else {
            return false;
        }
    }
}
