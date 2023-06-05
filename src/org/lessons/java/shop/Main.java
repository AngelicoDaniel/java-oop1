package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Prodotto 1", "Descrizione prodotto 1", 15.0, 20.0);

        System.out.println("Codice prodotto: " + prodotto1.getCodice());
        System.out.println("Nome prodotto: " + prodotto1.getNome());
        System.out.println("Descrizione prodotto: " + prodotto1.getDescrizione());
        System.out.println("Prezzo prodotto: " + prodotto1.getPrezzo());
        System.out.println("IVA prodotto: " + prodotto1.getIva());
        System.out.println("Prezzo con IVA: " + prodotto1.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto1.getNomeEsteso());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Modifica nome prodotto: ");
        String newName = scanner.nextLine();
        prodotto1.setNome(newName);


        System.out.println("Modifica descrizione prodotto: ");
        String newDescription = scanner.nextLine();
        prodotto1.setDescrizione(newDescription);

        System.out.println("Modifica prezzo prodotto: ");
        int newPrice = scanner.nextInt();
        prodotto1.setPrezzo(newPrice);

        System.out.println("Modifica IVA prodotto: ");
        int newIVA = scanner.nextInt();
        prodotto1.setIva(newIVA);


        System.out.println("Nome prodotto modificato: " + newName);
        System.out.println("Descrizione prodotto modificata: " + newDescription);
        System.out.println("Prezzo prodotto modificato: " + newPrice);
        System.out.println("IVA modificata: " + newIVA);
        System.out.println("Prezzo con IVA modificata: " + prodotto1.getPrezzoConIva());
        System.out.println("Nome esteso modificato: " + prodotto1.getNomeEsteso());

        scanner.close();


        Prodotto prodotto2 = new Prodotto("Prodotto 2", "Descrizione prodotto 2", 30.0, 70.0);

        System.out.println("Codice prodotto: " + prodotto2.getCodice());
        System.out.println("Nome prodotto: " + prodotto2.getNome());
        System.out.println("Descrizione prodotto: " + prodotto2.getDescrizione());
        System.out.println("Prezzo prodotto: " + prodotto2.getPrezzo());
        System.out.println("IVA prodotto: " + prodotto2.getIva());
        System.out.println("Prezzo con IVA: " + prodotto2.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto2.getNomeEsteso());
    }
}
