package figurasAct3_3;

import java.awt.*;

public class Circle extends Shape implements Comparable<Circle> {
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

    public void setDoubleRadius(){
        this.radius=this.radius*2;
    }

    @Override
    public double area (){
        double radio=this.radius;
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " origin=" + super.getOrigin()+
                '}';
    }

    @Override
    public double perimeter (){
        double radio=this.radius;
        return 2*Math.PI*radio;
    }


    @Override
    public int compareTo(Circle circle) {
        int resultado=0;
        if (this.radius>circle.getRadius()) resultado=1;
        else if (this.radius<circle.getRadius()) resultado=-1;
        else {
            if(this.getOrigin().getX()<circle.getOrigin().getX()) resultado=1;
            else if (this.getOrigin().getX()>circle.getOrigin().getX()) resultado=1;
            else if (this.getOrigin().getX()<circle.getOrigin().getX()) resultado=-1;
            else if (this.getOrigin().getY()>circle.getOrigin().getY()) resultado=1;
            else if (this.getOrigin().getY()<circle.getOrigin().getY()) resultado=-1;
            else resultado=0;
        }
        return resultado;
    }
}
