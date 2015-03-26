package Progra2.src;


/**
 * Write a description of class NumeroMayor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
public class NumeroMayor
{
    public static void main (String[]args)
    {
        double num1, num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es el primer n�mero?"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"�Cu�l es el segundo n�mero?"));
        
        if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null,"El primer n�mero es mayor.");
        }
        if (num1 < num2)
        {
            JOptionPane.showMessageDialog(null,"El segundo n�mero es mayor.");
        }
        if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null,"Son iguales.");
        }
    }
}
