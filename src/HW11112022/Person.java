package HW11112022;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(Person person) {
        System.out.println(person + " can move. He is walking somewhere now.");
    }

    public void talk(Person person) {
        System.out.println(person + " can talk. He is talking now.");
    }

}
