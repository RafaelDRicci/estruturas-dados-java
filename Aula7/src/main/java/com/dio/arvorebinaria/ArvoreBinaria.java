package com.dio.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){

        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){

        if(atual == null){
            return novoNo;
        } else if( novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
        } else {
            atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\nExibir InOrdem");
        exibirInOrdem(raiz);
    }

    private void exibirInOrdem(BinNo<T> auxiliar){

        if(auxiliar != null){
            exibirInOrdem(auxiliar.getNoEsquerda());
            System.out.print(auxiliar + ", ");
            exibirInOrdem(auxiliar.getNoDireita());
        }

    }

    public void exibirPosOrdem(){
        System.out.println("\nExibir PosOrdem");
        exibirPosOrdem(raiz);
    }

    private void exibirPosOrdem(BinNo<T> auxiliar){

        if(auxiliar != null){
            exibirPosOrdem(auxiliar.getNoEsquerda());
            exibirPosOrdem(auxiliar.getNoDireita());
            System.out.print(auxiliar + ", ");
        }

    }

    public void exibirPreOrdem(){
        System.out.println("\nExibir PreOrdem");
        exibirPreOrdem(raiz);
    }

    private void exibirPreOrdem(BinNo<T> auxiliar){
        if(auxiliar != null){
            System.out.print(auxiliar + ", ");
            exibirPreOrdem(auxiliar.getNoEsquerda());
            exibirPreOrdem(auxiliar.getNoDireita());
        }
    }

    public void remover(T conteudo){

        try{

            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temporario = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){

                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) > 0){
                    atual = atual.getNoEsquerda();
                }else{
                    atual = atual.getNoDireita();
                }

            }
            if(atual == null){
                System.out.println("Conteudo "+ conteudo +" nao encontrado - Block try");
            }

            if(pai == null){

                if(atual.getNoDireita() == null){
                    this.raiz = atual.getNoEsquerda();
                } else if(atual.getNoEsquerda() == null){
                    this.raiz = atual.getNoDireita();
                } else{
                    for(temporario = atual, filho = atual.getNoEsquerda();
                        filho.getNoDireita() != null;
                        temporario = filho, filho = filho.getNoEsquerda()
                    ){
                        if(filho != atual.getNoEsquerda()){
                            temporario.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(raiz.getNoEsquerda());
                        }
                    }
                    filho.setNoDireita(raiz.getNoDireita());
                    raiz = filho;
                }

            } else if(atual.getNoDireita() == null){

                if(pai.getNoEsquerda() == atual){
                    pai.setNoEsquerda(atual.getNoEsquerda());
                }else{
                    pai.setNoDireita(atual.getNoEsquerda());
                }

            } else if(atual.getNoEsquerda() == null){

                if(pai.getNoEsquerda() == atual){
                    pai.setNoEsquerda(atual.getNoDireita());
                }else{
                    pai.setNoDireita(atual.getNoDireita());
                }

            } else {

                for(temporario = atual, filho = atual.getNoEsquerda();
                    filho.getNoDireita() != null;
                    temporario = filho, filho = filho.getNoDireita()
                ){

                    if(filho != atual.getNoEsquerda()){
                        temporario.setNoDireita(filho.getNoEsquerda());
                        filho.setNoEsquerda(atual.getNoEsquerda());
                    }

                    filho.setNoDireita(atual.getNoDireita());
                    if(pai.getNoEsquerda() == atual){
                        pai.setNoEsquerda(filho);
                    }else{
                        pai.setNoDireita(filho);
                    }
                }
            }

        }catch(NullPointerException ex){
            System.out.println("Conteudo "+ conteudo +" nao encontrado - Block catch");
        }

    }

}
