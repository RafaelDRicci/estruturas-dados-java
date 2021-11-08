package com.dio.listaduplamenteencadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noAnterior;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
        noAnterior = null;
        noProximo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
