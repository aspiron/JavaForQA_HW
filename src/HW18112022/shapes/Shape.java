package HW18112022.shapes;

public class Shape {
private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("I am a " + getName());
    }

}
