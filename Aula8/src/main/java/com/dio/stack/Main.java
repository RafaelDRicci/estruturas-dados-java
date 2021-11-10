package com.dio.stack;

import com.dio.model.Carro;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Chevrolet"));
        stackCarro.push(new Carro("Fiat"));

        System.out.println("-------------------------------");
        System.out.println(stackCarro);
        System.out.println("pop "+stackCarro.pop());
        System.out.println(stackCarro);

        System.out.println("-------------------------------");
        System.out.println("peek "+stackCarro.peek());
        System.out.println(stackCarro);

        System.out.println("-------------------------------");
        System.out.println("empty "+stackCarro.empty());

    }

}
