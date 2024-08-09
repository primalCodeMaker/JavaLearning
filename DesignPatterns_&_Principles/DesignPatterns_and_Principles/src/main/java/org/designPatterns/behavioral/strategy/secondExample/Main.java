package org.designPatterns.behavioral.strategy.secondExample;

public class Main {

    public static void main(String[] args) {

        Parcel parcel1 = new Parcel("Ksiazka");
        Parcel parcel2 = new Parcel("Buty");

        OnlineStore onlineStore = new OnlineStore();

        onlineStore.addParcel(parcel1);
        onlineStore.addParcel(parcel2);
        onlineStore.addParcel(new Parcel("Skarpety"));

        System.out.println("##Courier");
        onlineStore.delivery(new CourierStrategy());

        System.out.println("##Post");
        onlineStore.delivery(new PostStrategy());

        System.out.println("##Parcel Locker");
        onlineStore.delivery(new ParcelLockerStrategy());

        //Lambda
        System.out.printf("%n##Parcel eaten by LAMBDA!");
        onlineStore.delivery(parcel -> System.out.printf("%nparcel %s eaten", parcel.getName()));

    }
}