public class Estrela extends Astro {

    public double constanteBoltzmann = (1.38 * Math.pow(10, -23));
    private double temperatura;
    private int geracaoEstelar;
    private boolean estrelaAna;
    private boolean estrelaNeutrons;

    public double TemperaturaNuclear(double massa, double raio){

        temperatura = (constanteGravitacional * massa * 0.6 * (1.67 * Math.pow(10, -27))) / (constanteBoltzmann * raio);
        return temperatura;
    }

    public void Tipo(){

        String tipo = tipoObjeto;
        if("Estrela Anã".equalsIgnoreCase(tipo)){
            estrelaAna = true;
            estrelaNeutrons = false;
        }
        else if("Estrela de Neutrons".equalsIgnoreCase(tipo)){
            estrelaAna = false;
            estrelaNeutrons = true;
        }else{
            estrelaAna = false;
            estrelaNeutrons = false;
        }
    }

    public void PropriedadesEspecificas(){

        Tipo();
        TemperaturaNuclear(getMassa(), getRaio());
        if(estrelaAna == true){ System.out.println("Tipo de estrela: Anã");}
        else if(estrelaNeutrons == true){ System.out.println("Tipo de estrela: Neutrons");}
        else{ System.out.println("Tipo de estrela: Comum");}
        System.out.println("Temperatura do Núcleo: " + this.temperatura + " K");
    }

    public double getTemperatura(){return temperatura;}
}
