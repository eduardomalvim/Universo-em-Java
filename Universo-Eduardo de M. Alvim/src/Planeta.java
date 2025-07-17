import java.util.Objects;

public class Planeta extends Astro{

    private boolean habitabilidade;
    private boolean possuiAgua = true;
    private boolean areaHabitavelEstelar = true;
    private boolean giganteGasoso;
    public boolean planetaRochoso;

    public void Tipo(){

        String tipo = getTipoObjeto();
        if("Gigante gasoso".equalsIgnoreCase(tipo)){
            giganteGasoso = true;
            planetaRochoso = false;
        }
        else if("Planeta Rochoso".equalsIgnoreCase(tipo)){
            planetaRochoso = true;
            giganteGasoso = false;
        }else{
            giganteGasoso = false;
            planetaRochoso = false;
        }
    }

    public boolean Habitabilidade(){

        if(possuiAgua == true && areaHabitavelEstelar == true && planetaRochoso == true){

            return habitabilidade = true;
        }
        else{
            return habitabilidade = false;
        }
    }

    public boolean getHabitabilidade(){return habitabilidade;}
}
