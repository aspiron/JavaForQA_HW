package HW18112022.cooking.ingridients;

import HW18112022.cooking.Ingredient;
import HW18112022.cooking.interfaces.FreshlyPreparable;

public class Sauce extends Ingredient implements FreshlyPreparable {
    @Override
    public double calculateQuantityFor100Gram() {
        System.out.print(getClass().getSimpleName() + ", grams when ready: ");
        return super.getQuantity() * keepFresh();
    }

    @Override
    public double keepFresh() {
        return 1.0;
    }
}
