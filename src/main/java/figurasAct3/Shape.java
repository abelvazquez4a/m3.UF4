package figurasAct3;

import java.awt.*;

public abstract class Shape {

    private Color color;
    private Point origin;
    final static Color ColorDef = Color.white;

    //Declareu a Shape 4 camps públics: un de public, un de protected, un de private i un sense tipus.
    private int numeroLados;
    public String nombreFigura;
    protected int longitudBase;
    int altura;

    public abstract double area();

    public abstract double perimeter();

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
