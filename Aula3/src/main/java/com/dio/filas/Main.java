package com.dio.filas;

public class Main {

    public static void main(String[] args) {

        //Criando a fila e exibindo seu conteudo
        Fila<String> fila = new Fila<>();

        System.out.println("---------------------");
        System.out.println("Fila criada: ");
        System.out.println("Fila: ");
        System.out.println(fila);

        //criando um no e inserindo na fila
        System.out.println("---------------------");
        System.out.println("Inserindo um no na fila: ");
        fila.enqueue("No 1");
        System.out.println("Fila: ");
        System.out.println(fila);

        //Conferindo o primeiro nó
        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

        //Inserindo 4 nos na fila
        System.out.println("---------------------");
        System.out.println("Inserindo 4 nos na fila: ");
        fila.enqueue("No 2");
        fila.enqueue("No 3");
        fila.enqueue("No 4");
        System.out.println("Fila: ");
        System.out.println(fila);

        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

        //Retirando todos os nos da fila
        System.out.println("---------------------");
        System.out.println("Retirando um no da fila: ");
        String primeiroNo = fila.dequeue();
        System.out.println("Elemento retirado = "+primeiroNo);
        System.out.println("Fila: ");
        System.out.println(fila);

        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

        System.out.println("---------------------");
        System.out.println("Retirando um no da fila: ");
        primeiroNo = fila.dequeue();
        System.out.println("Elemento retirado = "+primeiroNo);
        System.out.println("Fila: ");
        System.out.println(fila);

        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

        System.out.println("---------------------");
        System.out.println("Retirando um no da fila: ");
        primeiroNo = fila.dequeue();
        System.out.println("Elemento retirado = "+primeiroNo);
        System.out.println("Fila: ");
        System.out.println(fila);

        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

        System.out.println("---------------------");
        System.out.println("Retirando um no da fila: ");
        primeiroNo = fila.dequeue();
        System.out.println("Elemento retirado = "+primeiroNo);
        System.out.println("Fila: ");
        System.out.println(fila);

        System.out.println("---------------------");
        System.out.println("O primeiro no na fila: ");
        System.out.println(fila.first());

    }

}
