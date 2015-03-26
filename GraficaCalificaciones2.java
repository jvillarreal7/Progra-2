package Progra2.src;

public class GraficaCalificaciones2 {
    int x[] = new int [6];
    public static void main(String[] args) {
        GraficaCalificaciones2 gc = new GraficaCalificaciones2();
        gc.GenerarCalif();
        gc.MostrarCalif();
    }
    public void GenerarCalif()
    {
        for(int i = 1; i <= 30; i++)
        {
            int rand = (int)(Math.random()*6+0);
            x[rand]++;
        }
    }
    public void MostrarCalif()
    {
        System.out.println("\nFrecuencia de calificaciones:\n");
        
        System.out.print("5 =  ");
        for (int j = 1; x[0] > 0; j++)
        {
            x[0]--;
            System.out.print("*");
        }
        
        int j = 1;
        
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
        
        System.out.print("\n-----------------------------------------------\n");
}
    
}
