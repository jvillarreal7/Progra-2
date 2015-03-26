package Progra2.src;


/**
 * Write a description of class Calificacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
public class Calificacion
{
    public static void main(String[]args)
    {
        double cal;
        
        cal = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es la calificacion?"));
        
        if (cal >= 70)
        {
            JOptionPane.showMessageDialog(null,"Calificaci�n aprobada.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Calificaci�n reprobada.");
        }
    }
}
