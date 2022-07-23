package br.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {10,20,30,40,50,60};
        System.out.println("Vetor:");
        int count = 0;
        while (count < vetor.length){
            System.out.print(vetor[count]+" ");
            count++;

        }
        System.out.println("\n Vetor:");
        for (int i = vetor.length - 1; i>=0; i--){
            System.out.print(vetor[i]+" ");
        }
    }
}
