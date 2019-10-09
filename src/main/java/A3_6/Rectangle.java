package A3_6;

import java.awt.*;

public class Rectangle extends Shape {
    private double height;
    private double width;

    @Override
    public double area (){
        double height = this.height;
        double width = this.width;
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public double perimeter(){
        double height = this.height;
        double width = this.width;
        return 2*(height+width);
    }

    public double getHeight() {
        return height;
    }


    public double getWidth() {
        return width;
    }

    public void setHW(double height, double widht) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(Point org, double height, double width) {
        super (org);
        this.height = height;
        this.width = width;
    }
    public void queSoc(){
        if (this instanceof Rectangle) System.out.println("Soy un rectangulo.");
    }
}
