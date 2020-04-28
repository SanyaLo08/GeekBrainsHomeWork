package Lesson6_HW6;

public class Dog extends AnimalHW6 {
    /*
У каждого животного есть ограничения на действия
(бег: собака 500 м.; прыжок: собака 0.5 м.; плавание: собака 10 м.).
 */

        static int Dogs;

        public Dog() {
            Dogs++;
            setView("Кот");
        }

        /*@Override
        public void run(int runDog) {
            int maxRunDog = 500;
            if (runDog <= maxRunDog) {
                System.out.println(getName() + " смог пробежать " + runDog + " метров.");
            } else {
                System.out.println(getName() + "Это даже для меня слиЖком");
            }
        }
        @Override
        public  void swim (int swimDog){
            System.out.println (getName() + "а вот в Воду, я точно не полезу!!!");
        }
    }*/

}
