//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Astro terra  = new Astro();

        terra.massa = (5.972 * Math.pow(10, 24));
        terra.raio = (6.371 * Math.pow(10, 6));
        terra.Gravidade(terra.massa, terra.raio);
        terra.Densidade(terra.massa, terra.raio);
        System.out.println(terra.gravidade);
        System.out.println(terra.densidade);
    }
}
