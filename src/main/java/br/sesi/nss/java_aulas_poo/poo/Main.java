package br.sesi.nss.java_aulas_poo.poo;

import br.sesi.nss.java_aulas_poo.poo.cabeca.Cabeca;
import br.sesi.nss.java_aulas_poo.poo.cabeca.Olho;

public class Main {

    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.cego = true;
        olho1.corIris = "azul";
        olho1.diametroOlho = 2.0f;

        Olho olho2 = new Olho();
        olho2.cego = false;
        olho2.corIris = "castanho";
        olho2.diametroOlho = 2.5f;

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = olho1;
        cabeca.olhoDireito = olho2;

        pessoa pessoa1 = new pessoa();

        pessoa1.cabeca = cabeca;

    }
}
