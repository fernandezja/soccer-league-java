package com.soccer_league;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.soccer_league.interfaces.ITieneNombre;

public class Partido
    implements ITieneNombre {
    
    private String name;          
    private Estadio estadio; 
    private Equipo local;
    private Equipo visitante;
    private ArrayList<TarjetaBase> tarjetas;
    private Date fecha;

    public Partido(Equipo local, Equipo visitante, String name){
        setName(name);        
        setLocal(local);        
        setVisitante(visitante);
        tarjetas = new ArrayList<>();
    }

     public Partido(Estadio estadio, Equipo local, Equipo visitante, String name){
        setEstadio(estadio);                
        setName(name); 
        setLocal(local);        
        setVisitante(visitante);
        tarjetas = new ArrayList<>();
    }

    public String getName(){
        return String.format("%s %sx%s", 
                    name, 
                    local.getAbreviatura(), 
                    visitante.getAbreviatura());
    }

    public void setName(String value){
        this.name = value;
    }

    public Estadio getEstadio(){
        return this.estadio;
    }

    private void setEstadio(Estadio value){
        this.estadio = value;
    }    
    
    
    public Equipo getLocal(){
        return this.local;
    }

    private void setLocal(Equipo value){
        this.local = value;
    }    
    
    public Equipo getVisitante(){
        return this.visitante;
    }


    private void setVisitante(Equipo value){
        this.visitante = value;
    }

    public void agregar(TarjetaBase tarjeta){
        this.tarjetas.add(tarjeta);
    }
    
    public int tarjetasCantidad(){
        return this.tarjetas.size();
    }
    
    public ArrayList<TarjetaBase> getTarjetas(){
        return this.tarjetas;
    }

    public void setFecha(Date value){
        this.fecha = value;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public String getFechaFormateada(){
        SimpleDateFormat dateFormat  = new SimpleDateFormat("dd/MM/yyyy");
         return dateFormat.format(getFecha());
    }
}
