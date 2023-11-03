package org.example;

import java.util.ArrayList;
import java.util.List;

class BananaBox<F extends Fruit> extends Box<F>{
    List<Fruit> fruits = new ArrayList<>();

    public BananaBox(Class<F>... fruitClass) {
        for (Class<F> fruitt : fruitClass) {
            try {
                F fruit = fruitt.getDeclaredConstructor().newInstance();
                fruits.add(fruit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void moveTo(Box box)
    {
        if (box != this)
        {
            for (Object fruit : box.fruits) this.add((F) fruit);
            box.fruits.clear();
        }
    }

}
