package Progra2.src;


/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Dado
{   
    private int suma1, suma2;
    private String n1, n2;
    public static void main (String[]args)
    { 
        Dado x = new Dado();
        x.partidaDado();
    }
    public void partidaDado()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee el nombre del jugador 1.");
        n1 = sc.next();
        System.out.println("Teclee el nombre del jugador 2.");
        n2 = sc.next();
        System.out.println("*********************************");
        for (int i = 1; i <= 5; i++)
        {
            int x = (int)(Math.random()*6+1);
            System.out.println("Turno "+i+"/5!\n"+n1+" avento el dado!\nCayo en: "+x+"!");
            suma1+=x;
            int y = (int)(Math.random()*6+1);
            System.out.println(n2+" avento el dado!\nCayo en: "+y+"!");
            suma2+=y;
            System.out.println("*********************************");
        }
        if (suma1 > suma2)
        {
            System.out.println("Resultados:\n"+n1+": "+suma1+"\n"+n2+": "+suma2+"\n"+n1+" gana!");
        }
        if (suma1 < suma2)
        {
            System.out.println("Resultados:\n"+n1+": "+suma1+"\n"+n2+": "+suma2+"\n"+n2+" gana!");
        }
        if (suma1 == suma2)
        {
            System.out.println("Resultados:\n"+n1+": "+suma1+"\n"+n2+": "+suma2+"\nEmpate!");
        }
    }
}
