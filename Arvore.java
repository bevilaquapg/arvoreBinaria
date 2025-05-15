package com.seuprojeto;

import java.util.ArrayList;
import java.util.List;

public class Arvore {
    No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void construirArvoreEspecifica() {
        No noA = new No('a');
        No noB = new No('b');
        No noC = new No('c');
        No noD = new No('d');
        No noE = new No('e');
        No noF = new No('f');

        this.raiz = noA;

        noA.setEsquerda(noB);
        noA.setDireita(noC);

        noB.setEsquerda(noD);
        noB.setDireita(noE);

        noC.setDireita(noF);
    }

    public List<Character> travessiaEmOrdem() {
        List<Character> resultado = new ArrayList<>();
        travessiaEmOrdemRecursiva(this.raiz, resultado);
        return resultado;
    }

    private void travessiaEmOrdemRecursiva(No noAtual, List<Character> resultado) {
        if (noAtual != null) {
            travessiaEmOrdemRecursiva(noAtual.getEsquerda(), resultado);

            resultado.add(noAtual.getValor());

            travessiaEmOrdemRecursiva(noAtual.getDireita(), resultado);
        }
    }

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.construirArvoreEspecifica();

        System.out.println("Raiz da árvore: " + (arvore.raiz != null ? arvore.raiz.getValor() : "null"));

        System.out.print("Travessia em Ordem: ");
        List<Character> resultadoTravessia = arvore.travessiaEmOrdem();
        for (int i = 0; i < resultadoTravessia.size(); i++) {
            System.out.print(resultadoTravessia.get(i) + (i < resultadoTravessia.size() - 1 ? "," : ""));
        }
        System.out.println();
    }
}
