public class Buraco_negro extends Astro {

    public double velocidadeLuz = (3 * Math.pow(10, 8));
    private double raioSchwarzschild;
    private double massaBuracoNegro;

    public double MassaBuracoNegro(double raioSchwarzschild){

        massaBuracoNegro = ((Math.pow(velocidadeLuz, 2) * raioSchwarzschild) / 2 * constanteGravitacional);
        return massaBuracoNegro;
    }

    public double DensidadeAparente(){
        // formula densidade
    }

    public double getMassa() {return massaBuracoNegro;}
    public void setMassa(int massa) {
        System.out.println("Buracos negro tem a massa baseada no raio.");
    }

    public double getRaioSchwarzschild() {return raioSchwarzschild;}
    public void setRaioSchwarzschild(double raioSchwarzschild) {this.raioSchwarzschild = raioSchwarzschild;}
}
