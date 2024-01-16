package org.example.insertDeleteGetRandom;

public class Main {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        System.out.println(randomizedSet.insert(4));
        System.out.println(randomizedSet.insert(4));


        randomizedSet.remove(2);

        System.out.println(randomizedSet.getRandom());


    }

}
