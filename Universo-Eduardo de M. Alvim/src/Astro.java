import java.lang.Math;

public class Astro {

    public double constanteGravitacional = (6.674 * Math.pow(10, -11));
    private double massa;
    private double raio;
    private double gravidade;
    private double densidade;
    private double densidadeCentral;
    private String tipoObjeto;
    private float k;

    public double Gravidade(double massa, double raio){     // N⋅m²/kg²

        double g = (constanteGravitacional * (massa/Math.pow(raio, 2)));
        return gravidade = g;
    }

    public double Densidade(double massa, double raio){     // kg/m³

        double volume = ((4.0/3.0) * Math.PI * Math.pow(raio, 3));
        densidade = massa/volume;
        TipoObjeto();
        return densidade;
    }

    public double DensidadeCentral(double densidade, float k){

        double dc = densidade * k;
        return densidadeCentral = dc;
    }

    public void TipoObjeto(){

        if(densidade < 1000){tipoObjeto = "Gigante Gasoso"; k = 15;}else
        if(densidade < 2000){tipoObjeto = "Estrela"; k = 105;}else
        if(densidade < 6000){tipoObjeto = "Planeta Rochoso"; k = 1;}else
        if(densidade < 1e10){tipoObjeto = "Estrela Anã"; k = 1000;}else
        if(densidade < 1e17){tipoObjeto = "Estrela de Neutrons"; k = 1;}
        else{tipoObjeto = "Buraco Negro"; k = 1;}
    }

    public double getMassa(){return massa;}
    public void setMassa(double massa) {this.massa = massa;}

    public double getRaio(){return raio;}
    public void setRaio(double raio) {this.raio = raio;}

    public double getGravidade(){return gravidade;}

    public double getDensidade(){return densidade;}

    public double getDensidadeCentral(){return densidadeCentral;}

    public String getTipoObjeto(){return tipoObjeto;}

    public float getK(){return k;}
}
