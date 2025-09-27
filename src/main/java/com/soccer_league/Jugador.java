package com.soccer_league;

import com.soccer_league.interfaces.IImprimible;
import com.soccer_league.interfaces.IJugador;
import com.soccer_league.interfaces.ITieneNombre;

public class Jugador
    implements ITieneNombre, 
               IJugador,
               IImprimible {
    
    private String name;
    private int numero;
    private String posicion;

    public Jugador(String name, int numero){
        setName(name);
        setNumero(numero);
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    public int getNumero(){
        return numero;
    }

    private void setNumero(int value){
        this.numero = value;
    }

  
    public String getPosicion() {
        return this.posicion;
    }


    public void setPosicion(String value) {
       this.posicion = value;
    }

    @Override
    public String toString(){
      return String.format("[%s] %s (%s)", 
                    getNumero(),
                    getName(),
                    getPosicion());
    }

    public String impresion(){
        return String.format("[Jugador %s] %s > %s", 
                    getNumero(),
                    getName(),
                    getPosicion());
    }
    

}
