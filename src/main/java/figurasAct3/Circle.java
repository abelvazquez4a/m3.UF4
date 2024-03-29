package figurasAct3;

import figurasAct3_3.Shape;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Point origin, double rad) {
        super(origin);
        this.radius = rad;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area (){
        double radio=this.radius;
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double perimeter (){
        double radio=this.radius;
        return 2*Math.PI*radio;
    }
}
