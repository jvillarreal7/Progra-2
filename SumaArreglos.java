
/**
 * Write a description of class SumaArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
import java.util.*;
public class SumaArreglos
{
    public static void main (String[]args)
    {
        int suma = 0, i = 1, a = 0, n;
        int x [] = new int[20];
        
        for (i = 1; i <= 20; i++)
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclee un número entero."));
            x[a] = n;
            a++;
            suma += n;
        }
        JOptionPane.showMessageDialog(null,"La suma de los números es de: "+suma+".");
    }

}
