package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*int a = 2 ;
		int b = 3 ;
		System.out.println("Hello World "+ (a+b));*/
		Gato gato = new Gato();
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);
	}

}
class Livro{
	private String name;
	private String	npag;
}