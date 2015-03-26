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
public class TablaLoteria {
    CartasLoteria tabla [][];  
    CartasLoteria x;
    public static void main(String[] args) {
        TablaLoteria tl = new TablaLoteria(4,4);
        tl.llenaTabla();
        tl.muestraTabla();
    }
    public void llenaTabla(){
        for(int i = 0; i < tabla.length; i++)
        {
            for(int j = 0; i <tabla[i].length; i++)
            {
                tabla[i][j] = CartasLoteria.values()[x.getCartaAzar()];
            }
        }
    }
    public TablaLoteria (int x, int y){
        tabla = new CartasLoteria [x][y];
    }
    public void muestraTabla(){
        for(CartasLoteria[]temporal : tabla){
            for(CartasLoteria elemento : temporal){
                System.out.println(elemento.name()+"\t");}
            System.out.println("");
        }
            }
    }
