package lr3;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        char[] chars = new char[10]; //Создание основного массива с буквами

        //Наполнение массива буквами
        for (int i = 0; i < chars.length; i+=2) {
            for (char ch = 'B'; ch <= 'Z'; ch++) {
                if ((ch == 'E') | (ch == 'I') | (ch == 'O') | (ch == 'U') | (ch == 'Y')) {} //Ничего не делаем, если буква гласная
                else {
                    chars[i] = ch;
                    i++;
                    if (i == chars.length) {break;}
                }
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}

//Напишите программу, в которой создается символьный массив из
//10 элементов. Массив заполнить большими (прописными) буквами
//английского алфавита. Буквы берутся подряд, но только согласные (то есть
//гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//нужно пропустить). Отобразите содержимое созданного массива в консольном окне.