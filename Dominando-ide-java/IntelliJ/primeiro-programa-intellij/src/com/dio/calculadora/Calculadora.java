package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro Numero");
        a = scan.nextInt();
        System.out.println("Digite o segundo Numero");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);
    }

    public static soma(int a, int b) {
        return (a + b);
    }

    public static subtracao(int a, int b) {
        return a - b;
    }

    public static multiplicacao(int a, int b) {
        return a * b;
    }

    public static divisao(int a, int b) {
        return a / b;
    }
}
