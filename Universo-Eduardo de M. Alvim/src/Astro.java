import java.lang.Math;

public class Astro {

    private double massa;
    private double raio;
    private double gravidade;
    private double densidade;
    private double densidadeCentral;
    private String tipoObjeto;
    private float k;

    public double Gravidade(double massa, double raio){

        double constanteGravitacional = (6.674 * Math.pow(10, -11)); // N⋅m²/kg²
        double g = (constanteGravitacional * (massa/Math.pow(raio, 2)));
        return gravidade = g;
    }

    public double Densidade(double massa, double raio){

        double volume = ((4.0/3.0) * Math.PI * Math.pow(raio, 3)); // kg/m³
        double d = massa/volume;
        return densidade = d;
    }

    public double DensidadeCentral(double densidade, float k){

        if(densidade < 1000){tipoObjeto = "Gigante gasoso"; k = 15;}else
        if(densidade < 2000){tipoObjeto = "Estrela"; k = 100;}else
        if(densidade < 6000){tipoObjeto = "Planeta rochoso"; k = 1;}else
        if(densidade < 1e10){tipoObjeto = "Estrela anã"; k = 1000;}else
        if(densidade < 1e17){tipoObjeto = "Estrela de neutrons"; k = 1;}
        else{tipoObjeto = "Buraco negro"; k = 1;}

        double dc = densidade * k;
        return densidadeCentral = dc;
    }

    public double getMassa(){return massa;}
    public double setMassa(double massa) {return this.massa = massa;}

    public double getRaio(){return raio;}
    public double setRaio(double raio) {return this.raio = raio;}

    public double getGravidade(){return gravidade;}

    public double getDensidade(){return densidade;}

    public double getDensidadeCentral(){return densidadeCentral;}

    public String getTipoObjeto(){return tipoObjeto;}

    public float getK(){return k;}
}
