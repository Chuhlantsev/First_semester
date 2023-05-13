package lr5.Example5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Example5 example5 = new Example5();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();

        if (a > 100){
            System.out.println("На самом деле ваше число " + example5.setNum(100));
        } else {
            System.out.println("Ваше число " + example5.setNum(a));
        }

        Example5 newnum = new Example5(120);
        System.out.println("Ваше число снова " + newnum.getNum());
        System.out.println("Но на самом деле оно, конечно же, " + newnum.checkNum());
    }
}

//Напишите программу с классом, у которого есть закрытое целочисленное поле. Значение полю присваивается с помощью
// открытого метода. Методу аргументом может передаваться целое число, а также метод может вызываться без аргументов.
// Если методы вызывается без аргументов, то поле получает нулевое значение. Если метод вызывается с целочисленным
// аргументом, то это значение присваивается полю. Однако если переданное аргументом методу значение превышает 100,
// то значением полю присваивается число 100. Предусмотрите в классе конструктор, который работает по тому же принципу
// что и метод для присваивания значения полю. Также в классе должен быть метод, позволяющий проверить значение поля.