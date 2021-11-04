package com.dio.filas;

public class Fila<T> {

    private No<T> refNo;

    public Fila() {
        this.refNo = null;
    }

    public void enqueue(T objeto){
        No<T> no = new No<>(objeto);
        no.setRefNo(refNo);
        this.refNo = no;
    }

    public T dequeue(){
        if(!isEmpyt()){
            No noAnterior = refNo;
            No noInicial = refNo;

            while (noInicial.getRefNo() != null){

                noAnterior = noInicial;
                noInicial = noInicial.getRefNo();

            }
            noAnterior.setRefNo(noInicial.getRefNo());
            if(noAnterior == noInicial){
                refNo = noAnterior.getRefNo();
            }
            return (T)noInicial.getObjeto();
        }
        return null;
    }

    public boolean isEmpyt(){
        return refNo == null;
    }

    public T first(){

        No primeiro = refNo;

        if(!isEmpyt()){

            while(primeiro.getRefNo() != null){
                primeiro = primeiro.getRefNo();
            }

            return (T)primeiro.getObjeto();

        }
        return null;
    }

    @Override
    public String toString() {

        No auxiliar = refNo;
        String stringFila = "";
        while(auxiliar != null){

            stringFila += auxiliar + "\n";
            auxiliar = auxiliar.getRefNo();

        }
        if(isEmpyt()) stringFila = "Fila Vazia";
        return stringFila;
    }
}
