package Progra2.src;

public class DadosModificados2 {
    int x[] = new int [7];
    public static void main(String[] args) {
        DadosModificados2 dm2 = new DadosModificados2();
        dm2.sumarCara();
        dm2.mostrarFreq();      
    }
    public void sumarCara()
    {
        for(int i = 1; i <= 10000; i++)
        {
            int rand = (int)(Math.random()*7+0);
            x[rand]++;
        }
    }
    public void mostrarFreq()
    {
        int a = x[2]+x[6];
        System.out.println("Frecuencia del dado en 10000 intentos:\nCara 1: "+x[0]+"\nCara 2: "+x[1]+"\nCara 3: "+a+"\nCara 4: "+x[3]+"\nCara 5: "+x[4]+"\nCara 6: "+x[5]);
    }
}
