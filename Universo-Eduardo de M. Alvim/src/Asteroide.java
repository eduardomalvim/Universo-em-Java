public class Asteroide extends Astro {

    private boolean possuiMetal;
    private boolean possuiAgua;
    private boolean areaEstelar = false;
    private boolean possuiCalda;

    boolean PossuiCalda(){

        if(possuiAgua == true && areaEstelar == true){

            possuiCalda = true;
            return possuiCalda;
        }else{
            return possuiCalda = false;
        }
    }
}
