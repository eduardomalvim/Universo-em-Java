//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Astro terra  = new Astro();

        terra.setMassa((5.972 * Math.pow(10, 24)));
        terra.setRaio((6.371 * Math.pow(10, 6)));
        terra.Gravidade(terra.getMassa(), terra.getRaio());
        terra.Densidade(terra.getMassa(), terra.getRaio());
        terra.DensidadeCentral(terra.getDensidade(), terra.getK());

        System.out.println(terra.getGravidade());
        System.out.println(terra.getDensidade());
        System.out.println(terra.getDensidadeCentral());
        System.out.println(terra.getTipoObjeto());

        Astro sol = new Astro();

        sol.setMassa((1.989 * Math.pow(10, 30)));
        sol.setRaio((6.963 * Math.pow(10, 8)));
        sol.Gravidade(sol.getMassa(), sol.getRaio());
        sol.Densidade(sol.getMassa(), sol.getRaio());
        sol.DensidadeCentral(sol.getDensidade(), sol.getK());

        System.out.println(sol.getGravidade());
        System.out.println(sol.getDensidade());
        System.out.println(sol.getDensidadeCentral());
        System.out.println(sol.getTipoObjeto());
    }
}
