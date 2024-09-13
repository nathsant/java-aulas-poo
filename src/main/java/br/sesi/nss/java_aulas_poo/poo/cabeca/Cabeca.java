package br.sesi.nss.java_aulas_poo.poo.cabeca;

public class Cabeca {
    public Orelha orelha;
    public Nariz nariz;
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Boca boca;

    public Cabeca() {
        this.olhoEsquerdo = new Olho();
        this.olhoDireito = new Olho();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
