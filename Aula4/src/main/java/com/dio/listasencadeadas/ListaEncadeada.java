package com.dio.listasencadeadas;

public class ListaEncadeada<T> {

    //referencia do inicio da lista
    private No<T> refList;
    //inteiro que armazena o numero de nos da lista
    private int listSize;

    public ListaEncadeada() {
        refList = null;
        listSize = 0;
    }

    //adicina um novo objeto no final da fila
    private void addTail(T object){
        No<T> novoNo = new No<>(object);

        //Verifica se a fila nao esta vazia, caso esteja refList vai apontar para o novo no
        if(!isEmpty()){
            No<T> ultimoNo = refList;
            //Percorrendo a lista para encontrar o ultimo no
            while(ultimoNo.getRefNo() != null){
                ultimoNo = ultimoNo.getRefNo();
            }
            //O ultimo no vai apontar para o novo no
            ultimoNo.setRefNo(novoNo);
        } else {
            refList = novoNo;
        }
        listSize++;
    }

    //insere no inicio da lista
    private void addHead(T object){
        No<T> novoNo = new No<>(object);
        //O novo no vai apontar para o no que refLista que por sua vez vai apontar para o novo no
        novoNo.setRefNo(refList);
        refList = novoNo;
        listSize++;
    }

    //Adicionando na lista sem passar o indice, por padrao vai ser no fim da lista
    public void add(T object){
        addTail(object);
    }

    //adicionando um no em uma determinada posicao
    public void add(int index, T object){

        //verifica se o indice e zero, caso seja utiliza o metodo addHead
        if(index == 0) {
            addHead(object);
        //verifica se o indice e do tamanho da lista, caso seja utiliza o metodo addTail
        } else if(index == listSize){
            addTail(object);
        //verifica se o indice e menor que o tamanho da lista
        } else if(!(index > listSize)){

            No<T> novoNo = new No<>(object);
            No<T> noAnterior = refList;

            //percorre a lista ate achar o no anterior ao referente ao indice
            for(int i = 0; i < index-1; i++){
                noAnterior = noAnterior.getRefNo();
            }

            //o novo no aponta para o no que o anterior aponta e o anterior aponta para o novo no
            novoNo.setRefNo(noAnterior.getRefNo());
            noAnterior.setRefNo(novoNo);
            listSize++;
        }
    }

    //remove um no a partir de um objeto
    public void remove(T object){
        //busca o indice do objeto
        int index = getIndex(object);
        //caso o index seja -1, -1 significa que o objeto nao esta na lista
        if(index != -1){

            No<T> noAnterior = refList;
            No<T> noRemovido;

            //verifica se o index e 0
            if(index == 0){

                //para indice 0 o no removido recebe a referencia de refList e refList o proximo no
                noRemovido = refList;
                refList = noRemovido.getRefNo();

            } else {

                //caso o no nao esteja no inicio, percorre a lista para achar o no a ser percorrido, verificando se os objetos sao iguaos
                while( !(noAnterior.getRefNo().getObject().equals(object)) ){
                    noAnterior = noAnterior.getRefNo();
                }

                //o no anterior recebe a referencia do no apos o removido
                noRemovido = noAnterior.getRefNo();
                noAnterior.setRefNo(noRemovido.getRefNo());
            }
            //as referencias do no removido recebe null
            noRemovido.setRefNo(null);
            noRemovido = null;
            listSize--;
        }
    }

    //retorna um objeto a partir de um idice
    public T get(int index){
        return getNo(index).getObject();
    }

    //retorna um no a partir de um indice
    public No<T> getNo(int index){

        validaIndex(index);
        No<T> no = refList;
        for(int i = 0; i < index; i++){
            no = no.getRefNo();
        }
        return no;

    }

    //retorna um indice a partir de um objeto
    public int getIndex(T object){

        int index = 0;
        No<T> noAuxiliar = refList;
        while( !(noAuxiliar.getObject().equals(object)) ){
            noAuxiliar = noAuxiliar.getRefNo();
            index++;
            if( noAuxiliar == null){
                index = -1;
                break;
            }
        }
        return index;
    }

    //verifica se um objeto esta na lista
    public boolean contains(T objeto){
        No<T> noAuxiliar = refList;
        boolean contains = false;
        while(noAuxiliar != null){
            if(objeto.equals(noAuxiliar.getObject())){
                contains = true;
                break;
            }
            noAuxiliar = noAuxiliar.getRefNo();
        }
        return contains;
    }

    //verifica se a lista esta vazia
    public boolean isEmpty(){
        return refList == null;
    }

    //tamanho da lista
    public int size(){
        return listSize;
    }

    @Override
    public String toString() {

        String stringList = "refList -> ";
        if(!isEmpty()){
            No<T> noAuxiliar = refList;
            while(noAuxiliar != null){
                stringList += "{"+noAuxiliar.getObject() + "} -> ";
                noAuxiliar = noAuxiliar.getRefNo();
            }

        }
        stringList += "null";

        return stringList;
    }

    //validacao de um indice, caso seja fora do range da lista dispara uma exception
    private void validaIndex(int index){
        if(index >= listSize){
            int ultimoIndex = index +1;
            throw new IndexOutOfBoundsException("Nao existe indice + "+index+" na lista. Ultimo indice = "+ultimoIndex);
        }
    }
}
