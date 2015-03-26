/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcial;

public class Arreglos1D {
int a[] = new int[20];
    public static void main(String[] args) {
        Arreglos1D x = new Arreglos1D();
        x.llenarArreglos();
        x.mostrarArreglos();
        x.sumarArreglos();
    }
    private void llenarArreglos()
    {
        for(int i = 0; i < a.length; i++)
        {
            int rand = (int)(Math.random()*50);
            a[i] = rand;
        }
    }
    private void sumarArreglos()
    {
        int suma = 0;
        for(int i = 0; i < a.length; i++)
        {
            suma+=a[i];
        }
        System.out.println("La suma es de: "+suma);
    }
    private void mostrarArreglos()
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}