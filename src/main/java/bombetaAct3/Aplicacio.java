package bombetaAct3;

import java.util.Scanner;

public class Aplicacio {


    public static void main(String[] args) {

        Scanner entrada=new Scanner (System.in);
        Bombilla bombilla1 = new Bombilla(1);
        Bombilla bombilla2 = new Bombilla (5);
        Bombilla bombilla3 = new Bombilla (6);
        Bombilla bombilla4 = new Bombilla (0);
        boolean continuar=true;
        do {
            bombilla1.comprobarEncendidas();
            bombilla2.comprobarEncendidas();
            bombilla3.comprobarEncendidas();
            bombilla4.comprobarEncendidas();
            bombilla1.comprobarFundidas();
            bombilla2.comprobarFundidas();
            bombilla3.comprobarFundidas();
            bombilla4.comprobarFundidas();

            int opcion = generarMenu();

            System.out.println("bombilla 1 :" + bombilla1);
            System.out.println("bombilla 2 :" + bombilla2);
            System.out.println("bombilla 3 :" + bombilla3);
            System.out.println("bombilla 4 :" + bombilla4);

            System.out.println("\nSelecciona bombilla a manipular.");
            int eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    cambiarValores(bombilla1, opcion,eleccion);
                    break;
                case 2:
                    cambiarValores(bombilla2, opcion,eleccion);
                    break;
                case 3:
                    cambiarValores(bombilla3, opcion,eleccion);
                    break;
                case 4:
                    cambiarValores(bombilla4, opcion,eleccion);
            }
            System.out.println("\n");
            System.out.println("bombilla 1 :" + bombilla1);
            System.out.println("bombilla 2 :" + bombilla2);
            System.out.println("bombilla 3 :" + bombilla3);
            System.out.println("bombilla 4 :" + bombilla4);
            System.out.println("\nNumero de bombillas: " + Bombilla.getNumeroBombillas());
            System.out.println("\nNumero de bombillas encendidas: " + Bombilla.getNumeroEncendidas());
            System.out.println("\nBombillas fundidas: ");
            System.out.println("Numero de bombillas fundidas: " + Bombilla.getNumeroFundidas());
            System.out.println("\n¿Quieres continuar? true/false\n");
            continuar=entrada.nextBoolean();
        }while(continuar);
    }

    public static int generarMenu() {
        Scanner entrada = new Scanner(System.in);
        boolean var1 = false;

        int opcion;
        do {
            System.out.println("BIENVENIDO AL MANIPULADOR DE BOMBILLAS, ESCOJE UNA OPCIÓN\n 1------SUBIR INTENSIDAD\n 2------BAJAR INTENSIDAD");
            opcion = entrada.nextInt();
        } while(opcion != 1 && opcion != 2);

        return opcion;
    }


    public static void cambiarValores(Bombilla bombilla, int opcion, int seleccion){
        Scanner entrada=new Scanner(System.in);
        if (opcion==1){
            bombilla.aumentarIntensidad();
            bombilla.comprobarEncendidas();
            bombilla.comprobarFundidas();
            System.out.println("\nModificados valores de bombilla: "+seleccion);
        }
        else {
            bombilla.reducirIntensidad();
            bombilla.comprobarEncendidas();
            bombilla.comprobarFundidas();
            System.out.println("\nModificados valores de bombilla: "+seleccion);
        }
    }
}
