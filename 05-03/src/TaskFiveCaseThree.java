/*
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 * Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
 * Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
 * Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
 * если cat1.fight(cat2) возвращает true,
 * то cat2.fight(cat1) должен возвращать false.
 */

public class TaskFiveCaseThree {
    public static void main(String[] args) {
        Cat cat1 = new Cat(9, 6, 10);
        Cat cat2 = new Cat(9, 6, 10);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}

class Cat {
    int age;
    int weight;
    int strength;
    boolean check;


    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    // Выигрывают комбинации - моложе возраст, меньше вес, больше сила. Ничья - true.
    public boolean fight(Cat anotherCat) {
        int CatRating = 0;
        boolean result = false;

        if (this.check && anotherCat.check) {
            result = false;
        } else {
            if (this.age < anotherCat.age) {
                CatRating ++;
            }
            if (this.age > anotherCat.age) {
                CatRating --;
            }
            if (this.weight < anotherCat.weight) {
                CatRating ++;
            }
            if (this.weight > anotherCat.weight) {
                CatRating --;
            }
            if (this.strength > anotherCat.strength) {
                CatRating ++;
            }
            if (this.strength < anotherCat.strength) {
                CatRating --;
            }
            result = CatRating >= 0;
            this.check = result;
            anotherCat.check = result;
        }
        return result;
    }
}
