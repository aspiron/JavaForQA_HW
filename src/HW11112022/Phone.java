package HW11112022;

public class Phone {
    private String model;
    private double weight;
    private String number;

    public Phone(String model, double weight, String number) {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        System.out.println(number);
        return null;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(Person person){
        System.out.println("Calling " + person.getFullName());
    }
}
