package com.soccer_league;

import com.soccer_league.interfaces.IImprimible;

public class PantallaLed {
    
    public String imprimir(IImprimible algoImprimible){
        return algoImprimible.impresion();
    }
}
