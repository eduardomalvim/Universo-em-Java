public class Buraco_negro extends Astro {

    public double velocidadeLuz = (3 * Math.pow(10, 8));
    private double densidadeAparente;

    public double MassaBuracoNegro(double raio){

        setMassa(((Math.pow(velocidadeLuz, 2) * raio) / (2 * constanteGravitacional)));
        return getMassa();
    }

    public void DensidadeAparente(double massa, double raio){

        this.densidadeAparente = ((massa) / ((4.0/3.0) * Math.PI * Math.pow(raio, 3)));
    }

    public void PropriedadesEspecificas(){

        setMassa(MassaBuracoNegro(getRaio()));
        DensidadeAparente(getMassa(), getRaio());
    }


    public double getDensidadeAparente(){return densidadeAparente;}
}
