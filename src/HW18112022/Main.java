package HW18112022;
import HW18112022.cooking.Dish;
import HW18112022.shapes.*;

/*
1. Создать иерархию классов геометрических фигур
Должны быть следующие классы
Figure, Square, Circle, Triangle, Rectangle
(Фигура, квадрат, круг, треугольник, прямоугольник)

У каждой фигуры должен быть метод public void show(), который распечатывает сообщение,
какая именно фигура, например, "I'm a square!"

Создать каждую фигуру и вызвать метод.

2. Создать абстрактный класс Ingredient с полем quantity, геттером, сеттером, абстрактным методом
long calculateQuantityFor100Gramm() (сколько грамм сырого продукта нужно, чтобы получить 100 грамм
после приготовления) ``.
Создать подклассы конкретных ингредиентов (не менее трёх), например, Noodle, Pork, Mushroom.
В реализации абстрактного метода выводить на печать имя ингредиента

Задание со звёздочкой * - Добавить в иерархию интерфейсы Boilable, Frieable, Stewable, имеющие один
метод приготовления (boil, fry, stew).
----------------------------------------
Заменить сеттер на методы увеличения\уменьшения quantity

Задание с двумя звёздочками ** - добавить в иерархию интерфейс Cookable
 */

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Triangle("triangle");
        sh1.show();
        Shape sh2 = new Square("square");
        sh2.show();
        Shape sh3 = new Rectangle("rectangle");
        sh3.show();
        Shape sh4 = new Circle("circle");
        sh4.show();

        System.out.println("----------------------------------");

    Dish shaverma = new Dish();
    shaverma.flowSheetForShaverma();


    }
}
