package org.example;

import java.util.Collections;

public class LemonBox<F extends Fruit> extends Box<F> {
    public LemonBox(Fruit... l)
    {
        for (int i = 0; i < l.length; i++) {
            fruits.add((F) l[i]);
        }
    }

    public void addFruit(Fruit... l) {

        for (int i = 0; i < l.length; i++) {
            fruits.add((F) l[i]);
        }
    }
    public void addFruit(int number_of_lemons) {
        for (int i = 0; i < number_of_lemons; i++) {
            fruits.add((F) new Lemon());
        }
    }
}