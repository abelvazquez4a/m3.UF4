package bombetaAct3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bombilla {
    private int intensidad;
    private boolean funciona;
    private boolean estaEncendida;
    private static int aumentarId=0;
    private int id;
    private static int numeroBombillas;
    private static ArrayList<Bombilla> listaEncendidas = new ArrayList<Bombilla>();
    private static ArrayList<Bombilla> listaFundidas = new ArrayList<Bombilla>();

    public Bombilla(int intensidad) {
        this.intensidad = intensidad;
        numeroBombillas++;
        aumentarId++;
        id=aumentarId;
    }

    public static int getNumeroEncendidas() {
        return listaEncendidas.size();
    }

    public static int getNumeroFundidas() {
        for (int i = 0; i < listaFundidas.size(); i++) {
            System.out.println("Bombilla con identificador: "+listaFundidas.get(i).id+" | "+listaFundidas.get(i));
        }
        return listaFundidas.size();
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
            setFunciona(false);
            if (!listaFundidas.contains(this)){
                listaFundidas.add(this);
            }
        }
        else {
            if (!listaFundidas.contains(this)){
                setFunciona(true);
            }
        }
    }
    public void comprobarEncendidas(){
        if (intensidad>0&&intensidad<=5&&!listaFundidas.contains(this)){
            setEstaEncendida(true);
            if (!listaEncendidas.contains(this)){
                listaEncendidas.add(this);
            }
        }
        else {
            setEstaEncendida(false);
            if (listaEncendidas.contains(this)){
                listaEncendidas.remove(this);
            }
        }
    }
    public void aumentarIntensidad(){
        intensidad++;
    }
    public void reducirIntensidad(){
        if ((intensidad)-1>=0){
            intensidad--;
        }
        else {
            System.out.println("\nNo se puede bajar la intensidad por debajo de 0");
        }
    }

}
