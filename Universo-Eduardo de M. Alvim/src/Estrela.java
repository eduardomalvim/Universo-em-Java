public class Estrela extends Astro {

    public double constanteBoltzmann = (1.38 * Math.pow(10, -23));
    private double temperatura;
    private int geracaoEstelar;

    double TemperaturaNuclear(double massa, double raio){

        temperatura = (constanteGravitacional * massa * 0.6 * (1.67 * Math.pow(10, -27))) / (constanteBoltzmann * raio);
        return temperatura;
    }

    public double getTemperatura(){return temperatura;}
}
