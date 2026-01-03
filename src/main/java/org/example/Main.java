package org.example;


public class Main {
    int x;
    int y;
    String name;

    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.x = 3;
        obj1.y = 4;
        obj1.name = "John";
        System.out.println(obj1.x + " " + obj1.y + " " + obj1.name);

        Main obj2 = new Main();
        obj2.x = 5;
        System.out.println(obj2.x);

        Main obj3 = new Main();
        obj3.name = "Nino";
        System.out.println(obj3.name);
    }

}

