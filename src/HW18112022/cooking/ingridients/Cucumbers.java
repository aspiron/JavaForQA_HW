package HW18112022.cooking.ingridients;

import HW18112022.cooking.Ingredient;
import HW18112022.cooking.interfaces.Marinateable;

public class Cucumbers extends Ingredient implements Marinateable {
    @Override
    public double calculateQuantityFor100Gram() {
        System.out.print(getClass().getSimpleName() + ", grams when ready: ");
        return super.getQuantity() * marinate();
    }

    @Override
    public double marinate() {
        return 0.90;
    }
}
