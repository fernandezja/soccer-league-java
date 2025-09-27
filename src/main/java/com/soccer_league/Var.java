package com.soccer_league;

import java.util.ArrayList;

import com.soccer_league.interfaces.IJugador;


public class Var
{  
    private Partido partido;

    public Var(Partido partido){
        setPartido(partido);
    }

    
    public Partido getPartido(){
        return this.partido;
    }

    private void setPartido(Partido value){
        this.partido = value;
    }

    
    public int cantidadTarjetasAmarillas(){
        return cantidadTarjetas("AMARILLA").length;
    }

    public int cantidadTarjetasRojas(){
        return cantidadTarjetas("ROJA").length;
    }

    //Obtener las tarjetas de un equipo
    public int cantidadTarjetas(Equipo equipo){
        return (int) getPartido().getTarjetas().stream()
            .filter(t -> equipo.pertenece(t.getJugador()))
            .count();
    }

    private Object[] cantidadTarjetas(String color){
        return getPartido().getTarjetas().stream()
            .filter(t -> t.getColor().equals(color))
            .toArray();
    }
}
