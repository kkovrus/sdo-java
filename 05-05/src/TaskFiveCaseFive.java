/*
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 * Вывести объекты на экран.
 *
 * Примечание:
 * Если написать свой метод String toString() в классе Human,
 * то именно он будет использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * ...
 */

public class TaskFiveCaseFive {
    public static void main(String[] args) {
        Human granddad1 = new Human("Михаил", true, 80, null, null);
        Human granny1 = new Human("Мария", false, 60, null, null);
        Human granddad2 = new Human("Иван", true, 74, null, null);
        Human granny2 = new Human("Анастасия", false, 63, null, null);
        Human father = new Human("Павел", true, 41, granddad1, granny1);
        Human mother = new Human("Катя", false, 35, granddad2, granny2);
        Human children1 = new Human("Аня", false, 21, father, mother);
        Human children2 = new Human("Катя", false, 18, father, mother);
        Human children3 = new Human("Игорь", true, 2, father, mother);
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(granddad1.toString());
        System.out.println(granny1.toString());
        System.out.println(granddad2.toString());
        System.out.println(granny2.toString());
    }

    private static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        private Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
