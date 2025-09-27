package com.soccer_league;

import com.soccer_league.interfaces.IImprimible;
import com.soccer_league.interfaces.ITieneNombre;

public class Estadio
    implements ITieneNombre,
               IImprimible {

    private String name;
    private String ciudad;
    private String pais;

    public Estadio(String name, String ciudad, String pais) {
        setName(name);
        setCiudad(ciudad);
        setPais(pais);
    }

    
    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    
    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(String value){
        this.ciudad = value;
    }

    
    public String getPais(){
        return this.pais;
    }

    public void setPais(String value){
        this.pais = value;
    }

    @Override
    public String toString(){
        return String.format("%s, %s (%s)", 
                    name, 
                    ciudad, 
                    pais);
    }

    public String impresion(){
        return String.format("[Estadio] %s (%s - %s)", 
                    getName(),
                    getCiudad(),
                    getPais());
    }

}
