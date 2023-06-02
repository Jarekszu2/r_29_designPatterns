package creational_Builder.wojownik;

public class MainWojownik {
    public static void main(String[] args) {

        System.out.println();
        Wojownik woj = Wojownik.builder().alive(true).ileNaKlate(108).imieBabci("Hermenegilda").build();
        System.out.println(woj);

        System.out.println();
        Wojownik wojM = Wojownik.createWojMieszkoI();
        System.out.println(wojM);
    }
}
