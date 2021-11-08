package com.dio.listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {

        //Criacao da lista e utilizando o metodo size
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        System.out.println("------------------------------");
        System.out.println("Lista criada");
        System.out.println("Quantidade de elementos na lista: "+lista.size());
        System.out.println(lista);

        //Utilizando o get em uma lista vazia
        System.out.println("------------------------------");
        System.out.println("Recuperando um valor na lista vazia");
        try{
            lista.get(0);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        //Adicionando elemtnos na lista
        System.out.println("------------------------------");
        System.out.println("Adicionando No 1 na lista");
        lista.add("No 1");
        System.out.println("Tamanho da Lista: "+lista.size());
        System.out.println("Recuperando o primeiro elemento da lista: "+lista.get(0));

        System.out.println("------------------------------");
        System.out.println("Adicionando No 2 na lista");
        lista.add("No 2");
        System.out.println("Tamanho da Lista: "+lista.size());
        System.out.println("Recuperando o segundo elemento da lista: "+lista.get(1));

        System.out.println("------------------------------");
        System.out.println("Adicionando No 3 na lista");
        lista.add("No 3");
        System.out.println("Tamanho da Lista: "+lista.size());
        System.out.println("Recuperando o terceiro elemento da lista: "+lista.get(2));

        System.out.println("------------------------------");
        System.out.println("Adicionando No 4 na lista");
        lista.add("No 4");
        System.out.println("Tamanho da Lista: "+lista.size());
        System.out.println("Recuperando o quarto elemento da lista: "+lista.get(3));

        //Demonstrando a lista toda
        System.out.println("------------------------------");
        System.out.println("Lista:");
        System.out.println(lista);

        //Inserindo com indices
        System.out.println("------------------------------");
        System.out.println("Inserindo No 5 ao final da lista(indice 4)");
        lista.add(4, "No 5");
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Inserindo No 0 no inicio da lista(indice 0)");
        lista.add(0, "No 0");
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Inserindo No 2.5 no meio da lista(indice 3)");
        lista.add(3, "No 2.5");
        System.out.println(lista);

        //teste remove
        System.out.println("------------------------------");
        System.out.println("Removendo no inicio (indice 0)");
        lista.remove(0);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Removendo no fim size()-1");
        lista.remove(lista.size()-1);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Removendo no meio (indice 2)");
        lista.remove(2);
        System.out.println(lista);

        //mais alguns teste com uma segunda lista
        System.out.println("------------------------------");
        System.out.println("Criando uma nova lista");
        ListaDuplamenteEncadeada<String> lista2 = new ListaDuplamenteEncadeada<>();
        System.out.println("Adicionando No 0 na posicao 0");
        lista2.add(0, "No 0");
        System.out.println(lista2);
        System.out.println("Tamanho da lista: "+lista2.size());
        System.out.println("Recuperando o elemento 0: "+lista2.get(0));
        System.out.println("Removendo o elemento 0 ");
        lista2.remove(0);
        System.out.println("Lista:");
        System.out.println(lista2);

        System.out.println("------------------------------");
        System.out.println("Adicionando 3 nos na lista");
        lista2.add(0, "No 0");
        lista2.add(1, "No 2");
        lista2.add(1, "No 1");
        System.out.println(lista2);
        System.out.println("Tamanho da lista: "+lista2.size());
        System.out.println("Recuperando o elemento 2: "+lista2.get(2));
        System.out.println("Removendo todos os elementos da lista ");
        lista2.remove(0);
        lista2.remove(1);
        lista2.remove(0);
        System.out.println("Tamanho: "+lista2.size());
        System.out.println("Lista:");
        System.out.println(lista2);
        
    }
}
