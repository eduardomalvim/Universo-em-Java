public class Planeta extends Astro{

    public boolean habitabilidade;
    public boolean possuiAgua;
    public boolean areaHabitavelEstelar;
    public boolean giganteGasoso;
    public boolean planetaRochoso;

    public boolean Habitabilidade(boolean possuiAgua, boolean areaHabitavelEstelar, boolean giganteGasoso){
        if(possuiAgua == true && areaHabitavelEstelar == true && giganteGasoso == false){

            return this.habitabilidade = true;
        }
        else{
            return this.habitabilidade = false;
        }
    }
}
