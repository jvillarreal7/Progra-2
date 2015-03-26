package pkg1erparcial;

public class Arreglos2D {
    private int a[][];
    public static void main(String[] args) {
        Arreglos2D b = new Arreglos2D(5,5);
        b.llenarArreglos();
        b.mostrarArreglos();
        b.sumaArreglos();
    }
    public void llenarArreglos()
    {
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = (int)(Math.random()*50);
            }     
    }
    public void mostrarArreglos()
    {
        for (int [] temporal : a)
        {
            for (int elemento : temporal)
            {
                System.out.print(elemento + "\t");
            }
            System.out.println("");
        }
    }
    public void sumaArreglos()
    {
        int suma = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++)
            {
                suma += a[i][j];
            } 
        System.out.println("La suma es de: "+suma);
    }
    public Arreglos2D (int x, int y)
    {
        a = new int [x][y];
    }
}    