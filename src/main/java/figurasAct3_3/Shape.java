package figurasAct3_3;

import java.awt.*;

public class Shape {

    private Color color;
    private Point origin;
    final static Color ColorDef = Color.white;

    //Declareu a Shape 4 camps públics: un de public, un de protected, un de private i un sense tipus.
    private int numeroLados;
    public String nombreFigura;
    protected int longitudBase;
    int altura;

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
