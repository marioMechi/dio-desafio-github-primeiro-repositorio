package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a =5;
        int b =3;
        System.out.println("Hello World "+(a+b));*/
        Gato gato = new Gato();
        System.out.println(gato);

        livro livro1 = new Livro (name="O problema dos 3 cops", npag=300);
        System.out.println(livro1);
    }
}
