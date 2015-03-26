
/**
 * Write a description of class SimulacionDado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.text.*;
import java.util.*;
public class SimulacionDado
{
    public static void main(String[]args)
    {
        int rand, i = 1;
        int x[] = new int[6];
        
        for(i = 1; i <= 10000; i++)
        {
            rand = (int)(Math.random()*6+0);
            x[rand]++;
        }
        JOptionPane.showMessageDialog(null,"Frecuencia del dado en 10000 intentos:\nCara 1: "+x[0]+"\nCara 2: "+x[1]+"\nCara 3: "+x[2]+"\nCara 4: "+x[3]+"\nCara 5: "+x[4]+"\nCara 6: "+x[5]);
    }
}
