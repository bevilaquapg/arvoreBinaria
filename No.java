package com.seuprojeto;

public class No {
    char valor;
    No esquerda;
    No direita;

    public No(char valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }
}
