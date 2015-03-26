/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcial;

public class P2DII {
    int a[][] = new int [3][3];
    public static void main(String[] args) {
        P2DII b = new P2DII();
        b.llenarArreglo();
        b.mostrarArreglo();
        b.sumaArreglo();
    }
    private void llenarArreglo()
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = (int)(Math.random()*1000);
            }
        }
    }
    private void mostrarArreglo()
    {
        for(int temporal[] : a)
        {
            for(int elemento : temporal)
            {
                System.out.print(elemento+"\t");
            }
            System.out.println("");
        }
    }
    private void sumaArreglo()
    {
        int suma = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j <a[i].length; j++)
            {
                suma += a[i][j];
            }
        }
        System.out.println("La suma es de: "+suma);
    }
}
