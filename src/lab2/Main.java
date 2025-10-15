package lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LISTA lista = new LISTA();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Câte mașini doriți să introduceți? ");
        int nrMasini = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nrMasini; i++) {
            System.out.print("Introduceți mașina " );
            String masina = scanner.nextLine();
            lista.addmasini(masina);
        }



        System.out.print("Câte animale doriți să introduceți? ");
        int nrAnimale = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nrAnimale; i++) {
            System.out.print("Introduceți animalul ");
            String animal = scanner.nextLine();
            lista.addanimale(animal);
        }

        lista.afiseaza();


        SET set = new SET();
        System.out.print("Câte numere doriți să introduceți? ");
        int nrNumere = scanner.nextInt();

        for (int i = 0; i < nrNumere; i++) {
            System.out.print("Introduceți numărul " + (i + 1) + ": ");
            int numar = scanner.nextInt();
            set.addnumere(numar);
        }

// Afișare după ce toate numerele sunt adăugate
        System.out.println("\n=== SETUL DE NUMERE ===");








        }
    }
