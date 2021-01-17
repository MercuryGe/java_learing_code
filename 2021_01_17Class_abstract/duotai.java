package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-17
 * Time: 9:24
 */
class Shape {
    public void draw() {

    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class TestDemo1 {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rect(), new Circle(),
                new Rect(), new Flower(),new Triangle()};
        //Shape shape1 = new Circle();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }


    public static void main2(String[] args) {
        Rect rect = new Rect();
        Circle cycle = new Circle();
        Flower flower = new Flower();

        String[] shapes = {"cycle", "rect", "cycle", "rect", "flower"};

        for (String s :shapes) {
            if(s.equals("cycle")) {
                cycle.draw();
            }else if(s.equals("rect")) {
                rect.draw();
            }else if (s.equals("flower")) {
                flower.draw();
            }
        }
    }

    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main1(String[] args) {
        Rect rect = new Rect();
        drawMap(rect);
        Circle circle = new Circle();
        drawMap(circle);
        Flower flower = new Flower();
        drawMap(flower);
    }
}
