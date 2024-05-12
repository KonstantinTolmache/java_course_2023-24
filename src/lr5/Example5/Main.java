package lr5.Example5;

public class Main {
    public static void main(String[] args) {
        Task1 myexample = new Task1(21);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(15);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(125);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(-15);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set();
        System.out.println("Число = " + myexample.PrintInt());
    }
}
