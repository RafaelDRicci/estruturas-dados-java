package com.dio.filas;

public class No<T>{

    private T objeto;
    private No<T> refNo;

    public No(T objeto) {
        this.objeto = objeto;
        refNo = null;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return  objeto.toString();
    }
}
