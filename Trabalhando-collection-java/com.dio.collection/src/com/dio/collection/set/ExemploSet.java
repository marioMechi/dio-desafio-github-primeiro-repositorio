package com.dio.collection.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto a adiciona notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5");
        //Não é possível

        System.out.println("adiciona a nota 8 na posição 4");
        //não é possível

        System.out.println("Substitua a nota 5 por 6");
        //não é possível

        System.out.println("Confira se a nota 5 esta no conjunto: "+notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada");
        //Não é possível

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        Iterator<Double> interator = notas.iterator();
        Double soma = 0.0;
        while (interator.hasNext()){
            Double next = interator.next();
            soma+= next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("Exiba a média dos valores: "+soma/notas.size());

        System.out.println("Remova nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        //Não é possível

        System.out.println("Remova as notas menora que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if( next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas:");
        Set<Double> notas2 = new HashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas crescentes: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se esta vazio: "+notas.isEmpty());
    }
}
