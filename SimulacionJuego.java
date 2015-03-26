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
public class SimulacionJuego {
private TablaLoteria tablas[];
    public SimulacionJuego (int x){
    tablas = new TablaLoteria [x];
    }
    public static void main(String[] args) {
    SimulacionJuego sim = new SimulacionJuego(3);
        for(int i = 0; i < sim.tablas.length; i++)
        {
        sim.tablas[i] = new TablaLoteria(4,4);
        sim.tablas[i].llenaTabla();
        sim.tablas[i].muestraTabla();
        System.out.println("************");
        }
    }
}
