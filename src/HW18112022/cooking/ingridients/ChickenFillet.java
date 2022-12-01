package HW18112022.cooking.ingridients;

import HW18112022.cooking.Ingredient;
import HW18112022.cooking.interfaces.Frieable;

public class ChickenFillet extends Ingredient implements Frieable {
    @Override
    public double calculateQuantityFor100Gram() {

        System.out.print(getClass().getSimpleName() + ", grams when ready: ");
        return super.getQuantity() * fry();
    }

    @Override
    public double fry() {
return 0.65;
    }
}
