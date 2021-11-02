package com.projetos.pilhas;

public class No<T> {

    private T conteudo;
    private No<T> noAbaixo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        noAbaixo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoAbaixo() {
        return noAbaixo;
    }

    public void setNoAbaixo(No<T> noAbaixo) {
        this.noAbaixo = noAbaixo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
