public class Samochod
{

    public String marka;
    public int pojemnosc_silnika;
    public int rok_produkcji;
    public String numer_rej;
    public String nazwisko_w;

    Samochod(String marka, int pojemnosc_silnika, int rok_produkcji, String numer_rej, String nazwisko_w)
    {
        this.marka = marka;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.rok_produkcji = rok_produkcji;
        this.numer_rej = numer_rej;
        this.nazwisko_w = nazwisko_w;
    }

    public void Wyswietl_Samochod()
    {
        System.out.println();
        System.out.println("Marka Samochodu: " + marka + "\n" +
                           "Pojemność Silnika: " + pojemnosc_silnika + " l \n" +
                           "Rok Produkcji: " + rok_produkcji + "\n" +
                           "Numer Rejestracyjny: " + numer_rej + "\n" +
                           "Nazwisko Właściciela: " + nazwisko_w);
        System.out.println();
    }

    public void ustawNazwisko(String nowe_n)
    {
        this.nazwisko_w = nowe_n;
    }

}
