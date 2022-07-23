package br.dio.exercicios.loops.exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePar =0, quantidadeImpar =0;
        System.out.println("Digite a quantidade de números");
        quantidadeNumeros = scan.nextInt();
        int count = 0;
        do{
            System.out.println("Numero:");
            numero = scan.nextInt();
            count++;
            if(numero % 2 == 0) quantidadePar++;
            else quantidadeImpar++;
        } while (count < quantidadeNumeros);
        System.out.println("Quantidade pares: "+quantidadePar);
        System.out.println("Quantidade ímpares: "+quantidadeImpar);
    }
}
