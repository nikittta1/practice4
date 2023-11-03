package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<F extends Fruit> {
    List<F> fruits = new ArrayList<>();

    public Box(Class<F>... fruitClass) {
        for (Class<F> fruitt : fruitClass) {
            try {
                F fruit = fruitt.getDeclaredConstructor().newInstance();
                fruits.add(fruit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Box() {
    }

    private List<F> getList() {
        return fruits;
    }

    public double getWeight() {
        double weight = 0.0f;

        for (F o : fruits) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void add(F... fruitsToAdd) {
        for (F fruit : fruitsToAdd) {
            fruits.add(fruit);
        }
    }

    public boolean compare(Box list) {
        return getWeight() == list.getWeight();
    }
    public void moveTo(Box<F> another){
        if (another != this)
        {
            this.fruits.addAll(another.fruits);
            another.fruits.clear();
        }
        else {
            System.out.println("Нельзя пересыпать коробку в саму себя");
        }
    }
    public void printBox() {
        if (fruits.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            for (F l : fruits) {
                System.out.println(l);
            }
        }
    }
}
