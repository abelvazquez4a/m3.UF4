package bombetaAct3;

import java.util.Scanner;

public class Bombilla {
    private int intensidad;
    private boolean funciona;
    private boolean estaEncendida;
    private int id;
    private static int numeroBombillas;
    private static int numeroEncendidas;
    private static int numeroFundidas;

    public Bombilla(int intensidad) {
        id++;
        this.intensidad = intensidad;
        numeroBombillas++;
    }

    public static int getNumeroEncendidas() {
        return numeroEncendidas;
    }

    public static int getNumeroFundidas() {
        return numeroFundidas;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    public static int getNumeroBombillas() {
        return numeroBombillas;
    }


    @Override
    public String toString() {
        return "Bombilla{" +
                "intensidad=" + intensidad +
                ", funciona=" + funciona +
                ", estaEncendida=" + estaEncendida +
                ", id=" + id +
                '}';
    }

    public void comprobarFundidas (){
        if (intensidad>5){
            numeroFundidas++;
            setFunciona(false);
        }
        else setFunciona(true);
    }
    public void comprobarEncendidas(){
        if (intensidad>0&&intensidad<=5){
            numeroEncendidas++;
            setEstaEncendida(true);
        }
        else {
            setEstaEncendida(false);
        }
    }
    public void aumentarIntensidad(){
        intensidad++;
    }
    public void reducirIntensidad(){
        intensidad--;
    }
}
