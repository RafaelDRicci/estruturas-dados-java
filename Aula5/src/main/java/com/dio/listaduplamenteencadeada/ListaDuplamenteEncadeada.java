package com.dio.listaduplamenteencadeada;

/**
 * Lista duplamente encadeada
 * @param <T>
 */
public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refPrimeiroNo;
    private  NoDuplo<T> refUltimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        refPrimeiroNo = null;
        refUltimoNo = null;
        tamanhoLista = 0;
    }

    /**
     * Verifica se a lista esta vazia
     * @return
     */
    public boolean isEmpty(){
        return (tamanhoLista == 0);
    }

    /**
     * Tamanho da lista
     * @return
     */
    public int size(){
        return tamanhoLista;
        /*
        int numeroNo = 0;
        NoDuplo<T> noAuxiliar = refPrimeiroNo;

        while(noAuxiliar != null){
            numeroNo++;
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return  numeroNo;

         */
    }

    /**
     * Recupera um no a partir de um indice
     * @param index
     * @return
     */
    private NoDuplo<T> getNo(int index){
        validaIndex(index);
        if(index == tamanhoLista-1) return refUltimoNo;

        NoDuplo<T> noRequesitado = refPrimeiroNo;

        for(int i = 0; i < index; i++){
            noRequesitado = noRequesitado.getNoProximo();
        }
        return noRequesitado;
    }

    /**
     * recupera um elemento a partir de um indice
     * @param index
     * @return
     */
    public T get(int index){
        return getNo(index).getConteudo();
    }

    /**
     * Adiciona no final da lista
     * @param elemento
     */
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        if(size() == 0){
            refPrimeiroNo = novoNo;
            refUltimoNo = novoNo;
        } else {
            refUltimoNo.setNoProximo(novoNo);
            novoNo.setNoAnterior(refUltimoNo);
            refUltimoNo = novoNo;
        }
        tamanhoLista++;
    }

    /**
     * Adiciona um elemento em uma determinada posicao
     * @param index
     * @param elemento
     */
    public void add(int index, T elemento){

        //Verifica se o index eh maior que a lista
        if(index > size()) throw new IndexOutOfBoundsException("Index maior que o tamanho da lista");
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        //verifica se o index eh do tamanho da lista, caso seja adiciona no final da lista
        if(index == size()) {
            add(elemento);
        //verifica se o index eh zero, ou seja, insere no inicio da lista
        } else if(index == 0){
            novoNo.setNoProximo(refPrimeiroNo);
            refPrimeiroNo.setNoAnterior(novoNo);
            refPrimeiroNo = novoNo;
            tamanhoLista++;
        //em ultimo caso insere no meio da lista
        } else {
            NoDuplo<T> proximo = getNo(index);
            NoDuplo<T> anterior = proximo.getNoAnterior();
            novoNo.setNoProximo(proximo);
            novoNo.setNoAnterior(anterior);
            proximo.setNoAnterior(novoNo);
            anterior.setNoProximo(novoNo);
            tamanhoLista++;
        }
    }

    /**
     * Remove um elemento da lista a partir de um index
     * @param index
     */
    public void remove(int index){
        validaIndex(index);
        //utiliza o getNo para pegar a referencia do no que vai ser removido
        NoDuplo<T> auxiliar = getNo(index);

        //verifica se o no a ser removido e o primeiro no da lista
        if(auxiliar.getNoAnterior() == null){
            //case seja, a referencia do primeiro no da lista vai apontar para o proximo
            refPrimeiroNo = auxiliar.getNoProximo();
        } else {
            //caso nao seja o no anterior ao que vai ser removido vai aponta para o proximo
            auxiliar.getNoAnterior().setNoProximo(auxiliar.getNoProximo());
        }

        //verifica se o no a ser removido eh o ultimo
        if(auxiliar.getNoProximo() == null){
            //case seja o ultimo no vai aponta para o anterior ao que vai ser removido
            refUltimoNo = auxiliar.getNoAnterior();
        } else {
            //caso nao seja o proximo vai apontar para anterior ao que vai ser removido
           auxiliar.getNoProximo().setNoAnterior(auxiliar.getNoAnterior());
        }
        tamanhoLista--;
        auxiliar.setNoAnterior(null);
        auxiliar.setNoProximo(null);
    }

    public void validaIndex(int index){
        if(isEmpty()) throw new IndexOutOfBoundsException("A lista esta vazia");
        if( !(index < tamanhoLista) )
            throw new IndexOutOfBoundsException("Nao Existe indice "+index+" na lista, o ultimo e "+(tamanhoLista-1));
    }

    @Override
    public String toString() {
        String stringLista = "PrimeiroNo -> ";
        NoDuplo<T> auxiliar = refPrimeiroNo;
        while(auxiliar != null){
            stringLista += "{"+
                    " ["+auxiliar.getNoAnterior() +" <- anterior]"+
                    " [atual = " + auxiliar.getConteudo() +"]"+
                    " [proximo -> " + auxiliar.getNoProximo() +"]"
                    +"} ";
            auxiliar = auxiliar.getNoProximo();
        }
        stringLista += " <- UltimoNo";
        return stringLista;
    }
}
