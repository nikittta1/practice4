package org.example;

//import sun.net.www.content.audio.basic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание:");
        Integer[] array1 = {1,2,3,4};
        swapElements(array1, 2,3);

        System.out.println("2 задание:");
        convertArrayToList(array1);

        System.out.println("3 задание:");
        Box<Apple> apple1 = new Box<>(Apple.class);
        Box<Apple> apple2 = new Box<>(Apple.class);
        apple1.add(new Apple(), new Apple());
        apple2.add(new Apple());
        Box<Orange> orange = new Box<>(Orange.class);
        orange.add(new Orange());
        BananaBox<Banana> bananas = new BananaBox<>(Banana.class);
        bananas.add(new Banana());
        apple2.moveTo(apple2);
        apple2.printBox();

    }
    public static void swapElements(Object[] array, int index1, int index2) {
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("Итоговый массив: " + Arrays.toString(array) + "\n");
    }
    public static <T> void convertArrayToList(T[] array) {
        System.out.println("Исходный массив: " + Arrays.toString(array));
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Итоговый ArrayList: " + list + "\n");
    }
}