public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // задача 2
        System.out.println("задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // задача 3
        System.out.println("задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // задание 4
        System.out.println("задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // задание 5
        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

// задание 6
        System.out.println("задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var summ = weightBoxer1 + weightBoxer2;
        System.out.println(" Общий вес боксеров составил " + summ + " кг");

// задание 7
        System.out.println("задание 7");
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println(" Разница в весе боксеров составила " + difference + " кг");

        var difference2 = (weightBoxer2 % weightBoxer1);
        System.out.println(" Разница в весе боксеров составила " + difference2 + " кг");

// задание 8
        System.out.println("задание 8");
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var employee = totalHours / oneEmployeeHours;
        System.out.println(" Всего работников в компании – " + employee + " человек");

        var employee2 = employee + 94;
        var totalHours2 = employee2 * 8;
        System.out.println(" Если в компании работает " + employee2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");

    }
}