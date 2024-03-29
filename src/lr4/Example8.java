package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        //Добавляем сканер
        Scanner in = new Scanner(System.in);

        //Получаем текст на вход
        System.out.println("Введите текст для шифрования:");
        String value = in.nextLine();

        //Получаем ключ для шифрования
        System.out.println("Введите ключ для шифрования:");
        int key = in.nextInt();

        //Объявляем массивы символов и вспомогательный для ключа
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования" + Arrays.toString(chars));

        //Цикл шифрования символов
        for(int i = 0; i < chars.length; i ++){
            ints[i] = chars[i] + key;
        }

        System.out.println("ints после преобразования" + Arrays.toString(ints));

        //Цикл для записи значений символов
        for(int i = 0; i < chars.length; i ++){
            chars[i] = (char) ints[i];
        }

        System.out.println("chars после преобразования" + Arrays.toString(chars));

        //Преобразуем массив символов в строку
        System.out.println(String.copyValueOf(chars));

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String reverseEnc = in.next();

        switch (reverseEnc){
            case "y", "Y":
                //Цикл обратного шифрования символов
                for(int i = 0; i < chars.length; i ++){
                    ints[i] = chars[i] - key;
                }
                //Цикл записи обратных значений символов
                for(int i = 0; i < chars.length; i ++){
                    chars[i] = (char) ints[i];
                }
                System.out.println("Результат обратного преобразования: " + String.copyValueOf(chars));
                break;
            //Цикл записи обратных значений символов
            case "n", "N":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");
        }
    }
}

//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
// При за-пуске программы в консоль необходимо вывести сообщение: «Вве-дите текст для шифрования», после ввода текста,
// появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобра-зованную строку с сообщением
// «Текст после преобразования : ». Далее необходимо задать вопрос пользователю:
// «Выполнить обрат-ное преобразование? (y/n)», если пользователь вводит «y», тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До свидания!». Если пользователь вводит
// что-то другое, отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».