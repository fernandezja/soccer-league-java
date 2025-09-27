package com.soccer_league;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.soccer_league.interfaces.ITieneNombre;

public class Torneo
    implements ITieneNombre {
    
    private String name;    
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Torneo(String name){
        setName(name);
        equipos = new ArrayList<Equipo>();        
        partidos = new ArrayList<Partido>();
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    public void agregar(Equipo equipo){
       this.equipos.add(equipo);
    }

     public void agregar(Partido equipo){
       this.partidos.add(equipo);
    }

    public int equiposCantidad(){
        return this.equipos.size();
    }

    public int partidosCantidad(){
        return this.partidos.size();
    }
}
