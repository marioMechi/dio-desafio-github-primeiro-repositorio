package com.dio.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos elementos desta lista de String");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e colque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme essa lista de String em uma lista de numeros inteiros: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresaQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i-> (i %2 == 0 && i >2)).collect(Collectors.toList());
        System.out.println(listParesMaioresaQue2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer-> (integer %2 !=0));
        System.out.println(numerosAleatoriosInteger);
    }
}
