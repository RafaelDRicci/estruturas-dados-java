package com.dio.listasencadeadas;

public class Main {

    public static void main(String[] args) {

        //Criando e exibindo a lista
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println("--------------------");
        System.out.println("Lista criada");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento na lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no");
        lista.add("No 1");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento na lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no");
        lista.add("No 2");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento na lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no");
        lista.add("No 3");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento na lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no");
        lista.add("No 4");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento no inicio da lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no na posicao 0");
        lista.add(0,"No 0");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //adicionando um elemento no final da lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no na posicao 5");
        lista.add(5,"No 5");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);


        //adicionando um elemento no meio da lista
        System.out.println("--------------------");
        System.out.println("Adicionando um no na posicao 3");
        lista.add(3,"No 2.5");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        //testando contains
        System.out.println("--------------------");
        System.out.println("A lista contem No 3?");
        System.out.println(lista.contains("No 3") ? "Sim" : "N'ao");
        System.out.println("A lista contem No 1.5?");
        System.out.println(lista.contains("No 1.5") ? "Sim" : "N'ao");


        //Testando get
        System.out.println("--------------------");
        System.out.println("Get index 0? " +lista.get(0));
        System.out.println("Get index 4? " +lista.get(4));
        System.out.println("Get index 5? " +lista.get(5));
        //System.out.println("Get index 7? " +lista.get(7));

        //Testando getIindex
        System.out.println("--------------------");
        System.out.println("Index do No 0? " +lista.getIndex("No 0"));
        System.out.println("Index do No 3? " +lista.getIndex("No 3"));
        System.out.println("Index do No 5? " +lista.getIndex("No 5"));
        //System.out.println("Index do No 7? " +lista.getIndex("No 7"));

        //testando remove
        System.out.println("--------------------");
        System.out.println("Removendo o No 0 ");
        lista.remove("No 0");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        System.out.println("--------------------");
        System.out.println("Removendo o No 5 ");
        lista.remove("No 5");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

        System.out.println("--------------------");
        System.out.println("Removendo o No 3 ");
        lista.remove("No 3");
        System.out.println("Tamanho da lista: "+lista.size());
        System.out.println("Lista:");
        System.out.println(lista);

    }
}
