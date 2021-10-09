package practise.Task_2;

public class Main {
    public static void main(String[] args) {
        Printable book = new Book();
        Printable magazine = new Magazine();
        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = magazine;
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}
