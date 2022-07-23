package br.dio.exercicios.loops.exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int media;
        int count = 0;
        int maior = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            media = soma/5;
            count = count + 1;
            if(numero > maior) maior = numero;
        }while (count < 5) ;
        System.out.println("Maior: "+ maior);
        System.out.println("Média: "+ media);
    }
}
