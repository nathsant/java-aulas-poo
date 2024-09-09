package br.sesi.nss.java_aulas_poo.poo;

import br.sesi.nss.java_aulas_poo.poo.tronco.Tronco;
import br.sesi.nss.java_aulas_poo.poo.inferior.MembrosInferiores;
import br.sesi.nss.java_aulas_poo.poo.cabeca.Cabeca;

public class pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public pessoa() {
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
