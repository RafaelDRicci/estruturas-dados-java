package com.dio.list;

import com.dio.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Peugeot"));

        System.out.println("--------------------------");
        System.out.println(listaCarros);
        System.out.println("contais(\"Ford\") = "+listaCarros.contains(new Carro("Ford")));
        System.out.println("get(2) = " + listaCarros.get(2));
        System.out.println("indexOf(\"Fiat\") = " + listaCarros.indexOf(new Carro("Fiat")));
        System.out.println("remove(2) = " +listaCarros.remove(2));
        System.out.println(listaCarros);

    }

}
