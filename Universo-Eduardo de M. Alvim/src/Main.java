public class Main {
    public static void main(String[] args) {

        Planeta terra  = new Planeta();

        terra.setMassa((5.972 * Math.pow(10, 24)));
        terra.setRaio((6.371 * Math.pow(10, 6)));
        terra.Gravidade(terra.getMassa(), terra.getRaio());
        terra.Densidade(terra.getMassa(), terra.getRaio());
        terra.DensidadeCentral(terra.getDensidade(), terra.getK());
        terra.Tipo();
        terra.Habitabilidade();

        System.out.println(terra.getGravidade());
        System.out.println(terra.getDensidade());
        System.out.println(terra.getDensidadeCentral());
        System.out.println(terra.getTipoObjeto());
        System.out.println(terra.getHabitabilidade());


        Estrela sol = new Estrela();

        sol.setMassa((1.989 * Math.pow(10, 30)));
        sol.setRaio((6.963 * Math.pow(10, 8)));
        sol.Gravidade(sol.getMassa(), sol.getRaio());
        sol.Densidade(sol.getMassa(), sol.getRaio());
        sol.DensidadeCentral(sol.getDensidade(), sol.getK());
        sol.TemperaturaNuclear((1.989 * Math.pow(10, 30)), (6.963 * Math.pow(10, 8)));

        System.out.println(sol.getGravidade());
        System.out.println(sol.getDensidade());
        System.out.println(sol.getDensidadeCentral());
        System.out.println(sol.getTipoObjeto());
        System.out.println(sol.getTemperatura());

        Buraco_negro sargitarius = new Buraco_negro();

        sargitarius.setRaioSchwarzschild((1.2 * Math.pow(10, 10)));
        sargitarius.Gravidade(sargitarius.getMassa(), sargitarius.getRaioSchwarzschild());
        sargitarius.Densidade(sol.getMassa(), sol.getRaio());
        sargitarius.DensidadeCentral(sol.getDensidade(), sol.getK());

        System.out.println(sargitarius.getGravidade());
        System.out.println(sargitarius.getDensidade()); // densidade aparente
        System.out.println(sargitarius.getTipoObjeto());
    }
}
