package com.dio.collection.set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória:\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Got", "fantasia", 60));
            add(new Serie("The Rain", "ficção", 75));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoDeEpisodio());

        System.out.println("--\tOrdem de Inserção:\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Got", "fantasia", 60));
            add(new Serie("The Rain", "ficção", 75));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoDeEpisodio());

        System.out.println("--\tOrdem Natural(tempo de episódio):\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoDeEpisodio());

        System.out.println("--\tOrdem Nome/genero/tempo de episódio:\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoDeEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoDeEpisodio());
    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private  String genero;
    private  Integer tempoDeEpisodio;

    public Serie(String nome, String genero, Integer tempoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpisodio=" + tempoDeEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoDeEpisodio.equals(serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = this.getTempoDeEpisodio().compareTo(serie.getTempoDeEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNomeGeneroTempoDeEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        return Integer.compare(s1.getTempoDeEpisodio(), s2.getTempoDeEpisodio());
    }
}