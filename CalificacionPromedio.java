
/**
 * Write a description of class CalificacionPromedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
public class CalificacionPromedio
{
    public static void main (String[]args)
    {
        double c1, c2, c3, prom;
        
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es la calificaci�n 1?"));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es la calificaci�n 2?"));
        c3 = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es la calificaci�n 3?"));
        
        prom = (c1+c2+c3)/3;
        
        JOptionPane.showMessageDialog(null,"El promedio es de: "+prom);
    }
}
