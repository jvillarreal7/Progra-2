/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcial;

public class Practica2D {
    int a [][];
    public static void main(String[] args) {
        Practica2D b = new Practica2D(20,20);
        b.llenarArreglos();
        b.mostrarArreglos();
        b.sumaArreglos();
    }
    private void llenarArreglos()
    {
        for(int i = 0;  i < a.length; i++)
            for(int j = 0; j <a[i].length; j++)
            {
                a[i][j] = (int)(Math.random()*100);
            }
    }
    private void mostrarArreglos()
    {
        for (int [] temporal : a)
        {
            for (int elemento : temporal)
            {
                System.out.print(elemento+"\t");
            }
            System.out.println("");
        }
    }
    private void sumaArreglos()
    {
        int suma = 0;
        for(int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                suma += a[i][j];
            }
        }
        System.out.println("La suma es de: "+suma);
    }
    public Practica2D(int x, int y)
    {
        a = new int [x][y];
    }
}
