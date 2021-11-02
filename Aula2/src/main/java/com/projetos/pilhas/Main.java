package com.projetos.pilhas;

public class Main {

    public static void main(String[] args) {

        //criando a pilha
        Pilha<String> pilha = new Pilha<>();
        //verificando se a pilha esta vazia
        System.out.println("--------------------");
        System.out.println("Pilha isEmpty: "+pilha.isEmpyt());

        //criando um novo nó e inserindo na pilha (push)
        No<String> no1 = new No<>("No1");
        pilha.push(no1);
        //verificando mais uma vez se está vazia
        System.out.println("--------------------");
        System.out.println("Adicionando No1");
        System.out.println("Pilha isEmpty: " +pilha.isEmpyt());

        //utilizando o metodo top para ver o topo da pilha
        System.out.println("--------------------");
        System.out.println("Topo da pilha: " +pilha.top());

        //criando um novo nó e adicionando na pilha
        System.out.println("--------------------");
        System.out.println("Adicionando No2");
        pilha.push(new No<>("No2"));
        pilha.mostraTodaPilha(pilha.getTopo());

        //retirando um no da pilha (pop)
        System.out.println("--------------------");
        No<String> retiraTopo = pilha.pop();
        System.out.println("Retirando um no da pilha");
        System.out.println("No retirado: "+retiraTopo);
        System.out.println("Topo da pilha: " +pilha.top());

        //Adicionando 5 nos na pilha
        pilha.push(new No<>("No2"));
        pilha.push(new No<>("No3"));
        pilha.push(new No<>("No4"));
        pilha.push(new No<>("No5"));

        System.out.println("--------------------");
        System.out.println("Adicionando 5 nos");
        System.out.println("Toda a pilha: ");
        pilha.mostraTodaPilha(pilha.getTopo());

        //Retirando 3 nos da pilha
        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println("--------------------");
        System.out.println("Retirando 3 nos da pilha");
        System.out.println("Toda a Pilha: ");
        pilha.mostraTodaPilha(pilha.getTopo());


        //adicinando mais 10 nos
        pilha.push(new No<>("No6"));
        pilha.push(new No<>("No7"));
        pilha.push(new No<>("No8"));
        pilha.push(new No<>("No9"));
        pilha.push(new No<>("No10"));
        pilha.push(new No<>("No11"));
        pilha.push(new No<>("No12"));
        pilha.push(new No<>("No13"));
        pilha.push(new No<>("No14"));
        pilha.push(new No<>("No15"));
        System.out.println("--------------------");
        System.out.println("Adicionando 10 nos na pilha");
        System.out.println("Toda a Pilha: ");
        System.out.println(pilha);
    }

}
