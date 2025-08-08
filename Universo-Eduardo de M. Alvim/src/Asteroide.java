public class Asteroide extends Astro {

    public boolean possuiMetal;
    public boolean possuiAgua;
    public boolean temperaturaAlta = false;
    private boolean cometa;

    public boolean PossuiCalda(){

        if(possuiAgua == true && temperaturaAlta == true){

            cometa = true;
            return cometa;
        }else{
            return cometa = false;
        }
    }

    public void PropriedadesEspecificas(){

        PossuiCalda();
        System.out.println("Possui Metais?: " + (this.possuiMetal ? "Sim" : "Não"));
        System.out.println("Possui Água?: " + (this.possuiAgua ? "Sim" : "Não"));
        System.out.println("Possui Temperatura Elevada?: " + (this.temperaturaAlta ? "Sim" : "Não"));
        System.out.println("É um Cometa?: " + (this.cometa ? "Sim" : "Não"));
    }
}
