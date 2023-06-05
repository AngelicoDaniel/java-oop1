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

        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Versare una somma di denaro");
        System.out.println("2. Prelevare una somma di denaro");
        System.out.println("3. Uscire");
        System.out.println("Scelta: ");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Importo da versare: ");
                double importoVersato = scanner.nextDouble();
                conto.versa(importoVersato);
                System.out.println("Saldo attuale: " + conto.getInformazioniConto());
                break;
            case 2:
                System.out.println("Importo da prelevare: ");
                double importoPrelevato = scanner.nextDouble();
                conto.preleva(importoPrelevato);
                System.out.println("Saldo attuale: " + conto.getInformazioniConto());
                break;
            case 3:
                break;
        }

        scanner.close();
    }
}
