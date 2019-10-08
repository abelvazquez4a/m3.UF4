package figurasAct3_3;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        Shape shape;
        shape = new Shape();
        System.out.println(shape instanceof Shape);
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Object);
        Shape shape2;
        shape2 = new Circle (new Point(0,0),1);
        System.out.println(shape2 instanceof Shape);
        System.out.println(shape2 instanceof Circle);
        System.out.println(shape2 instanceof Object);
        Circle shape2Cast = (Circle)shape2;
        shape2Cast.setDoubleRadius();
        Shape shape3;
        shape3 = new Rectangle(new Point(1,0),50.0,40.0);

    }

}
