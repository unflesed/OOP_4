package OOP_4.Task_2;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static OOP_4.Task_2.Main.fileName;
import static OOP_4.Task_2.Main.text;

abstract class AbstractHandler {
    void open(){
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }
        try {
            desktop.open(new File(fileName));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    void create(){
        File file = new File(fileName);
        try {
            if(file.createNewFile()){
                System.out.println("Файл " + fileName + " успешно создан в корневой директории проекта");
            }else{
                System.out.println("Файл уже существует в директории проекта");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void change(){
        try(FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(text);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    abstract void save();
}
