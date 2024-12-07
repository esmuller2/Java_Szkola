public class Menuu {

    private String produkt;
    private int czas_oczekiwania;
    private int cena;
    private String ocena;

    public Menuu(String produkt, int czas_oczekiwania, int cena, String ocena)
    {

        this.produkt = produkt;
        this.czas_oczekiwania = czas_oczekiwania;
        this.cena = cena;
        this.ocena = ocena;

    }

    public void Wyswietl_Menu()
    {
        System.out.println();
        System.out.println("Nazwa Produktu: " + produkt + "\n" +
                        "Cena produktu: " + cena + " zł \n" +
                        "Czas oczekiwania: " + czas_oczekiwania + " minut \n" +
                        "Ocena klientów: " + ocena);
        System.out.println();
    }

}
