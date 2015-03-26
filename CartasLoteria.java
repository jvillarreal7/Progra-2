package Progra2.src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jimmy
 */
public enum CartasLoteria {
    GALLO(1,"El que canta..."),
    BOTELLA(2,"Placeholder 2"),
    BORRACHO(3,"Placeholder 3"),
    DAMA(4,"Placeholder 4"),
    VALIENTE(5,"Placeholder 5"),
    RANA(6,"Placeholder 6");
final int numCarta;
final String rimaCarta;
private CartasLoteria(int nm, String r){
        numCarta = nm;
        rimaCarta = r;
    }
public int getNumCarta(){
    return numCarta;
    }
public String getRimaCarta(){
    return rimaCarta;
    }
public int getCartaAzar(){
    int rand = (int) (Math.random() * 5);
    return rand;
    }
}
