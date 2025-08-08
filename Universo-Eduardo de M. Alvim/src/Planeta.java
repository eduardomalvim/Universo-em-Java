import java.util.Objects;

public class Planeta extends Astro{

    private boolean habitabilidade;
    private boolean giganteGasoso;
    private boolean planetaRochoso;
    public boolean possuiAgua;
    public boolean possuiLua;
    public boolean isLua = false;
    public boolean orbitaPlaneta = false;
    public boolean areaHabitavelEstelar;


    public void Tipo(){

        String tipo = tipoObjeto;
        if("Gigante gasoso".equalsIgnoreCase(tipo)){
            giganteGasoso = true;
            planetaRochoso = false;
        }
        else if("Planeta Rochoso".equalsIgnoreCase(tipo)){
            planetaRochoso = true;
            giganteGasoso = false;
        }
        else if(orbitaPlaneta == true /*&& massa > outroPlaneta*/){
            isLua = true;
        }
        else{
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

    public void PropriedadesEspecificas(){

        Tipo();
        Habitabilidade();
        if(giganteGasoso == true){ System.out.println("Tipo de planeta: Gigante gasoso");}
        else{ System.out.println("Tipo de planeta: Planeta Rochoso");}
        System.out.println("Possui Água?: " + (this.possuiAgua ? "Sim" : "Não"));
        System.out.println("Está na área habitável?: " + (this.areaHabitavelEstelar ? "Sim" : "Não"));
        System.out.println("Possui Luas?: " + (this.possuiLua ? "Sim" : "Não"));
        System.out.println("É uma Lua?: " + (this.isLua ? "Sim" : "Não"));
        System.out.println("É Habitável?: " + (this.habitabilidade ? "Sim" : "Não"));
    }

    public boolean getHabitabilidade(){return habitabilidade;}
}
