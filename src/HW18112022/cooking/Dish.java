package HW18112022.cooking;

import HW18112022.cooking.ingridients.*;
import HW18112022.cooking.interfaces.Cookable;

public class Dish implements Cookable {
    @Override
    public void flowSheetForShaverma() {
        Ingredient cabbage = new Cabbage();
        Ingredient chicken = new ChickenFillet();
        Ingredient cucumbers = new Cucumbers();
        Ingredient lavash = new Lavash();
        Ingredient potato = new Potato();
        Ingredient sauce = new Sauce();

        cabbage.setQuantity(100);
        chicken.setQuantity(100);
        cucumbers.setQuantity(100);
        lavash.setQuantity(100);
        potato.setQuantity(100);
        sauce.setQuantity(100);

        System.out.println(cabbage.calculateQuantityFor100Gram());
        System.out.println(chicken.calculateQuantityFor100Gram());
        System.out.println(cucumbers.calculateQuantityFor100Gram());
        System.out.println(lavash.calculateQuantityFor100Gram());
        System.out.println(potato.calculateQuantityFor100Gram());
        System.out.println(sauce.calculateQuantityFor100Gram());

    }
}
