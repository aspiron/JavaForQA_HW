package HW11112022;

public class Main {
    public static void main(String[] args) {

        Person james = new Person();
        james.setFullName("James");
        james.setAge(30);

        Person jack = new Person("Jack", 25);
        Person emma = new Person("Emma", 19);

        Phone firstPhone = new Phone("Samsung", 300.14, "+79781234567");
        Phone secondPhone = new Phone("Siemens", 350.9, "+79787654321");
        Phone thirdPhone = new Phone("Motorola", 157.52, "+79789789789");
        System.out.println(firstPhone.getModel() + ", weight: " + firstPhone.getWeight() + ", number: " + firstPhone.getNumber());
        System.out.println(secondPhone.getModel() + ", weight: " + secondPhone.getWeight() + ", number: " + secondPhone.getNumber());
        System.out.println(thirdPhone.getModel() + ", weight: " + thirdPhone.getWeight() + ", number: " + thirdPhone.getNumber());

        System.out.println("-------------------------------------");

        firstPhone.receiveCall(james);
        firstPhone.getNumber();
        secondPhone.receiveCall(jack);
        secondPhone.getNumber();
        thirdPhone.receiveCall(emma);
        thirdPhone.getNumber();

    }
}
