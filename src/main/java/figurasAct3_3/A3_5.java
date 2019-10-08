package figurasAct3_3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A3_5 {
    public static void main(String[] args) {
        Circle arrayCirculos [] = new Circle [4];
        arrayCirculos[0]=new Circle(new Point(0,0),2);
        arrayCirculos[1]=new Circle(new Point(1,0),1);
        arrayCirculos[2]=new Circle(new Point(1,1),4);
        arrayCirculos[3]=new Circle(new Point(1,2),4);

        if (arrayCirculos[0].compareTo(arrayCirculos[1])<0) System.out.println("el circulo es menor");
        else if (arrayCirculos[0].compareTo(arrayCirculos[1])>0) System.out.println("el circulo es mayor");
        else System.out.println("los circulos son iguales");


        System.out.println("ANTES DE ORDENAR");
        for (int i = 0; i < arrayCirculos.length ; i++) {
            System.out.println(arrayCirculos[i]);
        }
        System.out.println("\nDESPUÉS DE ORDENAR");
        Arrays.sort(arrayCirculos);

        for (int i = 0; i < arrayCirculos.length ; i++) {
            System.out.println(arrayCirculos[i]);
        }


    }
}
