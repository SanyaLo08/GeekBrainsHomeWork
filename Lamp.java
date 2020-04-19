package Lesson5;

public class Lamp {
    private boolean isOn;
    //Функция с именем класса - это особая функция
    // которая называется конструктор (она созданет инстанс класс)
    public Lamp() {
        isOn = false;
    }
    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }
    public void on() {
        if (isOn) {
            System.out.println("Лампа УЖЕ включена! ");
        } else {
            isOn = true;
            System.out.println("Лампа включена. ");
        }
    }
    public void off() {
        if (!isOn) {
            System.out.println("Лампа УЖЕ выключена! ");
        } else {
            isOn = false;
            System.out.println("Лампа выключена. ");
        }
    }
    public boolean isOn() {
        return isOn;
    }
}