package lr6.Task1;

public class Main1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.set('A');
        task.set("B");
        char[] charArray1 = {'W', 'o', 'r', 'd'};
        char[] charArray2 = {'C'};
        task.set(charArray1);
        task.set(charArray2);
    }
}

//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
// В классе должен быть перегруженный метод для присваивания значений полям. Если метод вызывается с символьным
// аргументом, то соответствующее значение присваивается символьному полю. Если метод вызывается с текстовым
// аргументом, то он определяет значение текстового ноля. Методу аргументом также может передаваться символьный массив.
// Если массив состоит из одного элемента, то он определяет значение символьного поля. В противном случае
// (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением
// текстовому полю.