package A3_6;

import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.Arrays;

public class A3_6 {
    public static void main(String[] args) {
        Shape listaFiguras [] = new Shape [10];

        for (int i = 0; i < listaFiguras.length ; i++) {
            listaFiguras[i]=figuraRandom();
            if (listaFiguras[i] instanceof Circle) {
                Circle circulo = (Circle) listaFiguras[i];
                circulo.queSoc();
            }
            else {
                Rectangle rectangulo = (Rectangle) listaFiguras[i];
                rectangulo.queSoc();
            }
        }
    }

    public static Shape figuraRandom(){
        Shape objeto;
        int numeroRandom=((int)(Math.random()*2));
        if (numeroRandom==1) return objeto = new Circle (new Point((int)(Math.random()*100+1),(int)(Math.random()*100+1)),(int)(Math.random()*100+1));
        else return objeto= new Rectangle(new Point((int)(Math.random()*100+1),(int)(Math.random()*100+1)),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
    }
}
