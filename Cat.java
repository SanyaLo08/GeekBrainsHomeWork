package Lesson6_HW6;
/*
У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 */

public class Cat extends AnimalHW6 {
    static int cats;

    public Cat() {
        cats++;
        setView("Кот");
    }

    @Override
    public void run(int runCat) {
        int maxRunGat = 200;
        if (runCat <= maxRunGat) {
            System.out.println(getName() + " смог пробежать " + runCat + " метров.");
        } else {
            System.out.println(getName() + "Я СТОЛЬКО не пробегу, только если на Собаке) ");
        }
    }
    @Override
    public  void swim (int swimCat){
        System.out.println (getName() + "а вот в Воду, я точно не полезу, ты Шо, задание № 3 смотри!!!");
    }
}
