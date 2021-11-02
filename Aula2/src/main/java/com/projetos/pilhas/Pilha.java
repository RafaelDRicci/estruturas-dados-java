package com.projetos.pilhas;


/**
 * Classe pilha implementada durante a aula teorica, antes das aulas que mostra como implementar por esse motivo
 * a classe apresenta diferenças, como por exemplo o metodo mostraTodaPilha implementado antes do toString. Após
 * assirtir as aula o toString também foi implementado
 * @param <T>
 */
public class Pilha<T>  {

    private No<T> topo;

    public Pilha() {
        topo = null;
    }

    public No<T> top(){
        return topo;
    }

    public No<T> pop(){
        if(!isEmpyt()){
            No<T> retorno = topo;
            topo = topo.getNoAbaixo();
            return retorno;
        }
        return null;
    }

    public void push(No<T> no){
        no.setNoAbaixo(topo);
        topo = no;
    }

    public boolean isEmpyt(){
        return topo == null;
    }

    /**
     * Método auxiliar para visualização da pilha, ele percorre a pilha e printa todos os elementos
     * @param topo No<T> Nó topo da pilha, vai ser printado esse elemento primeiro depois os abaixo
     */
    public void mostraTodaPilha(No<T> topo){
        if(topo != null){
            System.out.println(topo);
            mostraTodaPilha(topo.getNoAbaixo());
        }
    }

    public No<T> getTopo() {
        return topo;
    }

    public void setTopo(No<T> topo) {
        this.topo = topo;
    }

    @Override
    public String toString() {
        No<T> noAuxiliar = topo;
        String pilhaString = "";
        while (noAuxiliar != null){
            pilhaString += noAuxiliar + "\n";
            noAuxiliar = noAuxiliar.getNoAbaixo();
        }
        return  pilhaString;
    }
}
