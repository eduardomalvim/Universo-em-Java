import java.util.Objects;

public class Planeta extends Astro{

    private boolean habitabilidade;
    private boolean possuiAgua;
    private boolean areaHabitavelEstelar;
    private boolean giganteGasoso;
    private boolean planetaRochoso;

    private void Tipo(){

        if(Objects.equals(getTipoObjeto(), "Gigante gasoso")){
            giganteGasoso = true;
            planetaRochoso = false;
        }
        else if(Objects.equals(getTipoObjeto(), "Planeta rochoso")){
            planetaRochoso = true;
            giganteGasoso = false;
        }
    }

    public boolean Habitabilidade(boolean possuiAgua, boolean areaHabitavelEstelar, boolean planetaRochoso){
        if(possuiAgua == true && areaHabitavelEstelar == true && planetaRochoso == true){

            return this.habitabilidade = true;
        }
        else{
            return this.habitabilidade = false;
        }
    }
}
