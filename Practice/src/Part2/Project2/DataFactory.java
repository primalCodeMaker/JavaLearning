package Part2.Project2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static List<Purchase> produce() {
        List<Purchase> purchaseList = new ArrayList<>();
        // Clients
        Client client0 = new Client("client0", "Roman", "Kowalski", BigInteger.valueOf(65814267854L), "Poznań");
        Client client1 = new Client("client1", "Karolina", "Nowak", BigInteger.valueOf(66060897231L), "Warszawa");
        Client client2 = new Client("client2", "Marta", "Romańczuk", BigInteger.valueOf(62063073633L), "Szczecin");
        Client client3 = new Client("client3", "Andrzej", "Stefański", BigInteger.valueOf(62051084215L), "Kraków");
        Client client4 = new Client("client4", "Krystyna", "Baranowska", BigInteger.valueOf(65073073798L), "Warszawa");
        Client client5 = new Client("client5", "Marcin", "Sadowski", BigInteger.valueOf(68071193875L), "Poznań");
        Client client6 = new Client("client6", "Monika", "Radomska", BigInteger.valueOf(68042182821L), "Szczecin");
        Client client7 = new Client("client7", "Tadeusz", "Stefański", BigInteger.valueOf(92052325758L), "Kraków");
        Client client8 = new Client("client8", "Marta", "Nowak", BigInteger.valueOf(62042135735L), "Kraków");
        Client client9 = new Client("client9", "Marcin", "Kowalski", BigInteger.valueOf(72070729244L), "Warszawa");

        // Products
        Product product0 = new Product("product0", "Doniczka", Product.Category.GARDEN, new Money(new BigDecimal("15.99"), Money.Currency.PLN));
        Product product1 = new Product("product1", "Lampa", Product.Category.GARDEN, new Money(new BigDecimal("18.99"), Money.Currency.PLN));
        Product product2 = new Product("product2", "Grill", Product.Category.GARDEN, new Money(new BigDecimal("12.99"), Money.Currency.EUR));
        Product product3 = new Product("product3", "Basen", Product.Category.GARDEN, new Money(new BigDecimal("10.99"), Money.Currency.EUR));
        Product product4 = new Product("product4", "Lampa", Product.Category.GARDEN, new Money(new BigDecimal("9.99"), Money.Currency.EUR));
        Product product5 = new Product("product5", "Grabki", Product.Category.GARDEN, new Money(new BigDecimal("12.99"), Money.Currency.PLN));

        Product product6 = new Product("product6", "Koło", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("13.99"), Money.Currency.PLN));
        Product product7 = new Product("product7", "Kierownica", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("18.99"), Money.Currency.PLN));
        Product product8 = new Product("product8", "Dywanik", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("19.99"), Money.Currency.PLN));
        Product product9 = new Product("product9", "Fotel", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("20.99"), Money.Currency.EUR));
        Product product10 = new Product("product10", "Szyba", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("9.99"), Money.Currency.EUR));
        Product product11 = new Product("product11", "Skrobaczka", Product.Category.AUTOMOTIVE, new Money(new BigDecimal("11.99"), Money.Currency.EUR));

        Product product12 = new Product("product12", "Koszulka", Product.Category.CLOTHES, new Money(new BigDecimal("26.99"), Money.Currency.PLN));
        Product product13 = new Product("product13", "Garnitur", Product.Category.CLOTHES, new Money(new BigDecimal("92.99"), Money.Currency.PLN));
        Product product14 = new Product("product14", "Spodnie", Product.Category.CLOTHES, new Money(new BigDecimal("14.99"), Money.Currency.PLN));
        Product product15 = new Product("product15", "Spodnie", Product.Category.CLOTHES, new Money(new BigDecimal("72.99"), Money.Currency.EUR));
        Product product16 = new Product("product16", "Koszula", Product.Category.CLOTHES, new Money(new BigDecimal("16.99"), Money.Currency.EUR));
        Product product17 = new Product("product17", "Spódnica", Product.Category.CLOTHES, new Money(new BigDecimal("16.99"), Money.Currency.EUR));
        Product product18 = new Product("product18", "Buty", Product.Category.CLOTHES, new Money(new BigDecimal("23.99"), Money.Currency.EUR));

        Product product19 = new Product("product19", "Gra planszowa", Product.Category.HOBBY, new Money(new BigDecimal("26.99"), Money.Currency.PLN));
        Product product20 = new Product("product20", "Karty", Product.Category.HOBBY, new Money(new BigDecimal("72.99"), Money.Currency.PLN));
        Product product21 = new Product("product21", "Piłka", Product.Category.HOBBY, new Money(new BigDecimal("16.99"), Money.Currency.PLN));
        Product product22 = new Product("product22", "Gazeta", Product.Category.HOBBY, new Money(new BigDecimal("62.99"), Money.Currency.EUR));
        Product product23 = new Product("product23", "Słuchawki", Product.Category.HOBBY, new Money(new BigDecimal("62.99"), Money.Currency.PLN));
        Product product24 = new Product("product24", "Konsola", Product.Category.HOBBY, new Money(new BigDecimal("15.99"), Money.Currency.PLN));
        Product product25 = new Product("product25", "Książka", Product.Category.HOBBY, new Money(new BigDecimal("19.99"), Money.Currency.EUR));

        // Purchase
        purchaseList.add(new Purchase(client0, product1, 7, Purchase.Delivery.DHL, Purchase.Payment.BLIK, LocalDate.of(2020, 7, 12)));
        purchaseList.add(new Purchase(client0, product17, 2, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 2, 12)));
        purchaseList.add(new Purchase(client1, product18, 1, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 1, 5)));
        purchaseList.add(new Purchase(client2, product19, 3, Purchase.Delivery.UPS, Purchase.Payment.CASH, LocalDate.of(2020, 3, 6)));
        purchaseList.add(new Purchase(client1, product23, 7, Purchase.Delivery.IN_POST, Purchase.Payment.CASH, LocalDate.of(2020, 7, 2)));
        purchaseList.add(new Purchase(client5, product9, 1, Purchase.Delivery.UPS, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 1, 1)));
        purchaseList.add(new Purchase(client7, product3, 3, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 3, 4)));
        purchaseList.add(new Purchase(client2, product6, 2, Purchase.Delivery.DHL, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 2, 12)));
        purchaseList.add(new Purchase(client8, product7, 1, Purchase.Delivery.DHL, Purchase.Payment.CASH, LocalDate.of(2020, 1, 12)));
        purchaseList.add(new Purchase(client2, product1, 6, Purchase.Delivery.DHL, Purchase.Payment.CASH, LocalDate.of(2020, 6, 12)));
        purchaseList.add(new Purchase(client1, product19, 1, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 1, 11)));
        purchaseList.add(new Purchase(client7, product2, 9, Purchase.Delivery.UPS, Purchase.Payment.BLIK, LocalDate.of(2020, 9, 11)));
        purchaseList.add(new Purchase(client2, product5, 2, Purchase.Delivery.UPS, Purchase.Payment.CASH, LocalDate.of(2020, 2, 11)));
        purchaseList.add(new Purchase(client5, product3, 1, Purchase.Delivery.DHL, Purchase.Payment.CASH, LocalDate.of(2020, 1, 12)));
        purchaseList.add(new Purchase(client2, product12, 5, Purchase.Delivery.DHL, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 5, 2)));
        purchaseList.add(new Purchase(client6, product1, 3, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 3, 2)));
        purchaseList.add(new Purchase(client9, product0, 1, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 1, 2)));
        purchaseList.add(new Purchase(client5, product4, 1, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 1, 12)));
        purchaseList.add(new Purchase(client4, product11, 8, Purchase.Delivery.DHL, Purchase.Payment.CASH, LocalDate.of(2020, 8, 4)));
        purchaseList.add(new Purchase(client9, product10, 2, Purchase.Delivery.DHL, Purchase.Payment.BLIK, LocalDate.of(2020, 2, 4)));
        purchaseList.add(new Purchase(client3, product13, 1, Purchase.Delivery.DHL, Purchase.Payment.BLIK, LocalDate.of(2020, 1, 4)));
        purchaseList.add(new Purchase(client4, product8, 9, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 9, 12)));
        purchaseList.add(new Purchase(client2, product14, 3, Purchase.Delivery.IN_POST, Purchase.Payment.CASH, LocalDate.of(2020, 3, 4)));
        purchaseList.add(new Purchase(client2, product16, 1, Purchase.Delivery.UPS, Purchase.Payment.CASH, LocalDate.of(2020, 1, 4)));
        purchaseList.add(new Purchase(client1, product15, 3, Purchase.Delivery.UPS, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 3, 4)));
        purchaseList.add(new Purchase(client0, product25, 1, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 1, 3)));
        purchaseList.add(new Purchase(client0, product15, 6, Purchase.Delivery.DHL, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 6, 3)));
        purchaseList.add(new Purchase(client9, product3, 7, Purchase.Delivery.DHL, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 7, 3)));
        purchaseList.add(new Purchase(client8, product19, 8, Purchase.Delivery.IN_POST, Purchase.Payment.CASH, LocalDate.of(2020, 8, 12)));
        purchaseList.add(new Purchase(client7, product24, 9, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 9, 4)));
        purchaseList.add(new Purchase(client7, product21, 2, Purchase.Delivery.IN_POST, Purchase.Payment.CREDIT_CARD, LocalDate.of(2020, 2, 4)));
        purchaseList.add(new Purchase(client6, product22, 1, Purchase.Delivery.IN_POST, Purchase.Payment.BLIK, LocalDate.of(2020, 1, 4)));
        purchaseList.add(new Purchase(client6, product20, 2, Purchase.Delivery.IN_POST, Purchase.Payment.CASH, LocalDate.of(2020, 2, 12)));

        return purchaseList;
    }
}