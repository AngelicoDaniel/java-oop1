package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    // CONSTANTS

    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    // CONSTRUCTORS
    public Conto(String nomeProprietario) {
        this.numeroConto = GenerateRandomAccountNumber();
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

    // METHODS
    public void versa(double importo) {
        saldo += importo;
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
        } else {
            System.out.println("Saldo non sufficiente");
        }
    }

    public String getInformazioniConto() {
        return "Numero conto: " + numeroConto + "\n" +
                "Proprietario: " + nomeProprietario + "\n" +
                "Saldo: " + saldo;
    }

    private int GenerateRandomAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
