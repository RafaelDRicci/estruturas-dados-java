package com.dio.listacircular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> lista = new ListaCircular<>();

        lista.add(0, "No 0");
        lista.add(1, "No 1");
        lista.add(2, "No 2");
        lista.add(3, "No 3");
        lista.add(4, "No 4");

        System.out.println("------------------------------");
        System.out.println("Criando uma lista e Adicionado 4 nos:");
        System.out.println("Capturando o elemento da posicao 24: "+lista.get(24));
        System.out.println(lista.percorreLista());

        System.out.println("------------------------------");
        System.out.println("Adicionando No 5 na Posicao 6");
        lista.add(6, "No 5");
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Removendo a posicao 6");
        lista.remove(6);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Removendo a posicao 0");
        lista.remove(0);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Adicionando o No 0 (pos 0) e removendo a posicao 4");
        lista.add(0, "No 0");
        lista.remove(4);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Adicionando o No 4 (pos 4) e removendo a posicao 2");
        lista.add(4, "No 4");
        lista.remove(2);
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Adicionando o No 2 (pos 2)");
        lista.add(2, "No 2");
        System.out.println(lista);

        System.out.println("------------------------------");
        System.out.println("Percorrendo a lista com indice de 0 a 20");
        for(int i = 0; i < 20; i++){
            System.out.println(lista.get(i));
        }
    }
}
