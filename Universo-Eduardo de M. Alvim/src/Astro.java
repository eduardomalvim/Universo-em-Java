import jdk.jshell.DeclarationSnippet;

import java.lang.Math;

public abstract class Astro {

    public String nome;
    public double constanteGravitacional = (6.674 * Math.pow(10, -11));
    private double massa;
    private double raio;
    private double gravidade;
    private double densidade;
    private double densidadeCentral;
    public String tipoObjeto;
    public String tipoClasse;
    public float k;

    public double Gravidade(double massa, double raio){     //

        this.gravidade = (constanteGravitacional * (massa/Math.pow(raio, 2)));
        return gravidade;
    }

    public double Densidade(double massa, double raio){     // kg/m³

        double volume = ((4.0/3.0) * Math.PI * Math.pow(raio, 3));
        this.densidade = massa/volume;
        DensidadeCentral(densidade, this.k);
        TipoObjeto(densidade, raio);
        return densidade;
    }

    public double DensidadeCentral(double densidade, float k){

        double dc = densidade * k;
        return this.densidadeCentral = dc;
    }

    public void TipoObjeto(double densidade, double raio){

        if(densidade >= 200 && densidade <= 2000 && raio >= 15e6 && raio <= 1e8){this.tipoClasse = "Planeta"; this.tipoObjeto = "Gigante Gasoso"; this.k = 15;}else
        if(densidade >= 100 && densidade <= 10000 && raio >= 5e7 && raio <= 2e12){this.tipoClasse = "Estrela"; this.tipoObjeto = "Estrela"; this.k = 105;}else
        if(densidade > 0 && densidade <= 10000 && raio >= 5e7 && raio <= 2e12){this.tipoClasse = "Estrela"; this.tipoObjeto = "Gigante Vermelha"; this.k = 105;}else
        if(densidade >= 500 && densidade <= 3500 && raio >= 10 && raio <= 5e5){this.tipoClasse = "Asteroide"; this.tipoObjeto = "Asteroide"; this.k = 1;}else
        if(densidade >= 3000 && densidade <= 7000 && raio >= 2e6 && raio <= 1.2e7){this.tipoClasse = "Planeta"; this.tipoObjeto = "Planeta Rochoso"; this.k = 1;}else
        if(densidade >= 1e6 && densidade <= 1e8 && raio >= 4e6 && raio <= 15e6){this.tipoClasse = "Estrela"; this.tipoObjeto = "Estrela Anã"; this.k = 1000;}else
        if(densidade >= 1e17 && densidade <= 1e18 && raio >= 5000 && raio <= 20000){this.tipoClasse = "Estrela"; this.tipoObjeto = "Estrela de Neutrons"; this.k = 1;}
        else {
            this.tipoClasse = "Buraco_negro";
            this.tipoObjeto = "Buraco Negro";
            this.k = 1;
        }
    }

    public void PropriedadesGerais(Astro astroSelecionado){

        MenuApp.clearConsole();
        double d = Densidade(astroSelecionado.getMassa(), astroSelecionado.getRaio());
        Gravidade(astroSelecionado.getMassa(), astroSelecionado.getRaio());
        if( !(astroSelecionado instanceof Buraco_negro buraconegro))
        {TipoObjeto(d, astroSelecionado.getRaio());
        DensidadeCentral(astroSelecionado.getGravidade(), astroSelecionado.k);
        }
        else{ buraconegro.PropriedadesEspecificas();}
        System.out.println("=== Propriedades do Astro ===");
        System.out.println("Nome: " + astroSelecionado.getNome());
        System.out.println("Tipo: " + astroSelecionado.tipoObjeto);
        System.out.println("Massa: " + astroSelecionado.getMassa() + " kg");
        System.out.println("Diametro: " + astroSelecionado.getRaio()*2 + " m");
        System.out.println("Força Gravitacional: " + astroSelecionado.getGravidade() + " m/s²");
        if(astroSelecionado instanceof Buraco_negro buraco_negro)
        {System.out.println("Densidade Aparente: " + buraco_negro.getDensidadeAparente() + " kg/m³");
        System.out.println("Densidade do Núcleo: Infinita");
        }
        else
        {System.out.println("Densidade: " + astroSelecionado.getDensidade() + " kg/m³");
        System.out.println("Densidade do Núcleo: " + astroSelecionado.getDensidadeCentral() + " kg/m³");
        }

    }

    public static double MassaCeres(double massa){
        massa = massa * (9.457 * Math.pow(10, 20));
        return massa;
    }

    public static double MassaTerra(double massa){
        massa = massa * (5.974 * Math.pow(10, 24));
        return massa;
    }

    public static double MassaSolar(double massa){
        massa = massa * (1.988 * Math.pow(10, 30));
        return massa;
    }

    public static double MassaNegra(double massa){
        massa = MassaSolar(massa) * 1000;
        return massa;
    }

    public static double RaioKilometros(double raio){
        raio = raio * 1000;
        return raio;
    }

    public static double RaioTerra(double raio){
        raio = raio * (6.371 * Math.pow(10, 6));
        return raio;
    }

    public static double RaioSolar(double raio){
        raio = raio * (6.96 * Math.pow(10, 8));
        return raio;
    }

    public static double UA(double raio){
        raio = raio * (1.5 * Math.pow(10, 11));
        return raio;
    }

    public double getMassa(){return massa;}
    public void setMassa(double massa) {this.massa = massa;}

    public double getRaio(){return raio;}
    public void setRaio(double raio) {this.raio = raio;}

    public String getNome(){return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getGravidade(){return gravidade;}

    public double getDensidade(){return densidade;}

    public double getDensidadeCentral(){return densidadeCentral;}
}