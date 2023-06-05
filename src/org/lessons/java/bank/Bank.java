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
        scanner.close();
    }
}
