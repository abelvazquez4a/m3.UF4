package figurasAct3;

import java.awt.*;

public class Aplicacion {
        public static void main(String[] args) {
            Shape figuras [] = new Shape [2];
            figuras[0]= new Circle (new Point(1, 4),5.6);
            figuras[1]= new Rectangle (new Point (0,4),4.5,3.6);

            for (Shape figura:figuras){
                System.out.println("Su área es "+figura.area());
                System.out.println("Su perímetro es "+figura.perimeter());
                System.out.println("Su posición es "+figura.getOrigin());
                System.out.println("Su color es :"+figura.getColor());
                System.out.println("");
            }
            }
        }

