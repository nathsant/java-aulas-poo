package br.sesi.nss.java_aulas_poo.poo.cabeca;

public class Cabeca {
    public Orelha orelha;
    public Nariz nariz;
    public Olho olho;
    public Boca boca;

    public Cabeca(){
        this.olho = new Olho();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
