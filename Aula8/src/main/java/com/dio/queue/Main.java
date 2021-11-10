package com.dio.queue;

import com.dio.model.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queue = new LinkedList<>();

        queue.add(new Carro("Ford"));
        queue.add(new Carro("Chevrolet"));
        queue.add(new Carro("Fiat"));

        System.out.println("-----------------------");
        System.out.println("add "+queue.add(new Carro("Peugeot")));
        System.out.println(queue);

        System.out.println("-----------------------");
        System.out.println("offer "+queue.offer(new Carro("Renault")));
        System.out.println(queue);

        System.out.println("-----------------------");
        System.out.println("peek "+queue.peek());
        System.out.println(queue);

        System.out.println("-----------------------");
        System.out.println("poll "+queue.poll());
        System.out.println(queue);

        System.out.println("-----------------------");
        System.out.println("isEmpty "+queue.isEmpty());
        System.out.println("size "+queue.size());

    }

}
