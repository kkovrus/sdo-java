/*
 * Помогите коту обрести имя с помощью метода setName.
 */

public class TaskFiveCaseOne {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}

class Cat {
    public String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;
    }
}