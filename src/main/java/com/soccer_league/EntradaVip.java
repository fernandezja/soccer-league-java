package com.soccer_league;

public class EntradaVip 
            extends Entrada {

    
    public EntradaVip(Partido partido, String name, double monto){
        super(partido, name, monto);
    }

    public boolean esVip(){
        return true;
    }

    @Override
    public String toString(){
      return String.format("[Entrada VIP] Partido %s vs. %s el %s", 
                    getPartido().getLocal().getAbreviatura(),
                    getPartido().getVisitante().getAbreviatura(),
                    getPartido().getFechaFormateada());
    }

}
