package com.dio.listacircular;

public class No<T> {

    private No<T> proxNo;
    private T conteudo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        proxNo = null;
    }

    public No<T> getProxNo() {
        return proxNo;
    }

    public void setProxNo(No<T> refNo) {
        this.proxNo = refNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
