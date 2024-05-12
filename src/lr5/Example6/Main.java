package lr5.Example6;

public class Main {
    public static void main(String[] args) {
        Task1 myexample = new Task1(2, 5);
        myexample.PrintInt();
        //конструктор с 1-м аргументом
        Task1 myexample1= new Task1(1);
        myexample1.PrintInt();
        //метод с 2-я аргументами
        myexample.SetInt(3, 15);
        myexample.PrintInt();
        //метод с 1-м аргументом
        myexample.SetInt(-9);
        myexample.PrintInt();
    }
}
