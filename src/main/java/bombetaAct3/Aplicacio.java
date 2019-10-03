package bombetaAct3;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Aplicacio {


    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        Bombilla bombilla1 = new Bombilla(1);
        Bombilla bombilla2 = new Bombilla (5);
        Bombilla bombilla3 = new Bombilla (6);
        Bombilla bombilla4 = new Bombilla (0);

        int opcion=generarMenu();
        cambiarValores(bombilla,opcion);
        System.out.println("\nNumero de bombillas: "+Bombilla.getNumeroBombillas());
        System.out.println("\nNumero de bombillas encendidas: "+Bombilla.getNumeroEncendidas());
        System.out.println("\nNumero de bombillas fundidas: "+Bombilla.getNumeroFundidas());
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
    public static void cambiarValores(Bombilla bombilla, int opcion){
        Scanner entrada=new Scanner(System.in);
        if (opcion==1){
            System.out.println("Selecciona bombilla a aumentar intensidad en 1");
            for (int i = 1; i < 4; i++) {
                bombillaNum.comprobarEncendidas();
                bombilla[i].comprobarFundidas();
                System.out.println("Opcion "+i+" "+bombilla[i]);
            }
            int eleccion=entrada.nextInt();
            bombilla[eleccion].aumentarIntensidad();
            bombilla[eleccion].comprobarEncendidas();
            bombilla[eleccion].comprobarFundidas();
            System.out.println("Nuevos valores: "+bombilla[eleccion]);
        }
        else {
            System.out.println("Selecciona bombilla a reducir intensidad en 1");
            for (int i = 0; i < bombilla.length; i++) {
                bombilla[i].comprobarEncendidas();
                bombilla[i].comprobarFundidas();
                System.out.println("Opcion "+i+" "+bombilla[i]);
            }
            int eleccion=entrada.nextInt();
            bombilla[eleccion].reducirIntensidad();
            bombilla[eleccion].comprobarEncendidas();
            bombilla[eleccion].comprobarFundidas();
            System.out.println("Nuevos valores: "+bombilla[eleccion]);
        }
    }
}
