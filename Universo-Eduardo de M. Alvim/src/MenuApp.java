import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {

    public static ArrayList<Astro> listaAstros = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Menu();
    }

    private static void Menu(){

        int opcao = -1;

        while (opcao != 0) {

            clearConsole();
            System.out.println("===== CRIADOR DE UNIVERSO =====\n");
            System.out.println("1 - Criar Astro");
            System.out.println("2 - Propriedades do Astro");
            System.out.println("3 - Lista de Objetos\n");
            System.out.println("0 - [Aniquilar Universo]\n");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            clearConsole();

            switch (opcao) {
                case 1:
                    CriarAstro();
                    Espera();
                    break;
                case 2:
                    System.out.println("Propriedades:");
                    ListarPropriedades();
                    break;
                case 3:
                    System.out.println("Listando...");
                    Espera();
                    clearConsole();
                    ListarAstros();
                    System.out.println("0 - Sair\n");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 0:
                    for(int i=0; i < 9; i++){System.out.println("::: ANIQUILANDO O UNIVERSO :::");}
                    System.out.println("::: ANIQUILANDO O UNIVERSO :::");
                    Espera();
            }
            System.out.println();
        }
    }

    private static void CriarAstro(){
        int opcao;

        System.out.println("Escolha um tipo de Astro:");
        System.out.println("1 - Asteroide");
        System.out.println("2 - Planeta");
        System.out.println("3 - Estrela");
        System.out.println("4 - Buraco Negro\n");
        System.out.println("0 -  Sair\n");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();
        clearConsole();

        switch (opcao) {
            case 1:
                CriarAsteroide();
                break;
            case 2:
                CriarPlaneta();
                break;
            case 3:
                CriarEstrela();
                break;
            case 4:
                CriarBuracoNegro();
                break;
            case 0:
                clearConsole();
                System.out.println("Voltando...");
                Espera();
                break;
        }
    }

    private static void CriarAsteroide(){
        double massaM;
        double raioM;
        boolean check;
        String nomeM;

        int opcao;
        Astro asteroide = new Asteroide();

        System.out.println("Insira a massa do objeto: ");
        massaM = scanner.nextDouble();
        scanner.nextLine();
        massaM = UnidadesMassa(massaM);
        asteroide.setMassa(massaM);
        System.out.println("Insira o raio do objeto: ");
        raioM = scanner.nextDouble();
        scanner.nextLine();
        raioM = UnidadesRaio(raioM);
        asteroide.setRaio(raioM);
        check = Verificacao(asteroide);
        if(!check){ return;}
        clearConsole();
        System.out.println("Possui Metais?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
            switch (opcao) {
                case 1: ((Asteroide) asteroide).possuiMetal = true;   break;
                case 2: ((Asteroide) asteroide).possuiMetal = false;  break;
            }
        clearConsole();
        System.out.println("Possui Água?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
            switch (opcao) {
                case 1: ((Asteroide) asteroide).possuiAgua = true;   break;
                case 2: ((Asteroide) asteroide).possuiAgua = false;  break;
            }
        clearConsole();
        System.out.println("Está perto de uma estrela?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        switch (opcao) {
            case 1: ((Asteroide) asteroide).temperaturaAlta = true;   break;
            case 2: ((Asteroide) asteroide).temperaturaAlta = false;  break;
        }
        System.out.println("Insira o nome do Astro: ");
        nomeM = scanner.nextLine();
        asteroide.setNome(nomeM);

        clearConsole();
        System.out.println("Asteroide criado com sucesso!");
        listaAstros.add(asteroide);
        Espera();
        clearConsole();
    }

    private static void CriarPlaneta(){
        double massaM;
        double raioM;
        boolean check;
        String nomeM;

        int opcao;
        Astro planeta = new Planeta();

        System.out.println("Insira a massa do objeto: ");
        massaM = scanner.nextDouble();
        scanner.nextLine();
        massaM = UnidadesMassa(massaM);
        planeta.setMassa(massaM);
        System.out.println("Insira o raio do objeto: ");
        raioM = scanner.nextDouble();
        scanner.nextLine();
        raioM = UnidadesRaio(raioM);
        planeta.setRaio(raioM);
        check = Verificacao(planeta);
        if(!check){ return;}
        clearConsole();
        System.out.println("Possui Água?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
            switch (opcao) {
                case 1: ((Planeta) planeta).possuiAgua = true;  break;
                case 2: ((Planeta) planeta).possuiAgua = false; break;
            }
        clearConsole();
        System.out.println("Está na area habitável?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
            switch (opcao){
                case 1: ((Planeta) planeta).areaHabitavelEstelar = true; break;
                case 2: ((Planeta) planeta).areaHabitavelEstelar = false; break;
            }
        clearConsole();
        System.out.println("Insira o nome do Astro: ");
        nomeM = scanner.nextLine();
        planeta.setNome(nomeM);

        clearConsole();
        System.out.println("Planeta formado com sucesso!");
        listaAstros.add(planeta);
        Espera();
        clearConsole();
    }

    private static void CriarEstrela(){
        double massaM;
        double raioM;
        boolean check = false;
        String nomeM;

        Astro estrela = new Estrela();

        System.out.println("Insira a massa do objeto: ");
        massaM = scanner.nextDouble();
        scanner.nextLine();
        massaM = UnidadesMassa(massaM);
        estrela.setMassa(massaM);
        System.out.println("Insira o raio do objeto: ");
        raioM = scanner.nextDouble();
        scanner.nextLine();
        raioM = UnidadesRaio(raioM);
        estrela.setRaio(raioM);
        check = Verificacao(estrela);
        if(!check){ return;}
        System.out.println("Insira o nome do Astro: ");
        nomeM = scanner.nextLine();
        estrela.setNome(nomeM);

        clearConsole();
        System.out.println("Estrela formada com sucesso!");
        listaAstros.add(estrela);
        Espera();
        clearConsole();
    }

    private static void CriarBuracoNegro(){
        double raioM;
        String nomeM;

        Astro buraco_negro = new Buraco_negro();

        System.out.println("Insira o raio do objeto: ");
        raioM = scanner.nextDouble();
        scanner.nextLine();
        raioM = UnidadesRaio(raioM);
        buraco_negro.setRaio(raioM);
        clearConsole();
        System.out.println("Insira o nome do Astro: ");
        nomeM = scanner.nextLine();
        buraco_negro.setNome(nomeM);

        clearConsole();
        System.out.println("Buraco Negro formado com sucesso!");
        listaAstros.add(buraco_negro);
        Espera();
        clearConsole();
    }


    public static double UnidadesMassa(double massa){
        int opcao;

        clearConsole();
        System.out.println("1 - Massas Ceresinas");
        System.out.println("2 - Massas Terrestres");
        System.out.println("3 - Massas Solares");
        System.out.println("4 - Massas Negras");
        System.out.println("0 - Sair\n");
        System.out.println("Escolha uma unidade: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch  (opcao) {
            case 1:
                massa = Astro.MassaCeres(massa);
                break;
            case 2:
                massa = Astro.MassaTerra(massa);
                break;
            case 3:
                massa = Astro.MassaSolar(massa);
                break;
            case 4:
                massa = Astro.MassaNegra(massa);
                break;
            case 0:
                break;
        }
        clearConsole();
        return massa;
    }

    public static double UnidadesRaio(double raio){
        int opcao;
        clearConsole();
        System.out.println("1 - Kilometros");
        System.out.println("2 - Raios Terrestres");
        System.out.println("3 - Raios Solares");
        System.out.println("4 - Unidade Astronômica");
        System.out.println("0 - Sair\n");
        System.out.println("Escolha uma unidade: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch  (opcao) {
            case 1:
                raio = Astro.RaioKilometros(raio);
                break;
            case 2:
                raio = Astro.RaioTerra(raio);
                break;
            case 3:
                raio = Astro.RaioSolar(raio);
                break;
            case 4:
                raio = Astro.UA(raio);
                break;
            case 0:
                break;
        }
        clearConsole();
        return raio;
    }

    public static void Propriedades(Astro astroSelecionado){
        int opcao;

        astroSelecionado.PropriedadesGerais(astroSelecionado);
        switch (astroSelecionado) {
            case Asteroide astro -> astro.PropriedadesEspecificas();
            case Planeta astro -> astro.PropriedadesEspecificas();
            case Estrela astro -> astro.PropriedadesEspecificas();
            case Buraco_negro astro -> astro.PropriedadesEspecificas();
            default -> {}
        }

        System.out.println("=============================");
        System.out.println("Sair - 0\n");
        opcao = scanner.nextInt();
        scanner.nextLine();
        if(opcao == 0){ return;}
    }

    public static void ListarAstros(){
        if(listaAstros.isEmpty()){ System.out.println("Não há astros no seu Universo.");} else

            System.out.println( "======Lista de Astros======");
        for(int i = 0; i < listaAstros.size(); i++){
            Astro astro = listaAstros.get(i);
            System.out.printf("%d- %s (%s)\n", i, astro.getNome(), astro.getClass().getSimpleName());
        }
        System.out.println("=============================");
    }

    public static void ListarPropriedades(){

        ListarAstros();
        System.out.println("Escolha um Astro: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if(escolha >= 0 && escolha < listaAstros.size()) {
            Astro astroSelecionado = listaAstros.get(escolha);
            Propriedades(astroSelecionado);
        }
    }

    public static boolean Verificacao(Astro astroSelecionado) {

        String tipagem = astroSelecionado.getClass().getSimpleName();
        astroSelecionado.Densidade(astroSelecionado.getMassa(), astroSelecionado.getRaio());
        if (tipagem.equals(astroSelecionado.tipoClasse))
        {return true;}
        else{
                clearConsole();
                System.out.print("Dados não conferem com o objeto.\nTente novamente.");
                Espera();
                return false;
            }
        }

    public static void Espera(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {}
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}