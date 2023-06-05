package org.lessons.java.bank;

public class Conto {
    // CONSTANTS

    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    // CONSTRUCTORS
    public Conto(int numeroConto, String nomeProprietario, double saldo) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
    }

    // GETTER SETTERS
    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario() {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }
}
