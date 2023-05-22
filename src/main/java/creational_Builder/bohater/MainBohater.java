package creational_Builder.bohater;

public class MainBohater {
    public static void main(String[] args) {
        // żeby użyć Buildera piszemy po kropce
        Bohater.Builder builder = new Bohater.Builder();

        Bohater bohater = builder.setImie("Zawisza").setIleNaKlate(108).setAlive(false).build();
        System.out.println(bohater);

        Bohater bohater2 = builder.setImie("Powała").setIleNaKlate(105).setAlive(false).build();
        System.out.println();
        System.out.println(bohater2.toString2());
    }
}
