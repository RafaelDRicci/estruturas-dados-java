package com.projetos.no;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProxNo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProxNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProxNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProxNo());
        System.out.println(no2);

        System.out.println("-----------------------------");

        System.out.println(no1);
        System.out.println(no1.getProxNo());
        System.out.println(no1.getProxNo().getProxNo());
        System.out.println(no1.getProxNo().getProxNo().getProxNo());
        System.out.println(no1.getProxNo().getProxNo().getProxNo().getProxNo());

        System.out.println("-----------------------------");

        No<Integer> no5 = new No<>(5);
        no4.setProxNo(no5);
        System.out.println(no1.getProxNo().getProxNo().getProxNo().getProxNo());


    }

}
