package com.soccer_league;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.soccer_league.interfaces.IImprimible;
import com.soccer_league.interfaces.IJugador;
import com.soccer_league.interfaces.ITieneNombre;

public class Equipo
    implements ITieneNombre,
               IImprimible {
    
    private String name;    
    private String abreviatura;    
    private ArrayList<IJugador> jugadores;



    public Equipo(String name, String abreviatura){
        setName(name);
        setAbreviatura(abreviatura);
        jugadores = new ArrayList<IJugador>();
    }

    public ArrayList<IJugador> getJugadores(){
        return this.jugadores;
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    
    public String getAbreviatura(){
        return abreviatura;
    }

    public void setAbreviatura(String value){
        this.abreviatura = value;
    }
    
    public void agregar(IJugador jugador){
        getJugadores().add(jugador);
    }

    
    public int jugadoresCantidad(){
        return this.jugadores.size();
    }


    public IJugador obtenerJugador(int numero){
        return this.jugadores.stream()
                    .filter(x -> x.getNumero() == numero)
                    .findFirst()
                    .orElse(null);
    }

    
    public IJugador obtenerJugador(IJugador jugador){
        return this.jugadores.stream()
                    .filter(x -> x.equals(jugador))
                    .findFirst()
                    .orElse(null);
    }

    public boolean pertenece(IJugador jugador){
        IJugador j = obtenerJugador(jugador);
        if (j != null){
            return true;            
        }
        return false;

    }


    public Object imprimirPlantel() {

        StringBuffer plantel = new StringBuffer();

        List<IJugador> jugadoresEnOrden = 
                    this.jugadores.stream()
                    .sorted((j1, j2) -> Integer.compare(j1.getNumero(), j2.getNumero()))
                    .collect(Collectors.toList());;
            


        for (IJugador jugador : jugadoresEnOrden) {
            plantel.append(jugador.toString());
            plantel.append(", ");
        }

        if (plantel.length() > 2) {
            plantel.setLength(plantel.length() - 2);
        }

        return plantel.toString();
    }

    public String impresion(){
        return String.format("[Equipo] %s > %s", 
                    getName(),
                    getAbreviatura());
    }
}
