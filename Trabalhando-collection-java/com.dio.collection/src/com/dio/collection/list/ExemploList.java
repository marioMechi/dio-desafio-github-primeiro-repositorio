package com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lisata e adicione 7 notas:");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: "+notas.indexOf(5d));

        System.out.println("Adicione a note 8.0 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 por 6:");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informados:");
        for (Double nota:notas) System.out.print(" "+nota);

        System.out.println("\n Exiba a 3ª nota adicionada: "+ notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("Exiba a média das notas: "+soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba: ");
        Iterator<Double> interator1 = notas.iterator();
        while (interator1.hasNext()){
            Double next = interator1.next();
            if(next < 7)interator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toa a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia:"+notas.isEmpty());
    }
}
