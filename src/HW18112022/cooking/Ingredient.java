package HW18112022.cooking;

public abstract class Ingredient {
    private double quantity;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {

        this.quantity = quantity;

    }

    public abstract double calculateQuantityFor100Gram();
}




