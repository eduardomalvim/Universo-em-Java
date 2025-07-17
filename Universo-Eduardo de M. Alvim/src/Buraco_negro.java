public class Buraco_negro extends Astro {

    public double velocidadeLuz = (3 * Math.pow(10, 8));
    private double raioSchwarzschild;
    private double massaBuracoNegro;
    private double densidadeAparente;

    public Buraco_negro() {
        tipoObjeto = "Buraco Negro";
        k = 1;
    }

    public double MassaBuracoNegro(double raioSchwarzschild){

        massaBuracoNegro = ((Math.pow(velocidadeLuz, 2) * raioSchwarzschild) / (2 * constanteGravitacional));
        return massaBuracoNegro;
    }

    public double DensidadeAparente(double massaBuracoNegro, double raioSchwarzschild){

        densidadeAparente = ((massaBuracoNegro) / ((4.0/3.0) * Math.PI * Math.pow(raioSchwarzschild, 3)));
        return densidadeAparente;
    }

    @Override
    public void TipoObjeto(){

        if(densidadeAparente < 1000){tipoObjeto = "Gigante Gasoso"; k = 15;}else
        if(densidadeAparente < 2000){tipoObjeto = "Estrela"; k = 105;}else
        if(densidadeAparente < 6000){tipoObjeto = "Planeta Rochoso"; k = 1;}else
        if(densidadeAparente < 1e10){tipoObjeto = "Estrela Anã"; k = 1000;}else
        if(densidadeAparente < 1e17){tipoObjeto = "Estrela de Neutrons"; k = 1;}
        else{tipoObjeto = "Buraco Negro"; k = 1;}
    }

    public double getMassa() {return massaBuracoNegro;}
    public void setMassa(int massa) {
        System.out.println("Buracos negros tem a massa estimada pelo raio.");
    }

    @Override
    public double getRaio(){return this.raioSchwarzschild;}
    public void setRaio(double raioSchwarzschild) {this.raioSchwarzschild = raioSchwarzschild;}

    public double getDensidadeAparente(){return densidadeAparente;}
}
