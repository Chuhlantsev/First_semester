package lr5.Example4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Example4 example4 = new Example4(65.1267);
        System.out.println(example4.getCh1());
        System.out.println(example4.getNum());
    }
}

//Напишите программу с классом, у которого есть символьное и целочисленное поле.
// В классе должны быть описаны версии конструктора с двумя аргументами
// (целое число и символ – определяют значения полей), а также с одним аргументом типа double.
// В последнем случае действительная часть аргумента определяет код символа (значение символьного поля),
// а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля.
// Например, если аргументом передается число 65.1267, то значением символьного поля будет символ ‘A’ с годом 65,
// а целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).