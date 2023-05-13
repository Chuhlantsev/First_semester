package lr5.Example6;

public class Main6 {
    public static void main(String[] args) {
        Example6 d = new Example6(1, 2);
        d.print();
        d.setValue(5);
        d.print();
        d.setValue(0);
        d.print();
        d = new Example6(-5);
        d.print();
        d.setValues(15, 3);
        d.print();
    }
}

//Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
// Значение поля max не может быть меньше значения поля min. Значения полям присваиваются с помощью открытого метода.
// Метод может вызываться с одним или двумя целочисленными аргументами. При вызове метода значения полям
// присваиваются так: сравниваются текущие значения полей и значения аргументов, переданных методу.
// Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
// Предусмотрите конструктор, который работает по тому же принципу, что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.