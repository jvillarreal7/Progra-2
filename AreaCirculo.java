package Progra2.src;


/**
 * Write a description of class AreaCirculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
public class AreaCirculo
{
    public static void main(String[]args)
    {
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es el radio de la circunferencia?"));
        
        area = Math.PI*Math.pow(radio,2);
        
        JOptionPane.showMessageDialog(null,"El area de la circunferencia es: "+area);
    }
}
