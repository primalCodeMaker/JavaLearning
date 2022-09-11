package person;

import product.Food;

public interface ProducingMan {

            // jesli wyprodukuje jedzenie to producer bedzie wiedzial kto bedzie to konsumowal
            // szef kuchni bedzie wiedzial od kogo dostal zamowienie

    Food produce (String productName, ConsumingMan consumingMan);
}
