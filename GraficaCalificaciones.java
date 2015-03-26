
/**
 * Write a description of class GraficaCalificaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
import java.util.*;
public class GraficaCalificaciones
{
    public static void main(String[]args)
    {
        int rand, i = 1, j = 1;
        int x[] = new int[6];
        
        for(i = 1; i <= 30; i++)
        {
            rand = (int)(Math.random()*6+0);
            x[rand]++;
        }
        
        System.out.println("\nFrecuencia de calificaciones:\n");
        
        System.out.print("5 =  ");
        for (j = 1; x[0] > 0; j++)
        {
            x[0]--;
            System.out.print("*");
        }
        
        j = 1;
        
        System.out.print("\n6 =  ");
        for (j = 1; x[1] > 0; j++)
        {
            x[1]--;
            System.out.print("*");
        }
        
        j = 1;
        
        System.out.print("\n7 =  ");
        for (j = 1; x[2] > 0; j++)
        {
            x[2]--;
            System.out.print("*");
        }
        
        j = 1;
        
        System.out.print("\n8 =  ");
        for (j = 1; x[3] > 0; j++)
        {
            x[3]--;
            System.out.print("*");
        }
        
        j = 1;
        
        System.out.print("\n9 =  ");
        for (j = 1; x[4] > 0; j++)
        {
            x[4]--;
            System.out.print("*");
        }
        
        j = 1;
        
        System.out.print("\n10 = ");
        for (j = 1; x[5] > 0; j++)
        {
            x[5]--;
            System.out.print("*");
        }
        
        System.out.print("\n-----------------------------------------------");
     
    }
        
}
