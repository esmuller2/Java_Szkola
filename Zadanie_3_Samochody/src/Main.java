import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        Samochod[] samochody = new Samochod[5];

        samochody[0] = new Samochod("Audi", 200, 2018 , "SWD45534", "Młynarczyk");
        samochody[1] = new Samochod("Renoult", 220, 2010 , "SJZ94434", "Święty");
        samochody[2] = new Samochod("BWM", 120, 2011 , "PO4534", "Baran");
        samochody[3] = new Samochod("Fiat", 60, 2020 , "SZO34242", "Grochowski");
        samochody[4] = new Samochod("ZiS", 293, 2017 , "SRC34234", "Ptyś");

        // Polecenie 1

        System.out.print("Podaj Numer Rejestracyjny: ");
        String podany_numer = scanner.next();

        if(podany_numer.equals(samochody[0].numer_rej))
        {
            samochody[0].Wyswietl_Samochod();
        }
        else if(podany_numer.equals(samochody[1].numer_rej))
        {
            samochody[1].Wyswietl_Samochod();
        }
        else if(podany_numer.equals(samochody[2].numer_rej))
        {
            samochody[2].Wyswietl_Samochod();
        }
        else if(podany_numer.equals(samochody[3].numer_rej))
        {
            samochody[3].Wyswietl_Samochod();
        }
        else if(podany_numer.equals(samochody[4].numer_rej))
        {
            samochody[4].Wyswietl_Samochod();
        } else {
            System.out.println("Podano Niepoprawny numer rejestracyjny!");
        }

        System.out.println();

        // Polecenie 2

        for (Samochod samochod : samochody)
        {
            samochod.Wyswietl_Samochod();
        }

        // Polecenie 3

        System.out.print("Podaj Numer Rejestracyjny: ");
        String podany_numer_r = scanner.next();

        System.out.print("Podaj nowe nazwisko: ");
        String nazwisko = scanner.next();

        aktualizujNazwisko(samochody, podany_numer_r, nazwisko);

        for (Samochod samochod : samochody)
        {
            samochod.Wyswietl_Samochod();
        }

        // polecenie 4

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        System.out.println("Samochody wyprodukowane przed podanym rokiem: ");
        wyswietlSamochodyPrzedRokiem(samochody, rok);


        // Polecenie 5

    }


    public static void aktualizujNazwisko(Samochod[] samochody, String numerRej, String noweNazwisko) {
        for (Samochod samochod : samochody) {
            if (samochod.numer_rej.equals(numerRej)) {
                samochod.ustawNazwisko(noweNazwisko);
                System.out.println("Nazwisko zaktualizowane dla numeru rejestracyjnego: " + numerRej);
                return;
            }
        }
        System.out.println("Nie znaleziono samochodu z numerem rejestracyjnym: " + numerRej);
    }

    public static void wyswietlSamochodyPrzedRokiem(Samochod[] samochody, int rok) {
        boolean znaleziono = false;
        for (Samochod samochod : samochody) {
            if (samochod.rok_produkcji < rok) {
                samochod.Wyswietl_Samochod();
                znaleziono = true;
            }
        }

        if (!znaleziono) {
            System.out.println("Nie znaleziono samochodów wyprodukowanych przed rokiem " + rok + ".");
        }
    }

}
