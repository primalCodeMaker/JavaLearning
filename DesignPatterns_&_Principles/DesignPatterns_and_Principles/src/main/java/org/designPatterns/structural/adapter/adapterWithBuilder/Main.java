package org.designPatterns.structural.adapter.adapterWithBuilder;

public class Main {

    public static void main(String[] args) {
        ExternalObject externalObject = ExternalObject.externalReturn();
        System.out.println(externalObject);

        Target adapter = Adapter.builder()
                .externalObject(externalObject)
                .kg(0)
                .build();

        System.out.println(adapter);

        Target adapterKG = adapter.switchToKg();
        System.out.println(adapterKG);


        // Second Example
        // pobieranie samej wartosci w KG bez robienia obiektu (normalonie skozystali bysmy z konstruktora ale mamy juz taki obiekt)

        double kgValue = adapter.getKg();
        System.out.printf("%nWartość w kilogramach %s: ", kgValue);

    }
}
