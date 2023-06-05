package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();

        Conto conto = new Conto(nomeUtente);

        System.out.println("Benvenuto, " + conto.getNomeProprietario());
        System.out.println("Informazioni conto: " + conto.getInformazioniConto());

        boolean continua = true;
        while (continua) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Importo da versare: ");
                    double importoVersato = scanner.nextDouble();
                    conto.versa(importoVersato);
                    System.out.println("Saldo attuale: " + conto);
                    break;
                case 2:
                    System.out.print("Importo da prelevare: ");
                    double importoPrelevato = scanner.nextDouble();
                    conto.preleva(importoPrelevato);
                    System.out.println("Saldo attuale: " + conto);
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
