import java.lang.Math;

public class Astro {

    public double densidade;
    public double massa;
    public double raio;
    public double gravidade;

    public double Gravidade(double massa, double raio){

        double constanteGravitacional = (6.674 * Math.pow(10, -11)); // N⋅m²/kg²
        double g = (constanteGravitacional * (massa/Math.pow(raio, 2)));
        return this.gravidade = g;
    }

    public double Densidade(double massa, double raio){

        double volume = ((4.0/3.0) * Math.PI * Math.pow(raio, 3)); // kg/m^3
        double d = massa/volume;
        return this.densidade = d;
    }
}
