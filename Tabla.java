package Progra2.src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueservice
 */

public class Tabla {
    private int tabla [][];
    public static void main(String[] args) {
        Tabla x = new Tabla(3,3);
        x.generarNumeros();
        x.mostrarNumeros();
    }
    public void generarNumeros()
    {
        for(int i = 0; i < tabla.length ; i++)    
            for (int j = 0; j < tabla[i].length; j++)
            {
                tabla[i][j] = (int)(Math.random()*(54-1+1)+1);
            }  
    }
    public void mostrarNumeros()
    {
        for (int [] temporal : tabla)
        {
            for (int elemento : temporal)
            {
                System.out.print(elemento + "\t");
            }
        System.out.println("");
        }
    }
    public Tabla (int x, int y)
    {
        tabla = new int [x][y];
    }
}


            
        
