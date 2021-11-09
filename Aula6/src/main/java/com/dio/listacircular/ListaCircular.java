package com.dio.listacircular;

/**
 * Lista encadeada circular
 * @param <T>
 */
public class ListaCircular<T> {

    //No inicial da lista e o numero de elementos
    private No<T> inicioLista;
    private int tamanhoLista;

    public ListaCircular() {
        this.inicioLista = null;
        tamanhoLista = 0;
    }

    /**
     * Verifica se a lista esta vazia
     * @return
     */
    public boolean isEmpty(){
        return tamanhoLista == 0;
    }

    /**
     * Retorna o numero de elementos na lista
     * @return
     */
    public int size(){
        return tamanhoLista;
    }

    /**
     * Retorna um no em um indice, aceita indices maior que o tamanho da lista
     * @param index
     * @return
     */
    private No<T> getNo(int index){
        if(!isEmpty()){

            No<T> auxiliar = inicioLista;
            for(int i = 0; i < index; i++){

                auxiliar = auxiliar.getProxNo();

            }
            return auxiliar;
        }
        return null;
    }

    /**
     * Retorna uma elemento da lista dado um indice. Aceita indices maior que o tamanho da lista por conta da natureza
     * circula; uma  busca vai por um indice maior que a lista vai ser percorrida toda a lista e volta para o primeiro
     * elemento, por exemplo: Em um busca pelo elemento 6 em um lista com 4 elementos, o elemento retornado vai ser equivalente
     * ao elemento da posicao 1.
     * @param index
     * @return
     */
    public T get(int index){
        return getNo(index).getConteudo();
    }

    /**
     * Retorna a head da lista (ultimo elemento)
     * @return
     */
    public No<T> getHead(){
        if(!isEmpty()){
            if(tamanhoLista == 0) return inicioLista;
            return getNo(tamanhoLista-1);
        }
        return null;
    }

    /**
     * Retorna a tail da lista (primeiro elemento)
     * @return
     */
    public No<T> getTail(){
        if(!isEmpty()) return inicioLista;
        return null;
    }

    /**
     * Remove um elemento por meio de um indice, tambem aceita indices maiores que o numero de elementos da lista
     * @param index
     */
    public void remove(int index){

        index = index%tamanhoLista;

        No<T> removido = getNo(index);
        if(removido != null){

            //Verifica a posicao 0
            if( index == 0){

                //A head (ultimo elemento) vai aponta para o segundo elemento
                getHead().setProxNo(removido.getProxNo());
                //A referencia de inicio da lista tambem para o segundo elemento
                inicioLista = removido.getProxNo();
                tamanhoLista--;

            //Caso o elemento removido nao seja o primeiro
            } else {

                //Busca o no anterior ao que vai ser removido (indice -1)
                No<T> anterior = getNo(index-1);
                //O no anterior aponta para o proximo do que sera removida
                anterior.setProxNo(removido.getProxNo());
                removido.setProxNo(null);
                tamanhoLista--;
            }
        }
    }

    /**
     * Adiciona um novo elemento na lista em uma determinada posicao (indice)
     * @param index
     * @param elemento
     */
    public void add(int index, T elemento){

        index = reajustaIndex(index);

        //Criacao de um novo no
        No<T> novoNo = new No<>(elemento);
        //Verifica se a lista esta vazia
        if(isEmpty()){
            //caso esteja a referencia da lista vai apontar para o novo no
            inicioLista = novoNo;
            //A referencia de proximo no do nvo no vai apontar para ele mesmo
            novoNo.setProxNo(novoNo);

        //Caso nao esteja vazia mas o indice seja 0
        } else if ( index == 0 ){

            //O novo no vai apontar para o inicio da lista
            novoNo.setProxNo(inicioLista);
            //O inicio da lista vai apontar para o novo no
            inicioLista = novoNo;
            //O ultimo no(head) tambem vai apontar para o novo no
            getNo(tamanhoLista).setProxNo(novoNo);
        //Caso a lista nao esteja vazia nem indice equivalente a 0
        } else {

            //Busca o no anterior
            No<T> anterior = getNo(index-1);
            //O novo no vai apontar para o proximo do anterior
            novoNo.setProxNo(anterior.getProxNo());
            //O anterior vai apontar para o novo no
            anterior.setProxNo(novoNo);

        }
        tamanhoLista++;
    }

    private int reajustaIndex(int index){
        //Reajusta o indice, caso seja uma posicao maior que o tamanho+1, pois caso seja = tamanho da lista o elemento vai ser inserido no final
        if(!isEmpty() && index >= (tamanhoLista+1)) {
            //O indice recebe o resto da divisao dele mesmo pelo tamanho+1
            return index % (tamanhoLista + 1);
        }
        return index;
    }

    /**
     * Metodo muito semenlhante que o toString. Percorre toda a lista e retorna uma String todos os nos junto com seu proximo.
     * @return
     */
    public String percorreLista(){
        No<T> auxiliar = inicioLista;
        String listaString = "InicioLista -> ";
        for(int i = 0; i < tamanhoLista; i++){
            listaString += " { Atual: "+auxiliar + ", Proximo: "+auxiliar.getProxNo()+" } ";
            auxiliar = auxiliar.getProxNo();
        }
        return listaString;
    }

    @Override
    public String toString() {
        No<T> auxiliar = inicioLista;
        String listaString = "Inicio -> ";
        for(int i = 0; i < tamanhoLista; i++){
            listaString += "{"+ auxiliar +"} -> ";
            auxiliar = auxiliar.getProxNo();
        }
        listaString += " Inicio";
        return listaString;
    }
}
