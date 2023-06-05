package org.lessons.java.shop;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
