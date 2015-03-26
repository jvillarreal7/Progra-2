package Progra2.src;

 public class SumaArreglos2 {
    int x [] = new int[20];
    public static void main(String[] args) {
        SumaArreglos2 sm = new SumaArreglos2();
        sm.llenarArreglo();
        sm.mostrarArreglo();
        sm.sumaArreglo();
        
    }
    public void llenarArreglo()
    {       
        for (int i = 1; i < 20; i++)
        {
            x[i] = new java.util.Random().nextInt(1000)+1;
        }
    }
    public void mostrarArreglo()
    {
        for (int i = 1; i < 20; i++)
        {
            System.out.println(x[i]);
        }
    }
    public void sumaArreglo()
    {
        int suma = 0;
        for (int i = 1; i < 20; i++)
        {
            suma += x[i];
        }
    System.out.println("La suma es: "+suma);  
    }
    
}
