public class Main {
    public static void main(String[] args) {

        // Queria melhorar esse codigo muito mais, adicionando um menu para cadastro de objetos mas o tempo não deu :/

        Asteroide ceres = new Asteroide();

        ceres.setMassa((9.4 * Math.pow(10, 20)));
        ceres.setRaio((4.73 * Math.pow(10, 5)));
        ceres.Gravidade(ceres.getMassa(), ceres.getRaio());
        ceres.Densidade(ceres.getMassa(), ceres.getRaio());
        ceres.DensidadeCentral(ceres.getDensidade(), ceres.k);
        ceres.PossuiCalda();

        System.out.println("Asteroide: Ceres");
        System.out.println("Força gravitacional: " + ceres.getGravidade() + " m/s²");
        System.out.println("Densidade Média: " + ceres.getDensidade() + " kg/m³");
        System.out.println("Densidade do Nucleo: " + ceres.getDensidadeCentral() + " kg/m³");
        System.out.println("Classe: " + ceres.tipoObjeto);
        System.out.println();

        Planeta terra  = new Planeta();

        terra.setMassa((5.972 * Math.pow(10, 24)));
        terra.setRaio((6.371 * Math.pow(10, 6)));
        terra.Gravidade(terra.getMassa(), terra.getRaio());
        terra.Densidade(terra.getMassa(), terra.getRaio());
        terra.DensidadeCentral(terra.getDensidade(), terra.k);
        terra.Tipo();
        terra.Habitabilidade();

        System.out.println("Planeta: Terra");
        System.out.println("Força gravitacional: " + terra.getGravidade() + " m/s²");
        System.out.println("Densidade Média: " + terra.getDensidade() + " kg/m³");
        System.out.println("Densidade do Nucleo: " + terra.getDensidadeCentral() + " kg/m³");
        System.out.println("Classe: " + terra.tipoObjeto);
        System.out.println("Habitavel: " + terra.getHabitabilidade());
        System.out.println();


        Estrela sol = new Estrela();

        sol.setMassa((1.989 * Math.pow(10, 30)));
        sol.setRaio((6.963 * Math.pow(10, 8)));
        sol.Gravidade(sol.getMassa(), sol.getRaio());
        sol.Densidade(sol.getMassa(), sol.getRaio());
        sol.DensidadeCentral(sol.getDensidade(), sol.k);
        sol.TemperaturaNuclear((1.989 * Math.pow(10, 30)), (6.963 * Math.pow(10, 8)));

        System.out.println("Estrela: Sol");
        System.out.println("Força Gravitacional: " + sol.getGravidade() + " m/s²");
        System.out.println("Densidade Média: " + sol.getDensidade() + " kg/m³");
        System.out.println("Densidade do Nucleo: " + sol.getDensidadeCentral() +" kg/m³");
        System.out.println("Classe: " + sol.tipoObjeto);
        System.out.println("Temperatura: " + sol.getTemperatura());
        System.out.println();

        Buraco_negro sargitarius = new Buraco_negro();

        sargitarius.setRaio((1.2 * Math.pow(10, 10)));
        sargitarius.MassaBuracoNegro(sargitarius.getRaio());
        sargitarius.Gravidade(sargitarius.getMassa(), sargitarius.getRaio());
        sargitarius.DensidadeAparente(sargitarius.getMassa(), sargitarius.getRaio());

        System.out.println("Buraco Negro: Sargitarius A*");
        System.out.println("Força Gravitacional: " + sargitarius.getGravidade() + " m/s²");
        System.out.println("Densidade Média: " + sargitarius.getDensidadeAparente() + " kg/m³");
        System.out.println("Densidade do Nucleo: Infinita");
        System.out.println("Classe: " + sargitarius.tipoObjeto);
    }
}
