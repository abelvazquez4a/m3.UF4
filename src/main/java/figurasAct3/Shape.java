package figurasAct3;

import java.awt.*;

public class Shape {

    private Color color;
    private Point origin;
    final static Color ColorDef = Color.white;

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    protected Shape(Color color, Point origin) {
        this.color = color;
        this.origin = origin;
    }

    protected Shape(Point origin) {
        this.color = ColorDef;
        this.origin=origin;
    }

    protected Shape() {
    }
}
