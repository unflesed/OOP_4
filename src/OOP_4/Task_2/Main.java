package OOP_4.Task_2;

import java.util.Scanner;

public class Main {
    public static String fileName;
    public static String text;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название файла с расширением:");
        fileName = sc.next();
        if (getFileExtension(fileName).equals("txt")) {
            AbstractHandler txtHandler = new TXTHandler();
            txtHandler.create();
            System.out.println("Введите имя файла, который необходимо открыть:");
            fileName = sc.next();
            txtHandler.open();
            System.out.println("Введите текст для перезаписи в файл:");
            sc.nextLine();
            text = sc.nextLine();
            txtHandler.change();
            txtHandler.save();
        }else if(getFileExtension(fileName).equals("doc")){
            AbstractHandler docHandler = new DOCHandler();
            docHandler.create();
            System.out.println("Введите имя файла, который необходимо открыть:");
            fileName = sc.next();
            docHandler.open();
            System.out.println("Введите текст для перезаписи в файл:");
            sc.nextLine();
            text = sc.nextLine();
            docHandler.change();
            docHandler.save();
        }else{
            AbstractHandler xmlHandler = new XMLHandler();
            xmlHandler.create();
            System.out.println("Введите имя файла, который необходимо открыть:");
            fileName = sc.next();
            xmlHandler.open();
            System.out.println("Введите текст для перезаписи в файл:");
            sc.nextLine();
            text = sc.nextLine();
            xmlHandler.change();
            xmlHandler.save();
        }
    }

    private static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
