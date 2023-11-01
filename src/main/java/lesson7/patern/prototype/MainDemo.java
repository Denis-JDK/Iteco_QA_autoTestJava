package lesson7.patern.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCope = new ArrayList<>();

        Circle circle = new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius = 15;
        circle.color = "blue";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width=10;
        rectangle.height=20;
        rectangle.color="green";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCope);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape>shapesCopy){
        for (Shape shape: shapes){
            shapesCopy.add(shape.clone());
        }

        //реализация проверки клонирования
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + "Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i+ "And they are identical (yay!)");
                }else {
                    System.out.println(i+ "But they are not identical (0000!)");
                }
            }else {
                System.out.println(i+ "Shape objects are toe same (0000!)");
            }

        }
    }
}
