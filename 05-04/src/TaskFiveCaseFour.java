/*
 * Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создайте геттеры и сеттеры для всех переменных класса Dog.
 * Создайте объект Dog
 */

public class TaskFiveCaseFour {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Бобик");
        dog.setAge(10);
    }
}

class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return age;
    }
}
