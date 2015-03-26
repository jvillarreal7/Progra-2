package Progra2.src;

public class SimulacionDado2 {
    int x[] = new int [6];
    public static void main(String[] args) {
        SimulacionDado2 sd = new SimulacionDado2();
        sd.sumarCara();
        sd.mostrarFreq();
    }
    public void sumarCara()
    {
        for(int i = 1; i <= 10000; i++)
        {
            int rand = (int)(Math.random()*6+0);
            x[rand]++;
        }
    }
    public void mostrarFreq()
    {
        System.out.println("Frecuencia del dado en 10000 intentos:\nCara 1: "+x[0]+"\nCara 2: "+x[1]+"\nCara 3: "+x[2]+"\nCara 4: "+x[3]+"\nCara 5: "+x[4]+"\nCara 6: "+x[5]);
    }
}