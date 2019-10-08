package figurasAct3;

import figurasAct3_3.Shape;

import java.awt.*;

public class Aplicacion {
        public static void main(String[] args) {
            //Feu una aplicació que crei un Rectangle. Feu una taula que mostri quins dels camps són visibles per al rectangle i quins no.
            Rectangle rectangle = new Rectangle (new Point(1,1),50.5,40.3);

            figurasAct3_3.Shape figuras [] = new figurasAct3_3.Shape[2];
            figuras[0]= new Circle (new Point(1, 4),5.6);
            figuras[1]= new Rectangle (new Point (0,4),4.5,3.6);

            for (Shape figura:figuras){
                System.out.println("Su área es "+figura.area());
                System.out.println("Su perímetro es "+figura.perimeter());
                System.out.println("Su posición es "+figura.getOrigin());
                System.out.println("Su color es :"+figura.getColor());
                System.out.println("");
            }
            System.out.println("Feu una aplicació que crei un Rectangle. Feu una taula que mostri quins dels camps són visibles per al rectangle i quins no");
            System.out.println("Visibles de la clase shape : altura, longitud base, nombre figura. \nNo visibles: color, point, ColorDef, numeroLados\n ");
            }
        }

