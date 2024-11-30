import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        while(true)
        {

            int ilosc_rzutow, wybor;

            System.out.println("1 - Rzut Kostką");
            System.out.println("2 - Wyjście z programu");
            System.out.println();
            System.out.print("Wybierz opcję: ");
            wybor = input.nextInt();

            switch (wybor)
            {

                case 1:
                    System.out.print("Podaj liczbę kostek do rzucenia <3,10>: ");
                    ilosc_rzutow = input.nextInt();

                    if((ilosc_rzutow < 3) || (ilosc_rzutow > 10))
                    {
                        System.out.println("Podaj liczbę z zakresu <3,10>");
                    }

                    int max = 6;
                    int min = 1;
                    int range = max - min + 1;
                    int[] liczby = new int[ilosc_rzutow];

                    for(int i = 0; i <= ilosc_rzutow; i++)
                    {
                        int liczba = (int)(Math.random() * range) + min;
                        liczby[i] = liczba;
                        System.out.println("Rzut " + (i + 1) + " : " + liczby[i]);
                    }

                case 2:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Podaj poprawną opcję!");
                    System.out.println("Proszę");
            }





        }

    }
}