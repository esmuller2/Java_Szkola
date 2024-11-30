import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int wybor;

        while(true)
        {
            System.out.println();
            System.out.println("- - - - - Algorytmy - - - - -");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Merge Sort");
            System.out.println("3 - Quick Sort");
            System.out.println("4 - Insertion Sort");
            System.out.println("5 - Wyjście z programu");
            System.out.println();
            System.out.print("Wybierz Opcję: ");
            wybor = input.nextInt();

            switch(wybor)
            {

                case 1:

                    System.out.print("Podaj liczbę elementów w tablicy: ");
                    int n = input.nextInt();
                    int[] arr = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Podaj " + (i + 1) + " liczbę: ");
                        arr[i] = input.nextInt();
                    }

                    BubbleSort.bubbleSort(arr);

                    System.out.println("Posortowana tablica:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }

                    break;

                case 2:

                    System.out.print("Podaj liczbę elementów w tablicy: ");
                    int nM = input.nextInt();
                    int[] arr2 = new int[nM];

                    System.out.println("Podaj " + nM + " liczb:");
                    for (int i = 0; i < nM; i++) {
                        arr2[i] = input.nextInt();
                    }

                    MergeSort.mergeSort(arr2, 0, arr2.length - 1);

                    System.out.println("Posortowana tablica:");
                    for (int num : arr2) {
                        System.out.print(num + " ");
                    }

                    break;

                case 3:

                    System.out.print("Podaj liczbę elementów w tablicy: ");
                    int nQ = input.nextInt();
                    int[] arr3 = new int[nQ];

                    System.out.println("Podaj " + nQ + " liczb:");
                    for (int i = 0; i < nQ; i++) {
                        arr3[i] = input.nextInt();
                    }

                    QuickSort.quickSort(arr3, 0, arr3.length - 1);

                    System.out.println("Posortowana tablica:");
                    for (int num : arr3) {
                        System.out.print(num + " ");
                    }

                    break;

                case 4:

                    System.out.print("Podaj liczbę elementów w tablicy: ");
                    int nI = input.nextInt();
                    int[] arr4 = new int[nI];

                    System.out.println("Podaj " + nI + " liczb:");
                    for (int i = 0; i < nI; i++) {
                        arr4[i] = input.nextInt();
                    }

                    InsertSort.insertionSort(arr4);

                    System.out.println("Posortowana tablica:");
                    for (int num : arr4) {
                        System.out.print(num + " ");
                    }

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:

                    System.out.println("Podaj poprawną opcję!");

                    break;

            }


        }
    }

}
