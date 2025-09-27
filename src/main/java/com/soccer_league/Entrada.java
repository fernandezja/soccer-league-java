package com.soccer_league;

public class Entrada {

    private Partido partido;
    private String name;
    private double monto;
    
    public Entrada(Partido partido, String name, double monto){
        setPartido(partido);
        setName(name);
        setMonto(monto);
    }

    public Partido getPartido(){
        return partido;
    }

    public void setPartido(Partido value){
        this.partido = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    public double getMonto(){
        return monto;
    }

    public void setMonto(double value){
        this.monto = value;
    }

    @Override
    public String toString(){
      return String.format("[Entrada] Partido %s vs. %s el %s", 
                    getPartido().getLocal().getAbreviatura(),
                    getPartido().getVisitante().getAbreviatura(),
                    getPartido().getFechaFormateada());
    }

}
