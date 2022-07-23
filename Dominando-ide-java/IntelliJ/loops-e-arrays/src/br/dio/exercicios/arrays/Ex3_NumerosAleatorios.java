package br.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for (int i=0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+" ");
        }
        System.out.println("\n Sucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1+" ");
        }
        System.out.println("\n Anteriores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero-1+" ");
        }
    }
}
