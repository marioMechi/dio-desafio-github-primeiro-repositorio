package com.dio.collection.map;

import java.util.*;

import static javax.swing.UIManager.put;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os modelos a seus respectivos consumos: ");
        Map<String, Double> carrosPopulares= new HashMap<>(){{
           put("Gol", 14.4);
           put("Uno", 15.6);
           put("Mobi", 16.1);
           put("HB20", 14.5);
           put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Subistitua o caonsumo do Gol por 15.2 KM/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson esta no dicionário: "+carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do Uno: "+carrosPopulares.get("Uno"));

        System.out.println("Exiba o terveiro modelo adicionado:");
        //Não é possível

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries= carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente))modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente+" - "+consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente+" - "+consumoMenosEficiente);
            }
        }
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("exiba a média de consumo deste dicionário: "+soma/carrosPopulares.size());

        System.out.println("Remova os modelos com cosumo igual 15.6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6))iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1= new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicinário de carros");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se o dicionário esta vazio: "+carrosPopulares.isEmpty());
    }
}
