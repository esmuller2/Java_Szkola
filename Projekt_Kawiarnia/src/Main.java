import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Podaj ilość opcji w Menu [1-10]: ");
            int ilosc = scanner.nextInt();

            Menuu[] opcje = new Menuu[ilosc];

            if(ilosc > 10 || ilosc < 1)
            {
                System.out.println("Podano błędną liczbę!");
            }
            else
            {
                for(int i = 0; i < ilosc; i++)
                {

                    System.out.print("Nazwa produktu: ");
                    String produkt = scanner.next();
                    System.out.print("Czas Oczekiwania: ");
                    int czas = scanner.nextInt();
                    System.out.print("Cena: ");
                    int cena = scanner.nextInt();
                    System.out.print("Ocena produktu: ");
                    String ocena = scanner.next();

                    opcje[i] = new Menuu(produkt, czas, cena, ocena);

                }
            }

            for(Menuu x : opcje)
            {
                x.Wyswietl_Menu();
            }

            break;

        }

    }

}
